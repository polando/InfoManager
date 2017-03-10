package com.donkiello.dto;

import com.donkiello.model.entity.common.DonBussiness;
import com.donkiello.model.entity.common.DonCustomer;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by ussocom on 2/1/2017.
 */
public class DonBussinessDTO {

    private Integer bussinessId;
    private String businessNameFa;
    private String businessPositionFa;
    private String businessAddressFa;
    private String businessCityFa;
    private String businessCountryFa;
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
    private String businessSecretaryEmail;
    private String businessCountryEn;
    private String businessCityEn;
    private String businessAddressEn;
    private String businessPositionEn;
    private String businessNameEn;
    private String businessTagSecond;

    private DonCustomerDTO donCustomerByCustomerIdInBusiness;


    public Integer getBussinessId() {
        return bussinessId;
    }

    public void setBussinessId(Integer bussinessId) {
        this.bussinessId = bussinessId;
    }


    public String getBusinessNameFa() {
        return businessNameFa;
    }

    public void setBusinessNameFa(String businessNameFa) {
        this.businessNameFa = businessNameFa;
    }


    public String getBusinessPositionFa() {
        return businessPositionFa;
    }

    public void setBusinessPositionFa(String businessPositionFa) {
        this.businessPositionFa = businessPositionFa;
    }


    public String getBusinessAddressFa() {
        return businessAddressFa;
    }

    public void setBusinessAddressFa(String businessAddressFa) {
        this.businessAddressFa = businessAddressFa;
    }


    public String getBusinessCityFa() {
        return businessCityFa;
    }

    public void setBusinessCityFa(String businessCityFa) {
        this.businessCityFa = businessCityFa;
    }


    public String getBusinessCountryFa() {
        return businessCountryFa;
    }

    public void setBusinessCountryFa(String businessCountryFa) {
        this.businessCountryFa = businessCountryFa;
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




    public String getBusinessSecretaryEmail() {
        return businessSecretaryEmail;
    }

    public void setBusinessSecretaryEmail(String businessSecretaryEmail) {
        this.businessSecretaryEmail = businessSecretaryEmail;
    }


    public String getBusinessCountryEn() {
        return businessCountryEn;
    }

    public void setBusinessCountryEn(String businessCountryEn) {
        this.businessCountryEn = businessCountryEn;
    }


    public String getBusinessCityEn() {
        return businessCityEn;
    }

    public void setBusinessCityEn(String businessCityEn) {
        this.businessCityEn = businessCityEn;
    }


    public String getBusinessAddressEn() {
        return businessAddressEn;
    }

    public void setBusinessAddressEn(String businessAddressEn) {
        this.businessAddressEn = businessAddressEn;
    }


    public String getBusinessPositionEn() {
        return businessPositionEn;
    }

    public void setBusinessPositionEn(String businessPositionEn) {
        this.businessPositionEn = businessPositionEn;
    }


    public String getBusinessNameEn() {
        return businessNameEn;
    }

    public void setBusinessNameEn(String businessNameEn) {
        this.businessNameEn = businessNameEn;
    }


    public String getBusinessTagSecond() {
        return businessTagSecond;
    }

    public void setBusinessTagSecond(String businessTagSecond) {
        this.businessTagSecond = businessTagSecond;
    }

    public DonCustomerDTO getDonCustomerByCustomerIdInBusiness() {
        return donCustomerByCustomerIdInBusiness;
    }

    public void setDonCustomerByCustomerIdInBusiness(DonCustomerDTO donCustomerByCustomerIdInBusiness) {
        this.donCustomerByCustomerIdInBusiness = donCustomerByCustomerIdInBusiness;
    }
}
