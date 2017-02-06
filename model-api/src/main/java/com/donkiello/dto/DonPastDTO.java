package com.donkiello.dto;

import com.donkiello.model.entity.common.DonCustomer;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by ussocom on 2/1/2017.
 */

public class DonPastDTO {
    private Integer pastId;
    //  private Integer customerIdFK;
    private String pastDegree;
    private String pastEduField;
    private String pastUniName;
    private String pastUniCity;
    private String pastGradDate;
    private Integer pastDeleted;
    private DonCustomerDTO donCustomerByCustomerIdInPast;


    public Integer getPastId() {
        return pastId;
    }

    public void setPastId(Integer pastId) {
        this.pastId = pastId;
    }


    public String getPastDegree() {
        return pastDegree;
    }

    public void setPastDegree(String pastDegree) {
        this.pastDegree = pastDegree;
    }


    public String getPastEduField() {
        return pastEduField;
    }

    public void setPastEduField(String pastEduField) {
        this.pastEduField = pastEduField;
    }


    public String getPastUniName() {
        return pastUniName;
    }

    public void setPastUniName(String pastUniName) {
        this.pastUniName = pastUniName;
    }


    public String getPastUniCity() {
        return pastUniCity;
    }

    public void setPastUniCity(String pastUniCity) {
        this.pastUniCity = pastUniCity;
    }


    public String getPastGradDate() {
        return pastGradDate;
    }

    public void setPastGradDate(String pastGradDate) {
        this.pastGradDate = pastGradDate;
    }


    public Integer getPastDeleted() {
        return pastDeleted;
    }

    public void setPastDeleted(Integer pastDeleted) {
        this.pastDeleted = pastDeleted;
    }

    public DonCustomerDTO getDonCustomerByCustomerIdInPast() {
        return donCustomerByCustomerIdInPast;
    }

    public void setDonCustomerByCustomerIdInPast(DonCustomerDTO donCustomerByCustomerIdInPast) {
        this.donCustomerByCustomerIdInPast = donCustomerByCustomerIdInPast;
    }
}
