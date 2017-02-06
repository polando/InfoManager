package com.donkiello.dto;

import com.donkiello.model.entity.common.DonCustomer;

import javax.persistence.*;

/**
 * Created by ussocom on 2/1/2017.
 */
public class DonBussinessDTO {
    private int bussinessId;
 //   private int customerId;
    private String businessName;
    private String businessPosition;
    private String businessAddress;
    private String businessBrand;
    private String businessField;
    private String businessOfficeTel;
    private String businessSereterayName;
    private String bussinessSecretaryTel;
    private String bussinessFax;
    private String businessEmail;
    private String businessWebsite;
    private String businessBranchComp;
    private String businessPastComps;
    private String businessCity;
    private Integer businessDeleted;
    private String businessTag;
    private String businessCountry;
    private String businessSecretaryEmail;
    private DonCustomerDTO donCustomerByCustomerIdInBusiness;


    public int getBussinessId() {
        return bussinessId;
    }

    public void setBussinessId(int bussinessId) {
        this.bussinessId = bussinessId;
    }


    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessPosition() {
        return businessPosition;
    }

    public void setBusinessPosition(String businessPosition) {
        this.businessPosition = businessPosition;
    }


    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }


    public String getBusinessBrand() {
        return businessBrand;
    }

    public void setBusinessBrand(String businessBrand) {
        this.businessBrand = businessBrand;
    }

    public String getBusinessField() {
        return businessField;
    }

    public void setBusinessField(String businessField) {
        this.businessField = businessField;
    }


    public String getBusinessOfficeTel() {
        return businessOfficeTel;
    }

    public void setBusinessOfficeTel(String businessOfficeTel) {
        this.businessOfficeTel = businessOfficeTel;
    }

    public String getBusinessSereterayName() {
        return businessSereterayName;
    }

    public void setBusinessSereterayName(String businessSereterayName) {
        this.businessSereterayName = businessSereterayName;
    }


    public String getBussinessSecretaryTel() {
        return bussinessSecretaryTel;
    }

    public void setBussinessSecretaryTel(String bussinessSecretaryTel) {
        this.bussinessSecretaryTel = bussinessSecretaryTel;
    }


    public String getBussinessFax() {
        return bussinessFax;
    }

    public void setBussinessFax(String bussinessFax) {
        this.bussinessFax = bussinessFax;
    }


    public String getBusinessEmail() {
        return businessEmail;
    }

    public void setBusinessEmail(String businessEmail) {
        this.businessEmail = businessEmail;
    }

    public String getBusinessWebsite() {
        return businessWebsite;
    }

    public void setBusinessWebsite(String businessWebsite) {
        this.businessWebsite = businessWebsite;
    }


    public String getBusinessBranchComp() {
        return businessBranchComp;
    }

    public void setBusinessBranchComp(String businessBranchComp) {
        this.businessBranchComp = businessBranchComp;
    }


    public String getBusinessPastComps() {
        return businessPastComps;
    }

    public void setBusinessPastComps(String businessPastComps) {
        this.businessPastComps = businessPastComps;
    }


    public String getBusinessCity() {
        return businessCity;
    }

    public void setBusinessCity(String businessCity) {
        this.businessCity = businessCity;
    }


    public Integer getBusinessDeleted() {
        return businessDeleted;
    }

    public void setBusinessDeleted(Integer businessDeleted) {
        this.businessDeleted = businessDeleted;
    }


    public String getBusinessTag() {
        return businessTag;
    }

    public void setBusinessTag(String businessTag) {
        this.businessTag = businessTag;
    }

    public String getBusinessCountry() {
        return businessCountry;
    }

    public void setBusinessCountry(String businessCountry) {
        this.businessCountry = businessCountry;
    }


    public String getBusinessSecretaryEmail() {
        return businessSecretaryEmail;
    }

    public void setBusinessSecretaryEmail(String businessSecretaryEmail) {
        this.businessSecretaryEmail = businessSecretaryEmail;
    }



    public DonCustomerDTO getDonCustomerByCustomerIdInBusiness() {
        return donCustomerByCustomerIdInBusiness;
    }

    public void setDonCustomerByCustomerIdInBusiness(DonCustomerDTO donCustomerByCustomerId) {
        this.donCustomerByCustomerIdInBusiness = donCustomerByCustomerId;
    }
}
