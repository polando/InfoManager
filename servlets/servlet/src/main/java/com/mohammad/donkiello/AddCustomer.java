/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohammad.donkiello;

import com.donkiello.dto.*;
import com.donkiello.model.entity.common.*;
import com.donkiello.model.service.common.impl.*;
import com.donkiello.utility.JSFUtils;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

import java.math.BigInteger;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@ManagedBean(name = "addCustomer")
@ViewScoped
public class AddCustomer implements Serializable {

    private DonCustomerDTO customer;
    private List<DonPersonalDTO> listPersonal;
    private List<DonBussinessDTO> listBusiness;

    private List<DonPastDTO> listPast = null;
    private List<DonPastDTO> deletedListPast = null;
    private List<DonProgramDTO> listIdaq = null;
    private List<DonProgramDTO> deletedListIdaq = null;

    private DonCustomerDTO selectedCustomer;
    private DonPersonalDTO personal;
    private DonBussinessDTO bussiness;
    private DonPastDTO pastEdu;

    private int activeIndex, selectedIndex;


    private String gender = "Male";
    private String tempDate = "";
    private File passScan;

    private boolean passScanAvailable;
    private boolean birthCertScanAvailable;
    private boolean PhotoScanAvailable;


    private DonCustomerService customerService;
    private DonPastService donPastService;
    private DonProgramService donProgramService;
    private DonPersonalService donPersonalService;
    private DonBussinessService donBussinessService;

    private UploadedFile pfile, pfile2, pfile3;
    private String tmpFirstPayment;


    private StreamedContent passImage, birthCertScan, photoScan;

    @EJB
    public void setCustomerService(DonCustomerService iDonCustomerService){
        this.customerService = iDonCustomerService;
    }

    @EJB
    public void setDonPastService(DonPastService iDonPastService){
        this.donPastService = iDonPastService;
    }

    @EJB
    public void setDonProgramService(DonProgramService iDonProgramService){
        this.donProgramService = iDonProgramService;
    }

    @EJB
    public void setDonPersonalService(DonPersonalService iDonPersonalServiceo){
        this.donPersonalService = iDonPersonalServiceo;
    }

    @EJB
    public void setDonBussinessService(DonBussinessService iDonBussinessService){
        this.donBussinessService = iDonBussinessService;
    }



//    @Inject
//    private CustomerManager customerManager;

//    public CustomerManager getCustomerManager() {
//        return customerManager;
//    }
//
//    public void setCustomerManager(CustomerManager customerManager) {
//        this.customerManager = customerManager;
//    }

    public void initialize() {
     //   customer = customerManager.getCurrentselectedDTO();

       // customer =(DonCustomerDTO) JSFUtils.getFromSession("selectedCustomer");

        if (customer !=null){
            passScanAvailable = false;
            birthCertScanAvailable = false;
            PhotoScanAvailable = false;
       /* if(null!=JSFUtils.getFromRequestParameter("add")&&JSFUtils.getFromRequestParameter("add").equalsIgnoreCase("true")){
            JSFUtils.removeFromSession("selectedCustomer");

        }*/

            //    JSFUtils.removeFromSession("selectedCustomer");

            if (null == listPast) {
                listBusiness = new ArrayList<DonBussinessDTO>();
                listPast = new ArrayList<DonPastDTO>();
                listPersonal = new ArrayList<DonPersonalDTO>();
                listIdaq = new ArrayList<DonProgramDTO>();
            }

            // getService();

            // JSFUtils.removeFromSession("selectedCustomer");
            if (customer != null) {
                if (null != customer.getCustomerImage()) {
                    PhotoScanAvailable = true;
                }
                if (null != customer.getDonPersonalsByCustomerId() && null != customer.getDonProgramsByCustomerId()) {



                    listPast = customerService.getNotDeletedPasts(customer.getCustomerId());
                    listIdaq = customerService.getNotDeletedPrograms(customer.getCustomerId());
                    listBusiness = customerService.getCustomerBusinessInfo(customer.getCustomerId());
                    listPersonal =  customerService.getCustomerPersonalInfo(customer.getCustomerId());


                    if(listPersonal != null && listPersonal.size() > 0) {
                        //loading Photos
                        personal = listPersonal.get(0);
                        if (null != personal.getPersonalPassportScan()) {
                            passScanAvailable = true;
                        }
                        if (null != personal.getPersonalBirthCertScan()) {
                            birthCertScanAvailable = true;
                        }

                        if (personal.getPersonalGender().equals(1)) {
                            gender = "Male";
                        } else {
                            gender = "Female";
                        }
                    }

                }



            } else {
                customer = new DonCustomerDTO();
                bussiness = new DonBussinessDTO();
                personal = new DonPersonalDTO();
                pastEdu = new DonPastDTO();

            }
        }
    }

    public DonCustomerDTO getSelectedCustomer() {
        return selectedCustomer;
    }

