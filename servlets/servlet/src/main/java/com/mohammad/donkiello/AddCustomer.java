/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohammad.donkiello;

import com.donkiello.model.entity.base.BaseEntity;
import com.donkiello.model.entity.common.*;
import com.donkiello.model.service.common.inter.IDonCustomerService;
import com.donkiello.model.service.common.inter.IDonPastService;
import com.donkiello.model.service.common.inter.IDonPersonalService;
import com.donkiello.model.service.common.inter.IDonProgramService;
import com.donkiello.utility.JSFUtils;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

import java.math.BigInteger;
import java.util.Collection;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Keyvan Sasani
 */
@ManagedBean(name = "addCustomer")
@ViewScoped
public class AddCustomer implements Serializable {

    private DonCustomer customer;
    private List<DonPersonal> listPersonal;
    private List<DonBussiness> listBussiness;
    private List<DonPast> listPast = null;
    private List<DonPast> templistPast = null;
    private List<DonPast> deletedListPast = null;
    private List<DonProgram> listIdaq = null;
   // private List<DonProgram> templistIdaq = null;


    private List<DonBussiness> bussinessesList;


    private Collection<DonProgram> templistIdaq = null;
    private List<DonProgram> deletedListIdaq = null;
    private DonPersonal personal;
    private DonBussiness bussiness;
    private DonPast pastEdu;
    private int activeIndex, selectedIndex;
    private IDonCustomerService customerService;
    private String rashtiSex = "Male";
    private String tempDate = "";
    private File passScan;
    private boolean passScanAvailable;
    private boolean birthCertScanAvailable;
    private boolean PhotoScanAvailable;
    private IDonPastService donPastService;
    private IDonProgramService donProgramService;
    private IDonPersonalService donPersonalService;
    private UploadedFile pfile, pfile2, pfile3;
    private String tmpFirstPayment;

    private StreamedContent passImage, birthCertScan, photoScan;

    @EJB
    public void setCustomerService(IDonCustomerService iDonCustomerService){
        this.customerService = iDonCustomerService;
    }

    @EJB
    public void setDonPastService(IDonPastService iDonPastService){
        this.donPastService = iDonPastService;
    }

    @EJB
    public void setDonProgramService(IDonProgramService iDonProgramService){
        this.donProgramService = iDonProgramService;
    }

    @EJB
    public void setDonPersonalService(IDonPersonalService iDonPersonalServiceo){
        this.donPersonalService = iDonPersonalServiceo;
    }




  /*  private IDonCustomerService getService() {
        return customerService = (IDonCustomerService) JndiUtils.getModelEjb("DonCustomerService");
    }*/

   /* public AddCustomer() {
        donPastService = (IDonPastService) JndiUtils.getModelEjb("DonPastService");
        donProgramService = (IDonProgramService) JndiUtils.getModelEjb("DonProgramService");
        donPersonalService = (IDonPersonalService) JndiUtils.getModelEjb("DonPersonalService");
    }*/

