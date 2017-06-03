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
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;


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



    public String removeRow() {
        System.out.println("deleted");
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
}
