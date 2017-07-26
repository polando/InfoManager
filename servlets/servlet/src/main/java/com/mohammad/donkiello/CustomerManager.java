/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohammad.donkiello;

import com.donkiello.dto.*;
import com.donkiello.model.entity.common.*;
import com.donkiello.model.service.common.impl.DonCustomerService;
import com.donkiello.utility.JSFUtils;
import com.sparkpost.Client;
import com.sparkpost.model.AddressAttributes;
import com.sparkpost.model.RecipientAttributes;
import com.sparkpost.model.TemplateContentAttributes;
import com.sparkpost.model.TransmissionWithRecipientArray;
import com.sparkpost.model.responses.Response;
import com.sparkpost.resources.ResourceTransmissions;
import com.sparkpost.transport.RestConnection;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
//
//import org.glassfish.jersey.client.ClientResponse;
//import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;


import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

//import javax.ws.rs.client.Client;
//import javax.ws.rs.client.ClientBuilder;
//import javax.ws.rs.client.Entity;
//import javax.ws.rs.client.WebTarget;
//import javax.ws.rs.core.Form;
//import javax.ws.rs.core.MediaType;
import java.io.*;
import java.util.*;


//import com.sun.jersey.api.client.ClientResponse;
//import com.sun.jersey.api.client.WebResource;
//import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
//import com.sun.jersey.core.util.MultivaluedMapImpl;

//
//import java.io.*;
//import java.net.InetAddress;
//import java.util.Properties;
//import java.util.Date;
//
//import javax.mail.*;
//
//import javax.mail.internet.*;
//
//import com.sun.mail.smtp.*;

import com.sparkpost.exception.SparkPostException;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;


@ManagedBean(name = "customerManager")
@SessionScoped
public class CustomerManager implements Serializable {

    private DonCustomerDTO selectedCustomer;
    private List<DonCustomerDTO> customerList, filteredCustomers;
    private DonUsers onlineUser;
    private DonCustomerService customerService;
    private String[] programms;
    private DonCustomerDTO toDeleteCustomer;

    private DonCustomerDTO currentselectedDTO;

    private UploadedFile pfile;
    private String MailSubject;
    private String MailSender;


    private String mailTemplate;

    @EJB
   public void setCustomerService(DonCustomerService customerService){
        this.customerService=customerService;
    }


    public CustomerManager() {}

//    @PostConstruct
    public void init(){
        customerList = customerService.getAll();
        programms = new String[2];
        programms[0] = "MBA";
        programms[1] = "DBA";
    }

    public void DoPrint() {
        if (filteredCustomers == null) {
            ExcelOutput.wrtiteData(customerList);
        } else {
            ExcelOutput.wrtiteData(filteredCustomers);
        }
    }


//    public void merge()
//    {
//        for (DonCustomerDTO d: customerList) {
//            if(d.getFirstPersonal().getPersonalFirstNameFa() != null && d.getFirstPersonal().getPersonalFamilyNameFa() != null)
//                d.setCustomerNameFA(d.getFirstPersonal().getPersonalFirstNameFa() + " " + d.getFirstPersonal().getPersonalFamilyNameFa());
//            else {
//                d.setCustomerNameFA("");
//            }
//
//            customerService.update(d);
//        }
//
//    }


//    public void sendSimple() throws SparkPostException  {
//        String API_KEY = "52507e26675ea5d6771081657aa52ead41245b19";
//        Client client = new Client(API_KEY);
//
//        client.sendMessage(
//                "milad.ghasemi@idaqinstitute.de",
//                "cpt.m.qasemi@gmail.com",
//                "The subject of the message",
//                "The text part of the email",
//                "<b>The HTML part of the email</b>");
//    }


//////////////

    /////////////////////
//    public void handleFileUpload1(FileUploadEvent event) {
//        InputStream input = null;
//        StringWriter writer = new StringWriter();
//        try{
//             this.pfile = event.getFile();
//             input = pfile.getInputstream();
//        }
//        catch(IOException ex){
//            System.out.println (ex.toString());
//        }
//
//        try {
//            IOUtils.copy(input, writer, "UTF-8");
//            FacesContext.getCurrentInstance().addMessage("messages",new FacesMessage(FacesMessage.SEVERITY_INFO,"Your Photo (File Name "+ pfile.getFileName()+ " with size "+ pfile.getSize()+ ")  Uploaded Successfully", ""));
//        }
//        catch(IOException ex){
//            System.out.println (ex.toString());
//        }
//
//        mailTemplate = writer.toString();
//    }