    public void initialize() {
        passScanAvailable = false;
        birthCertScanAvailable = false;
        PhotoScanAvailable = false;
        if(null!=JSFUtils.getFromRequestParameter("add")&&JSFUtils.getFromRequestParameter("add").equalsIgnoreCase("true")){
            JSFUtils.removeFromSession("selectedCustomer");
        }
        
        if (null == listPast) {
            listBussiness = new ArrayList<DonBussiness>();
            listPast = new ArrayList<DonPast>();
            listPersonal = new ArrayList<DonPersonal>();
            listIdaq = new ArrayList<DonProgram>();
        }
       // getService();
        customer = (DonCustomer) JSFUtils.getFromSession("selectedCustomer");
        if (customer != null) {
            if (null != customer.getCustomerImage()) {
                PhotoScanAvailable = true;
            }
            if (null != customer.getDonPersonalsByCustomerId() && null != customer.getDonProgramsByCustomerId()) {
                personal = customer.getDonPersonalsByCustomerId().iterator().next();
               // bussiness = customer.getDonBussinessesByCustomerId().get(0);
                bussinessesList = new ArrayList<DonBussiness>(customer.getDonBussinessesByCustomerId());
                templistPast = new ArrayList<DonPast>(customer.getDonPastsByCustomerId());
                templistIdaq = customer.getDonProgramsByCustomerId();
                //loading Photos
                if (null != personal.getPersonalPassportScan()) {
                    passScanAvailable = true;
                }
                if (null != personal.getPersonalBirthCertScan()) {
                    birthCertScanAvailable = true;
                }

                if (null != templistPast) {
                    for (DonPast p : templistPast) {
                        if (p.getPastDeleted().equals(1)) {
                            listPast.add(p);
                        }
                    }
                }
                if (null != templistIdaq) {
                    for (DonProgram p : templistIdaq) {
                        if (p.getProgramDeleted().equals(0)) {
                            listIdaq.add(p);
                        }
                    }
                }
                if (customer.getDonPersonalsByCustomerId().iterator().next().getPersonalBirthday() != null) {
                    tempDate = customer.getDonPersonalsByCustomerId().iterator().next().getPersonalBirthday().toString();
                }

                if (customer.getDonPersonalsByCustomerId().iterator().next().getPersonalGender().equals(1)){
                    rashtiSex = "Male";
                } else {
                    rashtiSex = "Female";
                }
            }
        } else {
            customer = new DonCustomer();
            bussiness = new DonBussiness();
            personal = new DonPersonal();
            pastEdu = new DonPast();

        }
    }

    public void onRowEdit(RowEditEvent event) {
    }

    public void onRowCancel(RowEditEvent event) {
    }

    public void handleFileUpload1(FileUploadEvent event) {

        this.pfile = event.getFile();
        byte[] myfile = new byte[pfile.getContents().length];
        System.arraycopy(pfile.getContents(), 0, myfile, 0, pfile.getContents().length);
        personal.setPersonalPassportScan(myfile);
        donPersonalService.insertImage(myfile, personal.getPersonalId(), true);
        this.passScanAvailable = true;
    }

    public void handleFileUpload2(FileUploadEvent event) {
        this.pfile2 = event.getFile();
        byte[] myfile = new byte[pfile2.getContents().length];
        System.arraycopy(pfile2.getContents(), 0, myfile, 0, pfile2.getContents().length);
        personal.setPersonalBirthCertScan(myfile);
        donPersonalService.insertImage(myfile, personal.getPersonalId(), false);
        this.birthCertScanAvailable = true;
    }

    public void handleFileUpload3(FileUploadEvent event) {
        this.pfile3 = event.getFile();
        byte[] myfile = new byte[pfile3.getContents().length];
        System.arraycopy(pfile3.getContents(), 0, myfile, 0, pfile3.getContents().length);
        customer.setCustomerImage(myfile);
        customerService.insertPhoto(myfile, customer.getCustomerId());
        this.PhotoScanAvailable = true;
    }

    public void removeImage1() {
        this.passScanAvailable = false;
        personal.setPersonalPassportScan(null);
    }

    public void removeImage2() {
        this.birthCertScanAvailable = false;
        personal.setPersonalBirthCertScan(null);
    }

    public void removeImage3() {
        this.PhotoScanAvailable = false;
        customer.setCustomerImage(null);
    }

    public void addPast() {
        DonPast t = new DonPast();
        t.setCustomerId(customer.getCustomerId());
        t.setPastDeleted(0);
        listPast.add(t);
    }

    public void addIdaq() {
        DonProgram t = new DonProgram();
        t.setCustomerId(customer.getCustomerId());
        t.setProgramDeleted(0);
        listIdaq.add(t);
    }

    public void deletePastRow(DonPast p) {
        if (null == deletedListPast) {
            deletedListPast = new ArrayList<DonPast>();
        }
        p.setPastDeleted(1);
        deletedListPast.add(p);
        listPast.remove(p);

    }

