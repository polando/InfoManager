package com.donkiello.model.entity.common;

import javax.persistence.*;

/**
 * Created by ussocom on 2/1/2017.
 */
@Entity
@Table(name = "don_bussiness", schema = "dondb")
public class DonBussiness {
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
    private DonCustomer donCustomerByCustomerIdInBusiness;

    @Id
    @Column(name = "BussinessID")
    public int getBussinessId() {
        return bussinessId;
    }

    public void setBussinessId(int bussinessId) {
        this.bussinessId = bussinessId;
    }

  /*  @Basic
    @Column(name = "CustomerID")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
*/
    @Basic
    @Column(name = "BusinessName")
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @Basic
    @Column(name = "BusinessPosition")
    public String getBusinessPosition() {
        return businessPosition;
    }

    public void setBusinessPosition(String businessPosition) {
        this.businessPosition = businessPosition;
    }

    @Basic
    @Column(name = "BusinessAddress")
    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
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
    @Column(name = "BusinessCountry")
    public String getBusinessCountry() {
        return businessCountry;
    }

    public void setBusinessCountry(String businessCountry) {
        this.businessCountry = businessCountry;
    }

    @Basic
    @Column(name = "BusinessSecretaryEmail")
    public String getBusinessSecretaryEmail() {
        return businessSecretaryEmail;
    }

    public void setBusinessSecretaryEmail(String businessSecretaryEmail) {
        this.businessSecretaryEmail = businessSecretaryEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DonBussiness that = (DonBussiness) o;

        if (bussinessId != that.bussinessId) return false;
    //    if (customerId != that.customerId) return false;
        if (businessName != null ? !businessName.equals(that.businessName) : that.businessName != null) return false;
        if (businessPosition != null ? !businessPosition.equals(that.businessPosition) : that.businessPosition != null)
            return false;
        if (businessAddress != null ? !businessAddress.equals(that.businessAddress) : that.businessAddress != null)
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

        return true;
    }

    @Override
    public int hashCode() {
        int result = bussinessId;
    //    result = 31 * result + customerId;
        result = 31 * result + (businessName != null ? businessName.hashCode() : 0);
        result = 31 * result + (businessPosition != null ? businessPosition.hashCode() : 0);
        result = 31 * result + (businessAddress != null ? businessAddress.hashCode() : 0);
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
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID", nullable = false)
    public DonCustomer getDonCustomerByCustomerIdInBusiness() {
        return donCustomerByCustomerIdInBusiness;
    }

    public void setDonCustomerByCustomerIdInBusiness(DonCustomer donCustomerByCustomerId) {
        this.donCustomerByCustomerIdInBusiness = donCustomerByCustomerId;
    }
}
