package com.donkiello.dto;

import com.donkiello.model.entity.common.DonBussiness;
import com.donkiello.model.entity.common.DonPast;
import com.donkiello.model.entity.common.DonPersonal;
import com.donkiello.model.entity.common.DonProgram;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ussocom on 2/1/2017.
 */

public class DonCustomerDTO {
    private Integer customerId;
    private String customerRate;
    private String customerEcoRate;
    private Integer customerDeleted;
    private String customerName;
    private byte[] customerImage;
    private String customerBusinessName;
    private String customerPrograms;
    private String customerPaymentStatus;
    private String customerMobileNo;
    private List<DonBussiness> donBussinessesByCustomerId;
    private List<DonPast> donPastsByCustomerId;
    private List<DonPersonal> donPersonalsByCustomerId;
    private List<DonProgram> donProgramsByCustomerId;

    private String FirstBusinessName;
    private String FirstBusinessAddress;
    private String FirstBusinessField;
    private String FirstBusinessEmail;
    private String FirstBusinessCity;
    private String FirstBusinessCountry;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    public String getCustomerRate() {
        return customerRate;
    }

    public void setCustomerRate(String customerRate) {
        this.customerRate = customerRate;
    }

    public String getCustomerEcoRate() {
        return customerEcoRate;
    }

    public void setCustomerEcoRate(String customerEcoRate) {
        this.customerEcoRate = customerEcoRate;
    }

    public Integer getCustomerDeleted() {
        return customerDeleted;
    }

    public void setCustomerDeleted(Integer customerDeleted) {
        this.customerDeleted = customerDeleted;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public byte[] getCustomerImage() {
        return customerImage;
    }

    public void setCustomerImage(byte[] customerImage) {
        this.customerImage = customerImage;
    }

    public String getCustomerBusinessName() {
        return customerBusinessName;
    }

    public void setCustomerBusinessName(String customerBusinessName) {
        this.customerBusinessName = customerBusinessName;
    }

    public String getCustomerPrograms() {
        return customerPrograms;
    }

    public void setCustomerPrograms(String customerPrograms) {
        this.customerPrograms = customerPrograms;
    }

    public String getCustomerPaymentStatus() {
        return customerPaymentStatus;
    }

    public void setCustomerPaymentStatus(String customerPaymentStatus) {
        this.customerPaymentStatus = customerPaymentStatus;
    }

    public String getCustomerMobileNo() {
        return customerMobileNo;
    }

    public void setCustomerMobileNo(String customerMobileNo) {
        this.customerMobileNo = customerMobileNo;
    }


    public List<DonBussiness> getDonBussinessesByCustomerId() {
        return donBussinessesByCustomerId;
    }

    public void setDonBussinessesByCustomerId(List<DonBussiness> donBussinessesByCustomerId) {
        this.donBussinessesByCustomerId = donBussinessesByCustomerId;
    }


    public List<DonPast> getDonPastsByCustomerId() {
        return donPastsByCustomerId;
    }

    public void setDonPastsByCustomerId(List<DonPast> donPastsByCustomerId) {
        this.donPastsByCustomerId = donPastsByCustomerId;
    }


    public List<DonPersonal> getDonPersonalsByCustomerId() {
        return donPersonalsByCustomerId;
    }

    public void setDonPersonalsByCustomerId(List<DonPersonal> donPersonalsByCustomerId) {
        this.donPersonalsByCustomerId = donPersonalsByCustomerId;
    }


    public List<DonProgram> getDonProgramsByCustomerId() {
        return donProgramsByCustomerId;
    }

    public void setDonProgramsByCustomerId(List<DonProgram> donProgramsByCustomerId) {
        this.donProgramsByCustomerId = donProgramsByCustomerId;
    }

    public void setFirstBusinessName(String  firstBusinessName){
        this.FirstBusinessName = firstBusinessName;
    }

    public String getFirstBusinessName(){
        if(donBussinessesByCustomerId != null && donBussinessesByCustomerId.size() > 0 )
        {
            FirstBusinessName = donBussinessesByCustomerId.get(0).getBusinessName();
        }
        else
            {
                 FirstBusinessName ="";
            }

        return FirstBusinessName;
    }

    public String getFirstBusinessAddress() {
        if(donBussinessesByCustomerId != null && donBussinessesByCustomerId.size() > 0)
        {
            FirstBusinessAddress = donBussinessesByCustomerId.get(0).getBusinessAddress();
        }
        else
        {
            FirstBusinessName ="";
        }

        return FirstBusinessAddress;
    }

    public void setFirstBusinessAddress(String firstBusinessAddress) {
        FirstBusinessAddress = firstBusinessAddress;
    }

    public String getFirstBusinessField() {
        if(donBussinessesByCustomerId != null && donBussinessesByCustomerId.size() > 0)
        {
            FirstBusinessField = donBussinessesByCustomerId.get(0).getBusinessField();
        }
        else
        {
            FirstBusinessField ="";
        }

        return FirstBusinessField;
    }

    public void setFirstBusinessField(String firstBusinessField) {
        FirstBusinessField = firstBusinessField;
    }

    public String getFirstBusinessEmail() {

        if(donBussinessesByCustomerId != null && donBussinessesByCustomerId.size() > 0)
        {
            FirstBusinessEmail = donBussinessesByCustomerId.get(0).getBusinessEmail();
        }
        else
        {
            FirstBusinessEmail ="";
        }

        return FirstBusinessEmail;
    }

    public void setFirstBusinessEmail(String firstBusinessEmail) {
        FirstBusinessEmail = firstBusinessEmail;
    }

    public String getFirstBusinessCity() {

        if(donBussinessesByCustomerId != null && donBussinessesByCustomerId.size() > 0)
        {
            FirstBusinessCity = donBussinessesByCustomerId.get(0).getBusinessCity();
        }
        else
        {
            FirstBusinessCity ="";
        }

        return FirstBusinessCity;
    }

    public void setFirstBusinessCity(String firstBusinessCity) {
        FirstBusinessCity = firstBusinessCity;
    }

    public String getFirstBusinessCountry() {

        if(donBussinessesByCustomerId != null && donBussinessesByCustomerId.size() > 0)
        {
            FirstBusinessCountry = donBussinessesByCustomerId.get(0).getBusinessCountry();
        }
        else
        {
            FirstBusinessCountry ="";
        }

        return FirstBusinessCountry;
    }

    public void setFirstBusinessCountry(String firstBusinessCountry) {
        FirstBusinessCountry = firstBusinessCountry;
    }
}
