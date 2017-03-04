package com.donkiello.model.entity.common;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ussocom on 2/1/2017.
 */
@Entity
@Table(name = "don_customer", schema = "dondb", catalog = "")

@NamedQueries({
        @NamedQuery(
                name = "ProgramNotDeleted",
                query = "SELECT program from DonProgram program where  program.programDeleted = 0 and  program.donCustomerByCustomerIdInProgram.customerId = :CID"
        ),
        @NamedQuery(
                name = "CustomerBusinesses",
                query = "SELECT business from DonBussiness business where  business.businessDeleted = 0 and  business.donCustomerByCustomerIdInBusiness.customerId = :CID"
        ),
        @NamedQuery(
                name = "CustomerPersonal",
                query = "SELECT personal from DonPersonal personal where  personal.personalDeleted = 0 and  personal.donCustomerByCustomerIdInPersonal.customerId = :CID"
        )
})

public class DonCustomer {
    private Integer customerId;
    private String customerRate;
    private String customerEcoRate;
    private Integer customerDeleted;
    private String customerName;
    private byte[] customerImage;
 //   private String customerBusinessName;
    private String customerPrograms;
    private String customerPaymentStatus;
    private String customerMobileNo;
    private List<DonBussiness> donBussinessesByCustomerId;
    private List<DonPast> donPastsByCustomerId;
    private List<DonPersonal> donPersonalsByCustomerId;
   // private DonPersonal donPersonalsByCustomerId;
    private List<DonProgram> donProgramsByCustomerId;

    private String FirstBusinessEmail;


    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustomerID",unique = true)
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "CustomerRate")
    public String getCustomerRate() {
        return customerRate;
    }

    public void setCustomerRate(String customerRate) {
        this.customerRate = customerRate;
    }

    @Basic
    @Column(name = "CustomerEcoRate")
    public String getCustomerEcoRate() {
        return customerEcoRate;
    }

    public void setCustomerEcoRate(String customerEcoRate) {
        this.customerEcoRate = customerEcoRate;
    }

    @Basic
    @Column(name = "CustomerDeleted")
    public Integer getCustomerDeleted() {
        return customerDeleted;
    }

    public void setCustomerDeleted(Integer customerDeleted) {
        this.customerDeleted = customerDeleted;
    }

    @Basic
    @Column(name = "CustomerName")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "CustomerImage")
    public byte[] getCustomerImage() {
        return customerImage;
    }

    public void setCustomerImage(byte[] customerImage) {
        this.customerImage = customerImage;
    }

  /*  @Basic
    @Column(name = "CustomerBusinessName")
    public String getCustomerBusinessName() {
        return customerBusinessName;
    }

    public void setCustomerBusinessName(String customerBusinessName) {
        this.customerBusinessName = customerBusinessName;
    }
*/
    @Basic
    @Column(name = "CustomerPrograms")
    public String getCustomerPrograms() {
        return customerPrograms;
    }

    public void setCustomerPrograms(String customerPrograms) {
        this.customerPrograms = customerPrograms;
    }

    @Basic
    @Column(name = "CustomerPaymentStatus")
    public String getCustomerPaymentStatus() {
        return customerPaymentStatus;
    }

    public void setCustomerPaymentStatus(String customerPaymentStatus) {
        this.customerPaymentStatus = customerPaymentStatus;
    }

//    @Basic
//    @Column(name = "CustomerMobileNo")
//    public String getCustomerMobileNo() {
//        return customerMobileNo;
//    }
//
//    public void setCustomerMobileNo(String customerMobileNo) {
//        this.customerMobileNo = customerMobileNo;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DonCustomer that = (DonCustomer) o;

        if (customerId != that.customerId) return false;
        if (customerRate != null ? !customerRate.equals(that.customerRate) : that.customerRate != null) return false;
        if (customerEcoRate != null ? !customerEcoRate.equals(that.customerEcoRate) : that.customerEcoRate != null)
            return false;
        if (customerDeleted != null ? !customerDeleted.equals(that.customerDeleted) : that.customerDeleted != null)
            return false;
        if (customerName != null ? !customerName.equals(that.customerName) : that.customerName != null) return false;
        if (!Arrays.equals(customerImage, that.customerImage)) return false;
    /*    if (customerBusinessName != null ? !customerBusinessName.equals(that.customerBusinessName) : that.customerBusinessName != null)
            return false;*/
        if (customerPrograms != null ? !customerPrograms.equals(that.customerPrograms) : that.customerPrograms != null)
            return false;
        if (customerPaymentStatus != null ? !customerPaymentStatus.equals(that.customerPaymentStatus) : that.customerPaymentStatus != null)
            return false;
        if (customerMobileNo != null ? !customerMobileNo.equals(that.customerMobileNo) : that.customerMobileNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId;
        result = 31 * result + (customerRate != null ? customerRate.hashCode() : 0);
        result = 31 * result + (customerEcoRate != null ? customerEcoRate.hashCode() : 0);
        result = 31 * result + (customerDeleted != null ? customerDeleted.hashCode() : 0);
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(customerImage);
     //   result = 31 * result + (customerBusinessName != null ? customerBusinessName.hashCode() : 0);
        result = 31 * result + (customerPrograms != null ? customerPrograms.hashCode() : 0);
        result = 31 * result + (customerPaymentStatus != null ? customerPaymentStatus.hashCode() : 0);
        result = 31 * result + (customerMobileNo != null ? customerMobileNo.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "donCustomerByCustomerIdInBusiness")
    public List<DonBussiness> getDonBussinessesByCustomerId() {
        return donBussinessesByCustomerId;
    }

    public void setDonBussinessesByCustomerId(List<DonBussiness> donBussinessesByCustomerId) {
        this.donBussinessesByCustomerId = donBussinessesByCustomerId;
    }

    @OneToMany(mappedBy = "donCustomerByCustomerIdInPast")
    public List<DonPast> getDonPastsByCustomerId() {
        return donPastsByCustomerId;
    }

    public void setDonPastsByCustomerId(List<DonPast> donPastsByCustomerId) {
        this.donPastsByCustomerId = donPastsByCustomerId;
    }

    @OneToMany(mappedBy = "donCustomerByCustomerIdInPersonal")
    public List<DonPersonal> getDonPersonalsByCustomerId() {
        return donPersonalsByCustomerId;
    }

    public void setDonPersonalsByCustomerId(List<DonPersonal> donPersonalsByCustomerId) {
        this.donPersonalsByCustomerId = donPersonalsByCustomerId;
    }

    @OneToMany(mappedBy = "donCustomerByCustomerIdInProgram")
    public List<DonProgram> getDonProgramsByCustomerId() {
        return donProgramsByCustomerId;
    }

    public void setDonProgramsByCustomerId(List<DonProgram> donProgramsByCustomerId) {
        this.donProgramsByCustomerId = donProgramsByCustomerId;
    }







}