    public void deleteIdaqRow(DonProgram p) {
        if (null == deletedListIdaq) {
            deletedListIdaq = new ArrayList<DonProgram>();
        }
        p.setProgramDeleted(1);
        deletedListIdaq.add(p);
        listIdaq.remove(p);
    }

    public String addPastInfo() {
        return "";
    }

    public String addIdaqInfo() {
        return "";
    }

    public String addNewBussiness() {
        return "";
    }

    public String commitCustomer() {

        if (customer.getCustomerImage() == null) {
        }
        if (rashtiSex.equalsIgnoreCase("Male")) {
            personal.setPersonalGender(BigInteger.valueOf(1));
        } else {
            personal.setPersonalGender(BigInteger.valueOf(0));
        }

        /// adding father to childs
        for (DonPast p : listPast) {
            if (null == p.getCustomerId() && null == p.getPastDeleted()) {
                p.setPastDeleted(0);
                p.setCustomerId(customer.getCustomerId());
            }
        }
        if (null != deletedListPast) {
            for (DonPast p : deletedListPast) {
                donPastService.remove(p);
            }
        }
        for (DonProgram p : listIdaq) {
            if (null == p.getCustomerId() && null == p.getProgramDeleted()) {
                p.setProgramDeleted(0);
                p.setCustomerId(customer.getCustomerId());
            }
        }
        if (null != deletedListIdaq) {
            for (DonProgram p : deletedListIdaq) {
                donProgramService.remove(p);
            }
        }

        bussiness.setCustomerId(customer.getCustomerId());
        personal.setCustomerId(customer.getCustomerId());
        personal.setPersonalDeleted(0);
        bussiness.setBusinessDeleted(0);
        listBussiness.add(bussiness);
        listPersonal.add(personal);
        customer.setDonBussinessesByCustomerId(listBussiness);
        customer.setDonPersonalsByCustomerId(listPersonal);
        customer.setDonProgramsByCustomerId(listIdaq);
        customer.setDonPastsByCustomerId(listPast);
        customer.setCustomerDeleted(0);
        customer.setCustomerName(personal.getPersonalNameEn() + " " + personal.getPersonalFamilyNameEn());
        customer.setCustomerMobileNo(personal.getPersonalMobileNum());
        customer.setCustomerBusinessName(bussiness.getBusinessName());
        customer.setCustomerPrograms(managePrograms(listIdaq));
        customer.setCustomerPaymentStatus(managePayment(listIdaq));
        customerService.update(customer);
        if (customer.getCustomerImage() == null) {
        }
        return "firstPage?faces-redirect=true";
    }

    public String cancelCustomer() {
        return "firstPage?faces-redirect=true";
    }

    public String managePrograms(List<DonProgram> programList) {
        String s = "";
        int i = 0;
        for (DonProgram p : programList) {
            if (null != p.getProgramProgramName()) {
                if (i == 0) {
                    s += p.getProgramProgramName();
                } else {
                    s += " - " + p.getProgramProgramName();
                }
            }
            i++;
        }
        return s;
    }
    
    public String managePayment(List<DonProgram> programList) {
        String payment = "";
        boolean isPaid=true;
        for (DonProgram p : programList) {
            if (null != p.getProgramFirstPayment()) {
                if(p.getProgramFirstPayment().equalsIgnoreCase("not Paid")||p.getProgramSecondPayment().equalsIgnoreCase("not Paid")){
                    isPaid=false;
                    break;
                }
            }
        }
        if (isPaid)
            payment="paid up";
        else
            payment="on debt";
        return payment;
    }
    
    ///Setters And Getters
    public DonCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(DonCustomer customer) {
        this.customer = customer;
    }

    public DonPersonal getPersonal() {
        return personal;
    }

    public void setPersonal(DonPersonal personal) {
        this.personal = personal;
    }

