package com.donkiello.dto;

import com.donkiello.model.entity.common.DonCustomer;
import com.donkiello.model.entity.common.DonPersonal;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Arrays;

/**
 * Created by ussocom on 2/1/2017.
 */

public class DonPersonalDTO {
    private Integer personalId;
    private BigInteger personalGender;
    private String personalMobileNum;
    private String personalHomeTel;
    private String personalHomeFax;
    private String personalPostalCode;
    private String personalPassportNo;
    private String personalBirthCertNo;
    private String personalPersonalEmail;
    private byte[] personalPassportScan;
    private byte[] personalBirthCertScan;
    private String personalFirstNameFa;
    private String personalFamilyNameFa;
    private String personalPrefixFa;
    private String personalFatherNameFa;
    private String personalHomeAddressFa;
    private String personalBirthdayFa;
    private String personalCountryFa;
    private String personalCityFa;
    private String personalNationalityFa;
    private String personalDiscFa;
    private String personalHobbiesFa;
    private String personalDiscEn;
    private Integer personalDeleted;
    private String personalHobbiesEn;
    private String personalCityEn;
    private String personalNationalityEn;
    private String personalCountryEn;
    private String personalBirthdayEn;
    private String personalFirstNameEn;
    private String personalFamilyNameEn;
    private String personalPrefixEn;
    private String personalFatherNameEn;
    private String personalHomeAddressEn;

    private DonCustomerDTO donCustomerByCustomerIdInPersonal;


    public Integer getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Integer personalId) {
        this.personalId = personalId;
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


    public String getPersonalFirstNameFa() {
        return personalFirstNameFa;
    }

    public void setPersonalFirstNameFa(String personalFirstNameFa) {
        this.personalFirstNameFa = personalFirstNameFa;
    }


    public String getPersonalFamilyNameFa() {
        return personalFamilyNameFa;
    }

    public void setPersonalFamilyNameFa(String personalFamilyNameFa) {
        this.personalFamilyNameFa = personalFamilyNameFa;
    }


    public String getPersonalPrefixFa() {
        return personalPrefixFa;
    }

    public void setPersonalPrefixFa(String personalPrefixFa) {
        this.personalPrefixFa = personalPrefixFa;
    }


    public String getPersonalFatherNameFa() {
        return personalFatherNameFa;
    }

    public void setPersonalFatherNameFa(String personalFatherNameFa) {
        this.personalFatherNameFa = personalFatherNameFa;
    }


    public String getPersonalHomeAddressFa() {
        return personalHomeAddressFa;
    }

    public void setPersonalHomeAddressFa(String personalHomeAddressFa) {
        this.personalHomeAddressFa = personalHomeAddressFa;
    }


    public String getPersonalBirthdayFa() {
        return personalBirthdayFa;
    }

    public void setPersonalBirthdayFa(String personalBirthdayFa) {
        this.personalBirthdayFa = personalBirthdayFa;
    }


    public String getPersonalCountryFa() {
        return personalCountryFa;
    }

    public void setPersonalCountryFa(String personalCountryFa) {
        this.personalCountryFa = personalCountryFa;
    }


    public String getPersonalCityFa() {
        return personalCityFa;
    }

    public void setPersonalCityFa(String personalCityFa) {
        this.personalCityFa = personalCityFa;
    }


    public String getPersonalNationalityFa() {
        return personalNationalityFa;
    }

    public void setPersonalNationalityFa(String personalNationalityFa) {
        this.personalNationalityFa = personalNationalityFa;
    }


    public String getPersonalDiscFa() {
        return personalDiscFa;
    }

    public void setPersonalDiscFa(String personalDiscFa) {
        this.personalDiscFa = personalDiscFa;
    }


    public String getPersonalHobbiesFa() {
        return personalHobbiesFa;
    }

    public void setPersonalHobbiesFa(String personalHobbiesFa) {
        this.personalHobbiesFa = personalHobbiesFa;
    }


    public String getPersonalDiscEn() {
        return personalDiscEn;
    }

    public void setPersonalDiscEn(String personalDiscEn) {
        this.personalDiscEn = personalDiscEn;
    }


    public Integer getPersonalDeleted() {
        return personalDeleted;
    }

    public void setPersonalDeleted(Integer personalDeleted) {
        this.personalDeleted = personalDeleted;
    }


    public String getPersonalHobbiesEn() {
        return personalHobbiesEn;
    }

    public void setPersonalHobbiesEn(String personalHobbiesEn) {
        this.personalHobbiesEn = personalHobbiesEn;
    }


    public String getPersonalCityEn() {
        return personalCityEn;
    }

    public void setPersonalCityEn(String personalCityEn) {
        this.personalCityEn = personalCityEn;
    }


    public String getPersonalNationalityEn() {
        return personalNationalityEn;
    }

    public void setPersonalNationalityEn(String personalNationalityEn) {
        this.personalNationalityEn = personalNationalityEn;
    }


    public String getPersonalCountryEn() {
        return personalCountryEn;
    }

    public void setPersonalCountryEn(String personalCountryEn) {
        this.personalCountryEn = personalCountryEn;
    }


    public String getPersonalBirthdayEn() {
        return personalBirthdayEn;
    }

    public void setPersonalBirthdayEn(String personalBirthdayEn) {
        this.personalBirthdayEn = personalBirthdayEn;
    }


    public String getPersonalFirstNameEn() {
        return personalFirstNameEn;
    }

    public void setPersonalFirstNameEn(String personalFirstNameEn) {
        this.personalFirstNameEn = personalFirstNameEn;
    }


    public String getPersonalFamilyNameEn() {
        return personalFamilyNameEn;
    }

    public void setPersonalFamilyNameEn(String personalFamilyNameEn) {
        this.personalFamilyNameEn = personalFamilyNameEn;
    }

    public String getPersonalPrefixEn() {
        return personalPrefixEn;
    }

    public void setPersonalPrefixEn(String personalPrefixEn) {
        this.personalPrefixEn = personalPrefixEn;
    }


    public String getPersonalFatherNameEn() {
        return personalFatherNameEn;
    }

    public void setPersonalFatherNameEn(String personalFatherNameEn) {
        this.personalFatherNameEn = personalFatherNameEn;
    }


    public String getPersonalHomeAddressEn() {
        return personalHomeAddressEn;
    }

    public void setPersonalHomeAddressEn(String personalHomeAddressEn) {
        this.personalHomeAddressEn = personalHomeAddressEn;
    }


    public DonCustomerDTO getDonCustomerByCustomerIdInPersonal() {
        return donCustomerByCustomerIdInPersonal;
    }

    public void setDonCustomerByCustomerIdInPersonal(DonCustomerDTO donCustomerByCustomerIdInPersonal) {
        this.donCustomerByCustomerIdInPersonal = donCustomerByCustomerIdInPersonal;
    }
}
