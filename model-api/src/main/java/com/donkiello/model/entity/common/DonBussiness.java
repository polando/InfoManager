package com.donkiello.model.entity.common;

import javax.persistence.*;

/**
 * Created by ussocom on 3/8/2017.
 */
@Entity
@Table(name = "don_bussiness", schema = "dondb", catalog = "")
public class DonBussiness {
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
    private String businessCountry;
    private String businessSecretaryEmail;
    private String businessCountryEn;
    private String businessCityEn;
    private String businessAddressEn;
    private String businessPositionEn;
    private String businessNameEn;
    private String businessTagSecond;

    private DonCustomer donCustomerByCustomerIdInBusiness;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BussinessID",unique = true)
    public Integer getBussinessId() {
        return bussinessId;
    }

    public void setBussinessId(Integer bussinessId) {
        this.bussinessId = bussinessId;
    }

    @Basic
    @Column(name = "BusinessNameFA")
    public String getBusinessNameFa() {
        return businessNameFa;
    }

    public void setBusinessNameFa(String businessNameFa) {
        this.businessNameFa = businessNameFa;
    }

    @Basic
    @Column(name = "BusinessPositionFA")
    public String getBusinessPositionFa() {
        return businessPositionFa;
    }

    public void setBusinessPositionFa(String businessPositionFa) {
        this.businessPositionFa = businessPositionFa;
    }

    @Basic
    @Column(name = "BusinessAddressFA")
    public String getBusinessAddressFa() {
        return businessAddressFa;
    }

    public void setBusinessAddressFa(String businessAddressFa) {
        this.businessAddressFa = businessAddressFa;
    }

    @Basic
    @Column(name = "BusinessCityFA")
    public String getBusinessCityFa() {
        return businessCityFa;
    }

    public void setBusinessCityFa(String businessCityFa) {
        this.businessCityFa = businessCityFa;
    }

    @Basic
    @Column(name = "BusinessCountryFA")
    public String getBusinessCountryFa() {
        return businessCountryFa;
    }

    public void setBusinessCountryFa(String businessCountryFa) {
        this.businessCountryFa = businessCountryFa;
    }

    @Basic
    @Column(name = "BusinessBrand")
    public String getBusinessBrand() {
        return businessBrand;
    }

    public void setBusinessBrand(String businessBrand) {
        this.businessBrand = businessBrand;
    }

    @Basic
    @Column(name = "BusinessField")
    public String getBusinessField() {
        return businessField;
    }

    public void setBusinessField(String businessField) {
        this.businessField = businessField;
    }

    @Basic
    @Column(name = "BusinessOfficeTel")
    public String getBusinessOfficeTel() {
        return businessOfficeTel;
    }

    public void setBusinessOfficeTel(String businessOfficeTel) {
        this.businessOfficeTel = businessOfficeTel;
    }

    @Basic
    @Column(name = "BusinessSereterayName")
    public String getBusinessSereterayName() {
        return businessSereterayName;
    }

    public void setBusinessSereterayName(String businessSereterayName) {
        this.businessSereterayName = businessSereterayName;
    }

    @Basic
    @Column(name = "BussinessSecretaryTel")
    public String getBussinessSecretaryTel() {
        return bussinessSecretaryTel;
    }

    public void setBussinessSecretaryTel(String bussinessSecretaryTel) {
        this.bussinessSecretaryTel = bussinessSecretaryTel;
    }

    @Basic
    @Column(name = "BussinessFax")
    public String getBussinessFax() {
        return bussinessFax;
    }

    public void setBussinessFax(String bussinessFax) {
        this.bussinessFax = bussinessFax;
    }

    @Basic
    @Column(name = "BusinessEmail")
    public String getBusinessEmail() {
        return businessEmail;
    }

    public void setBusinessEmail(String businessEmail) {
        this.businessEmail = businessEmail;
    }

    @Basic
    @Column(name = "BusinessWebsite")
    public String getBusinessWebsite() {
        return businessWebsite;
    }

    public void setBusinessWebsite(String businessWebsite) {
        this.businessWebsite = businessWebsite;
    }

    @Basic
    @Column(name = "BusinessBranchComp")
    public String getBusinessBranchComp() {
        return businessBranchComp;
    }

    public void setBusinessBranchComp(String businessBranchComp) {
        this.businessBranchComp = businessBranchComp;
    }

    @Basic
    @Column(name = "BusinessPastComps")
    public String getBusinessPastComps() {
        return businessPastComps;
    }

    public void setBusinessPastComps(String businessPastComps) {
        this.businessPastComps = businessPastComps;
    }

