package com.donkiello.model.entity.common;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by ussocom on 2/1/2017.
 */
@Entity
@Table(name = "don_past", schema = "dondb", catalog = "")
public class DonPast {
    private Integer pastId;
    private Integer customerId;
    private String pastDegree;
    private String pastEduField;
    private String pastUniName;
    private String pastUniCity;
    private Date pastGradDate;
    private Integer pastDeleted;
    private DonCustomer donCustomerByCustomerId;

    @Id
    @Column(name = "PastID")
    public Integer getPastId() {
        return pastId;
    }

    public void setPastId(Integer pastId) {
        this.pastId = pastId;
    }

    @Basic
    @Column(name = "CustomerID")
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "PastDegree")
    public String getPastDegree() {
        return pastDegree;
    }

    public void setPastDegree(String pastDegree) {
        this.pastDegree = pastDegree;
    }

    @Basic
    @Column(name = "PastEduField")
    public String getPastEduField() {
        return pastEduField;
    }

    public void setPastEduField(String pastEduField) {
        this.pastEduField = pastEduField;
    }

    @Basic
    @Column(name = "PastUniName")
    public String getPastUniName() {
        return pastUniName;
    }

    public void setPastUniName(String pastUniName) {
        this.pastUniName = pastUniName;
    }

    @Basic
    @Column(name = "PastUniCity")
    public String getPastUniCity() {
        return pastUniCity;
    }

    public void setPastUniCity(String pastUniCity) {
        this.pastUniCity = pastUniCity;
    }

    @Basic
    @Column(name = "PastGradDate")
    public Date getPastGradDate() {
        return pastGradDate;
    }

    public void setPastGradDate(Date pastGradDate) {
        this.pastGradDate = pastGradDate;
    }

    @Basic
    @Column(name = "PastDeleted")
    public Integer getPastDeleted() {
        return pastDeleted;
    }

    public void setPastDeleted(Integer pastDeleted) {
        this.pastDeleted = pastDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DonPast donPast = (DonPast) o;

        if (pastId != donPast.pastId) return false;
        if (customerId != donPast.customerId) return false;
        if (pastDegree != null ? !pastDegree.equals(donPast.pastDegree) : donPast.pastDegree != null) return false;
        if (pastEduField != null ? !pastEduField.equals(donPast.pastEduField) : donPast.pastEduField != null)
            return false;
        if (pastUniName != null ? !pastUniName.equals(donPast.pastUniName) : donPast.pastUniName != null) return false;
        if (pastUniCity != null ? !pastUniCity.equals(donPast.pastUniCity) : donPast.pastUniCity != null) return false;
        if (pastGradDate != null ? !pastGradDate.equals(donPast.pastGradDate) : donPast.pastGradDate != null)
            return false;
        if (pastDeleted != null ? !pastDeleted.equals(donPast.pastDeleted) : donPast.pastDeleted != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pastId;
        result = 31 * result + customerId;
        result = 31 * result + (pastDegree != null ? pastDegree.hashCode() : 0);
        result = 31 * result + (pastEduField != null ? pastEduField.hashCode() : 0);
        result = 31 * result + (pastUniName != null ? pastUniName.hashCode() : 0);
        result = 31 * result + (pastUniCity != null ? pastUniCity.hashCode() : 0);
        result = 31 * result + (pastGradDate != null ? pastGradDate.hashCode() : 0);
        result = 31 * result + (pastDeleted != null ? pastDeleted.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID", nullable = false)
    public DonCustomer getDonCustomerByCustomerId() {
        return donCustomerByCustomerId;
    }

    public void setDonCustomerByCustomerId(DonCustomer donCustomerByCustomerId) {
        this.donCustomerByCustomerId = donCustomerByCustomerId;
    }
}