    public DonBussiness getBussiness() {
        return bussiness;
    }

    public void setBussiness(DonBussiness bussiness) {
        this.bussiness = bussiness;
    }

    public DonPast getPastEdu() {
        return pastEdu;
    }

    public void setPastEdu(DonPast pastEdu) {
        this.pastEdu = pastEdu;
    }

    public String getRashtiSex() {
        return rashtiSex;
    }

    public void setRashtiSex(String rashtiSex) {
        this.rashtiSex = rashtiSex;
    }

    public String getTempDate() {
        return tempDate;
    }

    public void setTempDate(String tempDate) {

        this.tempDate = tempDate;
    }

    public File getPassScan() {
        return passScan;
    }

    public void setPassScan(File passScan) {
        this.passScan = passScan;

    }

    public int getSelectedIndex() {
        return selectedIndex;
    }

    public void setSelectedIndex(int selectedIndex) {
        this.selectedIndex = selectedIndex;
    }

    public int getActiveIndex() {
        return activeIndex;
    }

    public void setActiveIndex(int activeIndex) {
        this.activeIndex = activeIndex;
    }

    public List<DonPast> getListPast() {
        return listPast;
    }

    public void setListPast(List<DonPast> listPast) {
        this.listPast = listPast;
    }

    public List<DonProgram> getListIdaq() {
        return listIdaq;
    }

    public void setListIdaq(List<DonProgram> listIdaq) {
        this.listIdaq = listIdaq;
    }

    public boolean isPassScanAvailable() {
        return passScanAvailable;
    }

    public void setPassScanAvailable(boolean passScanAvailable) {
        this.passScanAvailable = passScanAvailable;
    }

    public boolean isBirthCertScanAvailable() {
        return birthCertScanAvailable;
    }

    public void setBirthCertScanAvailable(boolean birthCertScanAvailable) {
        this.birthCertScanAvailable = birthCertScanAvailable;
    }

    public boolean isPhotoScanAvailable() {
        return PhotoScanAvailable;
    }

    public void setPhotoScanAvailable(boolean PhotoScanAvailable) {
        this.PhotoScanAvailable = PhotoScanAvailable;
    }

    public UploadedFile getPfile() {
        return pfile;
    }

    public void setPfile(UploadedFile pfile) {
        this.pfile = pfile;
    }

    public UploadedFile getPfile2() {
        return pfile2;
    }

    public void setPfile2(UploadedFile pfile2) {
        this.pfile2 = pfile2;
    }

    public UploadedFile getPfile3() {
        return pfile3;
    }

    public void setPfile3(UploadedFile pfile3) {
        this.pfile3 = pfile3;
    }

    public StreamedContent getPassImage() {

        if (null == this.passImage) {
            InputStream is = new ByteArrayInputStream(personal.getPersonalPassportScan());
            passImage = new DefaultStreamedContent(is);

        }
        return passImage;
    }

    public void setPassImage(StreamedContent passImage) {
        this.passImage = passImage;
    }

    public StreamedContent getBirthCertScan() {
        if (null == this.birthCertScan) {
            InputStream is = new ByteArrayInputStream(personal.getPersonalBirthCertScan());
            birthCertScan = new DefaultStreamedContent(is);
        }
        return birthCertScan;
    }

    public void setBirthCertScan(StreamedContent birthCertScan) {
        this.birthCertScan = birthCertScan;
    }

    public StreamedContent getPhotoScan() {
        if (null == this.photoScan) {
            InputStream is = new ByteArrayInputStream(customer.getCustomerImage());
            photoScan = new DefaultStreamedContent(is);
        }

        return photoScan;
    }

    public void setPhotoScan(StreamedContent photoScan) {
        this.photoScan = photoScan;
    }

    public List<DonBussiness> getBussinessesList() {
        return bussinessesList;
    }

    public void setBussinessesList(List<DonBussiness> bussinessesList) {
        bussinessesList = bussinessesList;
    }
}