    @Basic
    @Column(name = "BusinessCity")
    public String getBusinessCity() {
        return businessCity;
    }

    public void setBusinessCity(String businessCity) {
        this.businessCity = businessCity;
    }

    @Basic
    @Column(name = "BusinessDeleted")
    public Integer getBusinessDeleted() {
        return businessDeleted;
    }

    public void setBusinessDeleted(Integer businessDeleted) {
        this.businessDeleted = businessDeleted;
    }

    @Basic
    @Column(name = "BusinessTag")
    public String getBusinessTag() {
        return businessTag;
    }

    public void setBusinessTag(String businessTag) {
        this.businessTag = businessTag;
    }


    @Basic
    @Column(name = "BusinessSecretaryEmail")
    public String getBusinessSecretaryEmail() {
        return businessSecretaryEmail;
    }

    public void setBusinessSecretaryEmail(String businessSecretaryEmail) {
        this.businessSecretaryEmail = businessSecretaryEmail;
    }

    @Basic
    @Column(name = "BusinessCountryEN")
    public String getBusinessCountryEn() {
        return businessCountryEn;
    }

    public void setBusinessCountryEn(String businessCountryEn) {
        this.businessCountryEn = businessCountryEn;
    }

    @Basic
    @Column(name = "BusinessCityEN")
    public String getBusinessCityEn() {
        return businessCityEn;
    }

    public void setBusinessCityEn(String businessCityEn) {
        this.businessCityEn = businessCityEn;
    }

    @Basic
    @Column(name = "BusinessAddressEN")
    public String getBusinessAddressEn() {
        return businessAddressEn;
    }

    public void setBusinessAddressEn(String businessAddressEn) {
        this.businessAddressEn = businessAddressEn;
    }

    @Basic
    @Column(name = "BusinessPositionEN")
    public String getBusinessPositionEn() {
        return businessPositionEn;
    }

    public void setBusinessPositionEn(String businessPositionEn) {
        this.businessPositionEn = businessPositionEn;
    }

    @Basic
    @Column(name = "BusinessNameEN")
    public String getBusinessNameEn() {
        return businessNameEn;
    }

    public void setBusinessNameEn(String businessNameEn) {
        this.businessNameEn = businessNameEn;
    }

    @Basic
    @Column(name = "BusinessTagSecond")
    public String getBusinessTagSecond() {
        return businessTagSecond;
    }