    public String removeRow() {
        DonCustomerDTO selectedCustomer1 = null;

        if (toDeleteCustomer != null) {
            selectedCustomer1 = customerService.searchById(toDeleteCustomer.getCustomerId());
            String temp = toDeleteCustomer.getCustomerNameEN();
            
            //cascading remove
            if(selectedCustomer1.getDonPersonalsByCustomerId()!=null)
                for( DonPersonalDTO p : toDeleteCustomer.getDonPersonalsByCustomerId())
                    p.setPersonalDeleted(1);
            if(selectedCustomer1.getDonBusinessesByCustomerId()!=null)
                for( DonBussinessDTO p : toDeleteCustomer.getDonBusinessesByCustomerId())
                    p.setBusinessDeleted(1);
            if(selectedCustomer1.getDonPastsByCustomerId()!=null)
                for( DonPastDTO p : toDeleteCustomer.getDonPastsByCustomerId())
                    p.setPastDeleted(1);
            if(selectedCustomer1.getDonProgramsByCustomerId()!=null)
                for( DonProgramDTO p : toDeleteCustomer.getDonProgramsByCustomerId())
                    p.setProgramDeleted(1);
            customerService.remove(toDeleteCustomer);
            customerList.remove(toDeleteCustomer);
            
           // JSFUtils.addFacesInfoMessage(temp + " removed from customers!");
            FacesContext.getCurrentInstance().addMessage("messages",new FacesMessage(FacesMessage.SEVERITY_INFO,temp+" is removed successfully ", ""));

        }
        return "";  
    }
    
     public void postProcessXLS(Object document) {
		HSSFWorkbook wb = (HSSFWorkbook) document;
		HSSFSheet sheet = wb.getSheetAt(0);
		HSSFRow header = sheet.getRow(0);
		HSSFCellStyle cellStyle = wb.createCellStyle();
		cellStyle.setFillForegroundColor(HSSFColor.ORANGE.index);
		cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                for(int i=0; i < header.getPhysicalNumberOfCells();i++) {
			HSSFCell cell = header.getCell(i);
			cell.setCellStyle(cellStyle);
		}
	}

    public void viewCustomer(DonCustomerDTO selectedCustomerDTO) {
        //DTO to entity
     /*   DonCustomer selectedCustomer= new DonCustomer();
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        MapperFacade mapper = mapperFactory.getMapperFacade();
        mapper.map(selectedCustomerDTO,selectedCustomer);*/
        

       // addCustomer.initialize();
        
      /*  try {
            return "addCustomerPage?faces-redirect=true";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return "";
        }*/

    }

    public String addCustomer() {
        return "addCustomerPage?faces-redirect=true&amp;add=true&amp;";
    }

   /* private IDonCustomerService getCustomerService() {
        return (IDonCustomerService) JndiUtils.getModelEjb("DonCustomerService");
    }*/

    public DonCustomerDTO getSelectedCustomer() {
        return selectedCustomer;
    }

    public void setSelectedCustomer(DonCustomerDTO selectedCustomer) {
        this.selectedCustomer = selectedCustomer;
    }

    public List<DonCustomerDTO> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<DonCustomerDTO> customerList) {
        this.customerList = customerList;
    }

    public List<DonCustomerDTO> getFilteredCustomers() {
        return filteredCustomers;
    }

    public void setFilteredCustomers(List<DonCustomerDTO> filteredCustomers) {
        this.filteredCustomers = filteredCustomers;
    }

    public DonUsers getOnlineUser() {
        return onlineUser;
    }

    public void setOnlineUser(DonUsers onlineUser) {
        this.onlineUser = onlineUser;
    }

    public String[] getProgramms() {
        return programms;
    }

    public void setProgramms(String[] programms) {
        this.programms = programms;
    }

    public DonCustomerDTO getCurrentselectedDTO() {
        return currentselectedDTO;
    }

    public void setCurrentselectedDTO(DonCustomerDTO currentselectedDTO) {
        this.currentselectedDTO = currentselectedDTO;
    }

    public DonCustomerDTO getToDeleteCustomer() {
        return toDeleteCustomer;
    }

    public void setToDeleteCustomer(DonCustomerDTO toDeleteCustomer) {
        this.toDeleteCustomer = toDeleteCustomer;
    }

    public UploadedFile getPfile() {
        return pfile;
    }

    public void setPfile(UploadedFile pfile) {
        this.pfile = pfile;
    }

    public String getMailSubject() {
        return MailSubject;
    }

    public void setMailSubject(String mailSubject) {
        MailSubject = mailSubject;
    }

    public String getMailSender() {
        return MailSender;
    }

    public void setMailSender(String mailSender) {
        MailSender = mailSender;
    }


}
