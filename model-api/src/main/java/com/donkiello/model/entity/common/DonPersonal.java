package com.donkiello.model.entity.common;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by ussocom on 3/8/2017.
 */
@Entity
@Table(name = "don_personal", schema = "dondb", catalog = "")
public class DonPersonal {
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

    private DonCustomer donCustomerByCustomerIdInPersonal;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PersonalID",unique = true)
    public Integer getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Integer personalId) {
        this.personalId = personalId;
    }

    @Basic
    @Column(name = "PersonalGender")
    public BigInteger getPersonalGender() {
        return personalGender;
    }

    public void setPersonalGender(BigInteger personalGender) {
        this.personalGender = personalGender;
    }

    @Basic
    @Column(name = "PersonalMobileNum")
    public String getPersonalMobileNum() {
        return personalMobileNum;
    }

    public void setPersonalMobileNum(String personalMobileNum) {
        this.personalMobileNum = personalMobileNum;
    }

    @Basic
    @Column(name = "PersonalHomeTel")
    public String getPersonalHomeTel() {
        return personalHomeTel;
    }

    public void setPersonalHomeTel(String personalHomeTel) {
        this.personalHomeTel = personalHomeTel;
    }

    @Basic
    @Column(name = "PersonalHomeFax")
    public String getPersonalHomeFax() {
        return personalHomeFax;
    }

    public void setPersonalHomeFax(String personalHomeFax) {
        this.personalHomeFax = personalHomeFax;
    }

    @Basic
    @Column(name = "PersonalPostalCode")
    public String getPersonalPostalCode() {
        return personalPostalCode;
    }

    public void setPersonalPostalCode(String personalPostalCode) {
        this.personalPostalCode = personalPostalCode;
    }

    @Basic
    @Column(name = "PersonalPassportNo")
    public String getPersonalPassportNo() {
        return personalPassportNo;
    }

    public void setPersonalPassportNo(String personalPassportNo) {
        this.personalPassportNo = personalPassportNo;
    }

    @Basic
    @Column(name = "PersonalBirthCertNo")
    public String getPersonalBirthCertNo() {
        return personalBirthCertNo;
    }

    public void setPersonalBirthCertNo(String personalBirthCertNo) {
        this.personalBirthCertNo = personalBirthCertNo;
    }

    @Basic
    @Column(name = "PersonalPersonalEmail")
    public String getPersonalPersonalEmail() {
        return personalPersonalEmail;
    }

    public void setPersonalPersonalEmail(String personalPersonalEmail) {
        this.personalPersonalEmail = personalPersonalEmail;
    }

    @Basic
    @Column(name = "PersonalPassportScan")
    public byte[] getPersonalPassportScan() {
        return personalPassportScan;
    }

    public void setPersonalPassportScan(byte[] personalPassportScan) {
        this.personalPassportScan = personalPassportScan;
    }

    @Basic
    @Column(name = "PersonalBirthCertScan")
    public byte[] getPersonalBirthCertScan() {
        return personalBirthCertScan;
    }

    public void setPersonalBirthCertScan(byte[] personalBirthCertScan) {
        this.personalBirthCertScan = personalBirthCertScan;
    }

    @Basic
    @Column(name = "PersonalFirstNameFA")
    public String getPersonalFirstNameFa() {
        return personalFirstNameFa;
    }

    public void setPersonalFirstNameFa(String personalFirstNameFa) {
        this.personalFirstNameFa = personalFirstNameFa;
    }

    @Basic
    @Column(name = "PersonalFamilyNameFA")
    public String getPersonalFamilyNameFa() {
        return personalFamilyNameFa;
    }

    public void setPersonalFamilyNameFa(String personalFamilyNameFa) {
        this.personalFamilyNameFa = personalFamilyNameFa;
    }

    @Basic
    @Column(name = "PersonalPrefixFA")
    public String getPersonalPrefixFa() {
        return personalPrefixFa;
    }

    public void setPersonalPrefixFa(String personalPrefixFa) {
        this.personalPrefixFa = personalPrefixFa;
    }

    @Basic
    @Column(name = "PersonalFatherNameFA")
    public String getPersonalFatherNameFa() {
        return personalFatherNameFa;
    }

    public void setPersonalFatherNameFa(String personalFatherNameFa) {
        this.personalFatherNameFa = personalFatherNameFa;
    }

    @Basic
    @Column(name = "PersonalHomeAddressFA")
    public String getPersonalHomeAddressFa() {
        return personalHomeAddressFa;
    }

    public void setPersonalHomeAddressFa(String personalHomeAddressFa) {
        this.personalHomeAddressFa = personalHomeAddressFa;
    }

    @Basic
    @Column(name = "PersonalBirthdayFA")
    public String getPersonalBirthdayFa() {
        return personalBirthdayFa;
    }

    public void setPersonalBirthdayFa(String personalBirthdayFa) {
        this.personalBirthdayFa = personalBirthdayFa;
    }

    @Basic
    @Column(name = "PersonalCountryFA")
    public String getPersonalCountryFa() {
        return personalCountryFa;
    }

    public void setPersonalCountryFa(String personalCountryFa) {
        this.personalCountryFa = personalCountryFa;
    }

    @Basic
    @Column(name = "PersonalCityFA")
    public String getPersonalCityFa() {
        return personalCityFa;
    }

    public void setPersonalCityFa(String personalCityFa) {
        this.personalCityFa = personalCityFa;
    }

    @Basic
    @Column(name = "PersonalNationalityFA")
    public String getPersonalNationalityFa() {
        return personalNationalityFa;
    }

    public void setPersonalNationalityFa(String personalNationalityFa) {
        this.personalNationalityFa = personalNationalityFa;
    }

    @Basic
    @Column(name = "PersonalDiscFA")
    public String getPersonalDiscFa() {
        return personalDiscFa;
    }

    public void setPersonalDiscFa(String personalDiscFa) {
        this.personalDiscFa = personalDiscFa;
    }

    @Basic
    @Column(name = "PersonalHobbiesFA")
    public String getPersonalHobbiesFa() {
        return personalHobbiesFa;
    }

    public void setPersonalHobbiesFa(String personalHobbiesFa) {
        this.personalHobbiesFa = personalHobbiesFa;
    }

    @Basic
    @Column(name = "PersonalDiscEN")
    public String getPersonalDiscEn() {
        return personalDiscEn;
    }

    public void setPersonalDiscEn(String personalDiscEn) {
        this.personalDiscEn = personalDiscEn;
    }

    @Basic
    @Column(name = "PersonalDeleted")
    public Integer getPersonalDeleted() {
        return personalDeleted;
    }

    public void setPersonalDeleted(Integer personalDeleted) {
        this.personalDeleted = personalDeleted;
    }

    @Basic
    @Column(name = "PersonalHobbiesEN")
    public String getPersonalHobbiesEn() {
        return personalHobbiesEn;
    }

    public void setPersonalHobbiesEn(String personalHobbiesEn) {
        this.personalHobbiesEn = personalHobbiesEn;
    }

    @Basic
    @Column(name = "PersonalCityEN")
    public String getPersonalCityEn() {
        return personalCityEn;
    }

    public void setPersonalCityEn(String personalCityEn) {
        this.personalCityEn = personalCityEn;
    }

    @Basic
    @Column(name = "PersonalNationalityEN")
    public String getPersonalNationalityEn() {
        return personalNationalityEn;
    }

    public void setPersonalNationalityEn(String personalNationalityEn) {
        this.personalNationalityEn = personalNationalityEn;
    }

    @Basic
    @Column(name = "PersonalCountryEN")
    public String getPersonalCountryEn() {
        return personalCountryEn;
    }

    public void setPersonalCountryEn(String personalCountryEn) {
        this.personalCountryEn = personalCountryEn;
    }

    @Basic
    @Column(name = "PersonalBirthdayEN")
    public String getPersonalBirthdayEn() {
        return personalBirthdayEn;
    }

    public void setPersonalBirthdayEn(String personalBirthdayEn) {
        this.personalBirthdayEn = personalBirthdayEn;
    }

    @Basic
    @Column(name = "PersonalFirstNameEN")
    public String getPersonalFirstNameEn() {
        return personalFirstNameEn;
    }

    public void setPersonalFirstNameEn(String personalFirstNameEn) {
        this.personalFirstNameEn = personalFirstNameEn;
    }

    @Basic
    @Column(name = "PersonalFamilyNameEN")
    public String getPersonalFamilyNameEn() {
        return personalFamilyNameEn;
    }

    public void setPersonalFamilyNameEn(String personalFamilyNameEn) {
        this.personalFamilyNameEn = personalFamilyNameEn;
    }

    @Basic
    @Column(name = "PersonalPrefixEN")
    public String getPersonalPrefixEn() {
        return personalPrefixEn;
    }

    public void setPersonalPrefixEn(String personalPrefixEn) {
        this.personalPrefixEn = personalPrefixEn;
    }

    @Basic
    @Column(name = "PersonalFatherNameEN")
    public String getPersonalFatherNameEn() {
        return personalFatherNameEn;
    }

    public void setPersonalFatherNameEn(String personalFatherNameEn) {
        this.personalFatherNameEn = personalFatherNameEn;
    }

    @Basic
    @Column(name = "PersonalHomeAddressEN")
    public String getPersonalHomeAddressEn() {
        return personalHomeAddressEn;
    }

    public void setPersonalHomeAddressEn(String personalHomeAddressEn) {
        this.personalHomeAddressEn = personalHomeAddressEn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DonPersonal that = (DonPersonal) o;

        if (personalId != null ? !personalId.equals(that.personalId) : that.personalId != null) return false;
        if (personalGender != null ? !personalGender.equals(that.personalGender) : that.personalGender != null)
            return false;
        if (personalMobileNum != null ? !personalMobileNum.equals(that.personalMobileNum) : that.personalMobileNum != null)
            return false;
        if (personalHomeTel != null ? !personalHomeTel.equals(that.personalHomeTel) : that.personalHomeTel != null)
            return false;
        if (personalHomeFax != null ? !personalHomeFax.equals(that.personalHomeFax) : that.personalHomeFax != null)
            return false;
        if (personalPostalCode != null ? !personalPostalCode.equals(that.personalPostalCode) : that.personalPostalCode != null)
            return false;
        if (personalPassportNo != null ? !personalPassportNo.equals(that.personalPassportNo) : that.personalPassportNo != null)
            return false;
        if (personalBirthCertNo != null ? !personalBirthCertNo.equals(that.personalBirthCertNo) : that.personalBirthCertNo != null)
            return false;
        if (personalPersonalEmail != null ? !personalPersonalEmail.equals(that.personalPersonalEmail) : that.personalPersonalEmail != null)
            return false;
        if (!Arrays.equals(personalPassportScan, that.personalPassportScan)) return false;
        if (!Arrays.equals(personalBirthCertScan, that.personalBirthCertScan)) return false;
        if (personalFirstNameFa != null ? !personalFirstNameFa.equals(that.personalFirstNameFa) : that.personalFirstNameFa != null)
            return false;
        if (personalFamilyNameFa != null ? !personalFamilyNameFa.equals(that.personalFamilyNameFa) : that.personalFamilyNameFa != null)
            return false;
        if (personalPrefixFa != null ? !personalPrefixFa.equals(that.personalPrefixFa) : that.personalPrefixFa != null)
            return false;
        if (personalFatherNameFa != null ? !personalFatherNameFa.equals(that.personalFatherNameFa) : that.personalFatherNameFa != null)
            return false;
        if (personalHomeAddressFa != null ? !personalHomeAddressFa.equals(that.personalHomeAddressFa) : that.personalHomeAddressFa != null)
            return false;
        if (personalBirthdayFa != null ? !personalBirthdayFa.equals(that.personalBirthdayFa) : that.personalBirthdayFa != null)
            return false;
        if (personalCountryFa != null ? !personalCountryFa.equals(that.personalCountryFa) : that.personalCountryFa != null)
            return false;
        if (personalCityFa != null ? !personalCityFa.equals(that.personalCityFa) : that.personalCityFa != null)
            return false;
        if (personalNationalityFa != null ? !personalNationalityFa.equals(that.personalNationalityFa) : that.personalNationalityFa != null)
            return false;
        if (personalDiscFa != null ? !personalDiscFa.equals(that.personalDiscFa) : that.personalDiscFa != null)
            return false;
        if (personalHobbiesFa != null ? !personalHobbiesFa.equals(that.personalHobbiesFa) : that.personalHobbiesFa != null)
            return false;
        if (personalDiscEn != null ? !personalDiscEn.equals(that.personalDiscEn) : that.personalDiscEn != null)
            return false;
        if (personalDeleted != null ? !personalDeleted.equals(that.personalDeleted) : that.personalDeleted != null)
            return false;
        if (personalHobbiesEn != null ? !personalHobbiesEn.equals(that.personalHobbiesEn) : that.personalHobbiesEn != null)
            return false;
        if (personalCityEn != null ? !personalCityEn.equals(that.personalCityEn) : that.personalCityEn != null)
            return false;
        if (personalNationalityEn != null ? !personalNationalityEn.equals(that.personalNationalityEn) : that.personalNationalityEn != null)
            return false;
        if (personalCountryEn != null ? !personalCountryEn.equals(that.personalCountryEn) : that.personalCountryEn != null)
            return false;
        if (personalBirthdayEn != null ? !personalBirthdayEn.equals(that.personalBirthdayEn) : that.personalBirthdayEn != null)
            return false;
        if (personalFirstNameEn != null ? !personalFirstNameEn.equals(that.personalFirstNameEn) : that.personalFirstNameEn != null)
            return false;
        if (personalFamilyNameEn != null ? !personalFamilyNameEn.equals(that.personalFamilyNameEn) : that.personalFamilyNameEn != null)
            return false;
        if (personalPrefixEn != null ? !personalPrefixEn.equals(that.personalPrefixEn) : that.personalPrefixEn != null)
            return false;
        if (personalFatherNameEn != null ? !personalFatherNameEn.equals(that.personalFatherNameEn) : that.personalFatherNameEn != null)
            return false;
        if (personalHomeAddressEn != null ? !personalHomeAddressEn.equals(that.personalHomeAddressEn) : that.personalHomeAddressEn != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personalId != null ? personalId.hashCode() : 0;
        result = 31 * result + (personalGender != null ? personalGender.hashCode() : 0);
        result = 31 * result + (personalMobileNum != null ? personalMobileNum.hashCode() : 0);
        result = 31 * result + (personalHomeTel != null ? personalHomeTel.hashCode() : 0);
        result = 31 * result + (personalHomeFax != null ? personalHomeFax.hashCode() : 0);
        result = 31 * result + (personalPostalCode != null ? personalPostalCode.hashCode() : 0);
        result = 31 * result + (personalPassportNo != null ? personalPassportNo.hashCode() : 0);
        result = 31 * result + (personalBirthCertNo != null ? personalBirthCertNo.hashCode() : 0);
        result = 31 * result + (personalPersonalEmail != null ? personalPersonalEmail.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(personalPassportScan);
        result = 31 * result + Arrays.hashCode(personalBirthCertScan);
        result = 31 * result + (personalFirstNameFa != null ? personalFirstNameFa.hashCode() : 0);
        result = 31 * result + (personalFamilyNameFa != null ? personalFamilyNameFa.hashCode() : 0);
        result = 31 * result + (personalPrefixFa != null ? personalPrefixFa.hashCode() : 0);
        result = 31 * result + (personalFatherNameFa != null ? personalFatherNameFa.hashCode() : 0);
        result = 31 * result + (personalHomeAddressFa != null ? personalHomeAddressFa.hashCode() : 0);
        result = 31 * result + (personalBirthdayFa != null ? personalBirthdayFa.hashCode() : 0);
        result = 31 * result + (personalCountryFa != null ? personalCountryFa.hashCode() : 0);
        result = 31 * result + (personalCityFa != null ? personalCityFa.hashCode() : 0);
        result = 31 * result + (personalNationalityFa != null ? personalNationalityFa.hashCode() : 0);
        result = 31 * result + (personalDiscFa != null ? personalDiscFa.hashCode() : 0);
        result = 31 * result + (personalHobbiesFa != null ? personalHobbiesFa.hashCode() : 0);
        result = 31 * result + (personalDiscEn != null ? personalDiscEn.hashCode() : 0);
        result = 31 * result + (personalDeleted != null ? personalDeleted.hashCode() : 0);
        result = 31 * result + (personalHobbiesEn != null ? personalHobbiesEn.hashCode() : 0);
        result = 31 * result + (personalCityEn != null ? personalCityEn.hashCode() : 0);
        result = 31 * result + (personalNationalityEn != null ? personalNationalityEn.hashCode() : 0);
        result = 31 * result + (personalCountryEn != null ? personalCountryEn.hashCode() : 0);
        result = 31 * result + (personalBirthdayEn != null ? personalBirthdayEn.hashCode() : 0);
        result = 31 * result + (personalFirstNameEn != null ? personalFirstNameEn.hashCode() : 0);
        result = 31 * result + (personalFamilyNameEn != null ? personalFamilyNameEn.hashCode() : 0);
        result = 31 * result + (personalPrefixEn != null ? personalPrefixEn.hashCode() : 0);
        result = 31 * result + (personalFatherNameEn != null ? personalFatherNameEn.hashCode() : 0);
        result = 31 * result + (personalHomeAddressEn != null ? personalHomeAddressEn.hashCode() : 0);
        return result;
    }




    @ManyToOne
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID", nullable = false)
    public DonCustomer getDonCustomerByCustomerIdInPersonal() {
        return donCustomerByCustomerIdInPersonal;
    }

    public void setDonCustomerByCustomerIdInPersonal(DonCustomer donCustomerByCustomerIdInPersonal) {
        this.donCustomerByCustomerIdInPersonal = donCustomerByCustomerIdInPersonal;
    }
}