    public void setSelectedCustomer(DonCustomerDTO selectedCustomer) {
        this.selectedCustomer = selectedCustomer;
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
        DonPastDTO t = new DonPastDTO();
        t.setDonCustomerByCustomerIdInPast(customer);
        t.setPastDeleted(0);
        listPast.add(t);
    }

    public void addIdaq() {
        DonProgramDTO t = new DonProgramDTO();
        t.setDonCustomerByCustomerIdInProgram(customer);
        t.setProgramDeleted(0);
        listIdaq.add(t);
    }

    public void deletePastRow(DonPastDTO p) {
        if (null == deletedListPast) {
            deletedListPast = new ArrayList<DonPastDTO>();
        }
        p.setPastDeleted(1);
        deletedListPast.add(p);
        listPast.remove(p);

    }

    public void deleteIdaqRow(DonProgramDTO p) {
        if (null == deletedListIdaq) {
            deletedListIdaq = new ArrayList<DonProgramDTO>();
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


        if (gender.equalsIgnoreCase("Male")) {
            personal.setPersonalGender(BigInteger.valueOf(1));
        } else {
            personal.setPersonalGender(BigInteger.valueOf(0));
        }

        /// adding father to childs
        for (DonPastDTO p : listPast) {
            if (null == p.getDonCustomerByCustomerIdInPast() && null == p.getPastDeleted()) {
                p.setPastDeleted(0);
                p.setDonCustomerByCustomerIdInPast(customer);
            }
        }

        if (null != deletedListPast) {
            for (DonPastDTO p : deletedListPast) {
                donPastService.remove(p);
            }
        }

        for (DonProgramDTO p : listIdaq) {
            if (null == p.getDonCustomerByCustomerIdInProgram()&& null == p.getProgramDeleted()) {
                p.setProgramDeleted(0);
                p.setDonCustomerByCustomerIdInProgram(customer);
            }
        }
        if (null != deletedListIdaq) {
            for (DonProgramDTO p : deletedListIdaq) {
                donProgramService.remove(p);
            }
        }

        for (DonBussinessDTO p:listBusiness) {
            p.setDonCustomerByCustomerIdInBusiness(customer);
            p.setBusinessDeleted(0);
        }

        for (DonPersonalDTO p:listPersonal) {
            p.setDonCustomerByCustomerIdInPersonal(customer);
            p.setPersonalDeleted(0);
        }



        customer.setDonPersonalsByCustomerId(listPersonal);
        customer.setDonBussinessesByCustomerId(listBusiness);
        customer.setDonProgramsByCustomerId(listIdaq);
        customer.setDonPastsByCustomerId(listPast);


        personal.setPersonalDeleted(0);
        customer.setCustomerDeleted(0);
        customer.setCustomerName(personal.getPersonalNameEn() + " " + personal.getPersonalFamilyNameEn());
        customer.setCustomerPrograms(managePrograms(listIdaq));
        customer.setCustomerPaymentStatus(managePayment(listIdaq));

        customerService.update(customer);

        for (DonBussinessDTO p: listBusiness) {
            donBussinessService.update(p);
        }

        for (DonPersonalDTO p: listPersonal) {
            donPersonalService.update(p);
        }

        for (DonProgramDTO p: listIdaq) {
            donProgramService.update(p);
        }

        for (DonPastDTO p: listPast) {
            donPastService.update(p);
        }




        if (customer.getCustomerImage() == null) {
        }
        return "firstPage?faces-redirect=true";
    }

    public String cancelCustomer() {
        return "firstPage?faces-redirect=true";
    }

    public String managePrograms(List<DonProgramDTO> programList) {
        String s = "";
        int i = 0;
        for (DonProgramDTO p : programList) {
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
    
    public String managePayment(List<DonProgramDTO> programList) {
        String payment = "";
        boolean isPaid=true;
        for (DonProgramDTO p : programList) {
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
    public DonCustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(DonCustomerDTO customer) {
        this.customer = customer;
    }

    public DonPersonalDTO getPersonal() {
          return personal;
    }

    public void setPersonal(DonPersonalDTO personal) {
        this.personal = personal;
    }

    public DonBussinessDTO getBussiness() {
        return bussiness;
    }

    public void setBussiness(DonBussinessDTO bussiness) {
        this.bussiness = bussiness;
    }

    public DonPastDTO getPastEdu() {
        return pastEdu;
    }

    public void setPastEdu(DonPastDTO pastEdu) {
        this.pastEdu = pastEdu;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

   /* public String getTempDate() {
        return tempDate;
    }*/

   /* public void setTempDate(String tempDate) {

        this.tempDate = tempDate;
    }*/

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

    public List<DonPastDTO> getListPast() {
        return listPast;
    }

    public void setListPast(List<DonPastDTO> listPast) {
        this.listPast = listPast;
    }

    public List<DonProgramDTO> getListIdaq() {
        return listIdaq;
    }

    public void setListIdaq(List<DonProgramDTO> listIdaq) {
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

    public List<DonBussinessDTO> getListBusiness() {
        return listBusiness;
    }

    public void setListBusiness(List<DonBussinessDTO> listBusiness) {
        this.listBusiness = listBusiness;
    }
}
