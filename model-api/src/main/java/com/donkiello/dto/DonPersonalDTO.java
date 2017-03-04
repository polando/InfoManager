package com.donkiello.dto;

import com.donkiello.model.entity.common.DonCustomer;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Arrays;

/**
 * Created by ussocom on 2/1/2017.
 */

public class DonPersonalDTO {
    private Integer personalId;
    private String persinalName;
    private String personalFamilyName;
    private BigInteger personalGender;
    private String personalMobileNum;
    private String personalNameEn;
    private String personalFamilyNameEn;
    private String personalPrefix;
    private String personalPrefixEn;
    private String personalHomeTel;
    private String personalHomeFax;
    private String personalPostalCode;
    private String personalHomeAddress;
    private String personalFhName;
    private String personalFhNameEn;
    private String personalBirthday;
    private String personalHomeAddressEn;
    private String personalBirthPlace;
    private String personalPassportNo;
    private String personalBirthCertNo;
    private String personalPersonalEmail;
    private byte[] personalPassportScan;
    private byte[] personalBirthCertScan;
    private String personalDisc;
    private String personalHobbies;
    private Integer personalDeleted;
    private DonCustomerDTO donCustomerByCustomerIdInPersonal;

    @Id
    @Column(name = "PersonalID")
    public Integer getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Integer personalId) {
        this.personalId = personalId;
    }

/*    @Basic
    @Column(name = "CustomerID")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
*/

    public String getPersinalName() {
        return persinalName;
    }

    public void setPersinalName(String persinalName) {
        this.persinalName = persinalName;
    }


    public String getPersonalFamilyName() {
        return personalFamilyName;
    }

    public void setPersonalFamilyName(String personalFamilyName) {
        this.personalFamilyName = personalFamilyName;
    }


    public BigInteger getPersonalGender() {
        return personalGender;
    }

    public void setPersonalGender(BigInteger personalGender) {
        this.personalGender = personalGender;
    }


    public String getPersonalMobileNum() {
        return personalMobileNum;
    }

    public void setPersonalMobileNum(String personalMobileNum) {
        this.personalMobileNum = personalMobileNum;
    }


    public String getPersonalNameEn() {
        return personalNameEn;
    }

    public void setPersonalNameEn(String personalNameEn) {
        this.personalNameEn = personalNameEn;
    }


    public String getPersonalFamilyNameEn() {
        return personalFamilyNameEn;
    }

    public void setPersonalFamilyNameEn(String personalFamilyNameEn) {
        this.personalFamilyNameEn = personalFamilyNameEn;
    }


    public String getPersonalPrefix() {
        return personalPrefix;
    }

    public void setPersonalPrefix(String personalPrefix) {
        this.personalPrefix = personalPrefix;
    }


    public String getPersonalPrefixEn() {
        return personalPrefixEn;
    }

    public void setPersonalPrefixEn(String personalPrefixEn) {
        this.personalPrefixEn = personalPrefixEn;
    }


    public String getPersonalHomeTel() {
        return personalHomeTel;
    }

    public void setPersonalHomeTel(String personalHomeTel) {
        this.personalHomeTel = personalHomeTel;
    }


    public String getPersonalHomeFax() {
        return personalHomeFax;
    }

    public void setPersonalHomeFax(String personalHomeFax) {
        this.personalHomeFax = personalHomeFax;
    }


    public String getPersonalPostalCode() {
        return personalPostalCode;
    }

    public void setPersonalPostalCode(String personalPostalCode) {
        this.personalPostalCode = personalPostalCode;
    }


    public String getPersonalHomeAddress() {
        return personalHomeAddress;
    }

    public void setPersonalHomeAddress(String personalHomeAddress) {
        this.personalHomeAddress = personalHomeAddress;
    }


    public String getPersonalFhName() {
        return personalFhName;
    }

    public void setPersonalFhName(String personalFhName) {
        this.personalFhName = personalFhName;
    }


    public String getPersonalFhNameEn() {
        return personalFhNameEn;
    }

    public void setPersonalFhNameEn(String personalFhNameEn) {
        this.personalFhNameEn = personalFhNameEn;
    }


    public String getPersonalBirthday() {
        return personalBirthday;
    }

    public void setPersonalBirthday(String personalBirthday) {
        this.personalBirthday = personalBirthday;
    }


    public String getPersonalHomeAddressEn() {
        return personalHomeAddressEn;
    }

    public void setPersonalHomeAddressEn(String personalHomeAddressEn) {
        this.personalHomeAddressEn = personalHomeAddressEn;
    }


    public String getPersonalBirthPlace() {
        return personalBirthPlace;
    }

    public void setPersonalBirthPlace(String personalBirthPlace) {
        this.personalBirthPlace = personalBirthPlace;
    }


    public String getPersonalPassportNo() {
        return personalPassportNo;
    }

    public void setPersonalPassportNo(String personalPassportNo) {
        this.personalPassportNo = personalPassportNo;
    }


    public String getPersonalBirthCertNo() {
        return personalBirthCertNo;
    }

    public void setPersonalBirthCertNo(String personalBirthCertNo) {
        this.personalBirthCertNo = personalBirthCertNo;
    }


    public String getPersonalPersonalEmail() {
        return personalPersonalEmail;
    }

    public void setPersonalPersonalEmail(String personalPersonalEmail) {
        this.personalPersonalEmail = personalPersonalEmail;
    }


    public byte[] getPersonalPassportScan() {
        return personalPassportScan;
    }

    public void setPersonalPassportScan(byte[] personalPassportScan) {
        this.personalPassportScan = personalPassportScan;
    }


    public byte[] getPersonalBirthCertScan() {
        return personalBirthCertScan;
    }

    public void setPersonalBirthCertScan(byte[] personalBirthCertScan) {
        this.personalBirthCertScan = personalBirthCertScan;
    }


    public String getPersonalDisc() {
        return personalDisc;
    }

    public void setPersonalDisc(String personalDisc) {
        this.personalDisc = personalDisc;
    }


    public String getPersonalHobbies() {
        return personalHobbies;
    }

    public void setPersonalHobbies(String personalHobbies) {
        this.personalHobbies = personalHobbies;
    }


    public Integer getPersonalDeleted() {
        return personalDeleted;
    }

    public void setPersonalDeleted(Integer personalDeleted) {
        this.personalDeleted = personalDeleted;
    }

    public DonCustomerDTO getDonCustomerByCustomerIdInPersonal() {
        return donCustomerByCustomerIdInPersonal;
    }

    public void setDonCustomerByCustomerIdInPersonal(DonCustomerDTO donCustomerByCustomerIdInPersonal) {
        this.donCustomerByCustomerIdInPersonal = donCustomerByCustomerIdInPersonal;
    }
}