    public void setBusinessTagSecond(String businessTagSecond) {
        this.businessTagSecond = businessTagSecond;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DonBussiness that = (DonBussiness) o;

        if (bussinessId != null ? !bussinessId.equals(that.bussinessId) : that.bussinessId != null) return false;
        if (businessNameFa != null ? !businessNameFa.equals(that.businessNameFa) : that.businessNameFa != null)
            return false;
        if (businessPositionFa != null ? !businessPositionFa.equals(that.businessPositionFa) : that.businessPositionFa != null)
            return false;
        if (businessAddressFa != null ? !businessAddressFa.equals(that.businessAddressFa) : that.businessAddressFa != null)
            return false;
        if (businessCityFa != null ? !businessCityFa.equals(that.businessCityFa) : that.businessCityFa != null)
            return false;
        if (businessCountryFa != null ? !businessCountryFa.equals(that.businessCountryFa) : that.businessCountryFa != null)
            return false;
        if (businessBrand != null ? !businessBrand.equals(that.businessBrand) : that.businessBrand != null)
            return false;
        if (businessField != null ? !businessField.equals(that.businessField) : that.businessField != null)
            return false;
        if (businessOfficeTel != null ? !businessOfficeTel.equals(that.businessOfficeTel) : that.businessOfficeTel != null)
            return false;
        if (businessSereterayName != null ? !businessSereterayName.equals(that.businessSereterayName) : that.businessSereterayName != null)
            return false;
        if (bussinessSecretaryTel != null ? !bussinessSecretaryTel.equals(that.bussinessSecretaryTel) : that.bussinessSecretaryTel != null)
            return false;
        if (bussinessFax != null ? !bussinessFax.equals(that.bussinessFax) : that.bussinessFax != null) return false;
        if (businessEmail != null ? !businessEmail.equals(that.businessEmail) : that.businessEmail != null)
            return false;
        if (businessWebsite != null ? !businessWebsite.equals(that.businessWebsite) : that.businessWebsite != null)
            return false;
        if (businessBranchComp != null ? !businessBranchComp.equals(that.businessBranchComp) : that.businessBranchComp != null)
            return false;
        if (businessPastComps != null ? !businessPastComps.equals(that.businessPastComps) : that.businessPastComps != null)
            return false;
        if (businessCity != null ? !businessCity.equals(that.businessCity) : that.businessCity != null) return false;
        if (businessDeleted != null ? !businessDeleted.equals(that.businessDeleted) : that.businessDeleted != null)
            return false;
        if (businessTag != null ? !businessTag.equals(that.businessTag) : that.businessTag != null) return false;
        if (businessCountry != null ? !businessCountry.equals(that.businessCountry) : that.businessCountry != null)
            return false;
        if (businessSecretaryEmail != null ? !businessSecretaryEmail.equals(that.businessSecretaryEmail) : that.businessSecretaryEmail != null)
            return false;
        if (businessCountryEn != null ? !businessCountryEn.equals(that.businessCountryEn) : that.businessCountryEn != null)
            return false;
        if (businessCityEn != null ? !businessCityEn.equals(that.businessCityEn) : that.businessCityEn != null)
            return false;
        if (businessAddressEn != null ? !businessAddressEn.equals(that.businessAddressEn) : that.businessAddressEn != null)
            return false;
        if (businessPositionEn != null ? !businessPositionEn.equals(that.businessPositionEn) : that.businessPositionEn != null)
            return false;
        if (businessNameEn != null ? !businessNameEn.equals(that.businessNameEn) : that.businessNameEn != null)
            return false;
        if (businessTagSecond != null ? !businessTagSecond.equals(that.businessTagSecond) : that.businessTagSecond != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bussinessId != null ? bussinessId.hashCode() : 0;
        result = 31 * result + (businessNameFa != null ? businessNameFa.hashCode() : 0);
        result = 31 * result + (businessPositionFa != null ? businessPositionFa.hashCode() : 0);
        result = 31 * result + (businessAddressFa != null ? businessAddressFa.hashCode() : 0);
        result = 31 * result + (businessCityFa != null ? businessCityFa.hashCode() : 0);
        result = 31 * result + (businessCountryFa != null ? businessCountryFa.hashCode() : 0);
        result = 31 * result + (businessBrand != null ? businessBrand.hashCode() : 0);
        result = 31 * result + (businessField != null ? businessField.hashCode() : 0);
        result = 31 * result + (businessOfficeTel != null ? businessOfficeTel.hashCode() : 0);
        result = 31 * result + (businessSereterayName != null ? businessSereterayName.hashCode() : 0);
        result = 31 * result + (bussinessSecretaryTel != null ? bussinessSecretaryTel.hashCode() : 0);
        result = 31 * result + (bussinessFax != null ? bussinessFax.hashCode() : 0);
        result = 31 * result + (businessEmail != null ? businessEmail.hashCode() : 0);
        result = 31 * result + (businessWebsite != null ? businessWebsite.hashCode() : 0);
        result = 31 * result + (businessBranchComp != null ? businessBranchComp.hashCode() : 0);
        result = 31 * result + (businessPastComps != null ? businessPastComps.hashCode() : 0);
        result = 31 * result + (businessCity != null ? businessCity.hashCode() : 0);
        result = 31 * result + (businessDeleted != null ? businessDeleted.hashCode() : 0);
        result = 31 * result + (businessTag != null ? businessTag.hashCode() : 0);
        result = 31 * result + (businessCountry != null ? businessCountry.hashCode() : 0);
        result = 31 * result + (businessSecretaryEmail != null ? businessSecretaryEmail.hashCode() : 0);
        result = 31 * result + (businessCountryEn != null ? businessCountryEn.hashCode() : 0);
        result = 31 * result + (businessCityEn != null ? businessCityEn.hashCode() : 0);
        result = 31 * result + (businessAddressEn != null ? businessAddressEn.hashCode() : 0);
        result = 31 * result + (businessPositionEn != null ? businessPositionEn.hashCode() : 0);
        result = 31 * result + (businessNameEn != null ? businessNameEn.hashCode() : 0);
        result = 31 * result + (businessTagSecond != null ? businessTagSecond.hashCode() : 0);
        return result;
    }



    @ManyToOne
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID", nullable = false)
    public DonCustomer getDonCustomerByCustomerIdInBusiness() {
        return donCustomerByCustomerIdInBusiness;
    }

    public void setDonCustomerByCustomerIdInBusiness(DonCustomer donCustomerByCustomerIdInBusiness) {
        this.donCustomerByCustomerIdInBusiness = donCustomerByCustomerIdInBusiness;
    }
}
