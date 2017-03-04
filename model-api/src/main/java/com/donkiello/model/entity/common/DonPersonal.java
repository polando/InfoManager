package com.donkiello.model.entity.common;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Arrays;

/**
 * Created by ussocom on 2/1/2017.
 */
@Entity
@Table(name = "don_personal", schema = "dondb")
public class DonPersonal {
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
    private DonCustomer donCustomerByCustomerIdInPersonal;

    @Id
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PersonalID",unique = true)
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
    @Basic
    @Column(name = "PersinalName")
    public String getPersinalName() {
        return persinalName;
    }

    public void setPersinalName(String persinalName) {
        this.persinalName = persinalName;
    }

    @Basic
    @Column(name = "PersonalFamilyName")
    public String getPersonalFamilyName() {
        return personalFamilyName;
    }

    public void setPersonalFamilyName(String personalFamilyName) {
        this.personalFamilyName = personalFamilyName;
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
    @Column(name = "PersonalNameEN")
    public String getPersonalNameEn() {
        return personalNameEn;
    }

    public void setPersonalNameEn(String personalNameEn) {
        this.personalNameEn = personalNameEn;
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
    @Column(name = "PersonalPrefix")
    public String getPersonalPrefix() {
        return personalPrefix;
    }

    public void setPersonalPrefix(String personalPrefix) {
        this.personalPrefix = personalPrefix;
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
    @Column(name = "PersonalHomeAddress")
    public String getPersonalHomeAddress() {
        return personalHomeAddress;
    }

    public void setPersonalHomeAddress(String personalHomeAddress) {
        this.personalHomeAddress = personalHomeAddress;
    }

    @Basic
    @Column(name = "PersonalFHName")
    public String getPersonalFhName() {
        return personalFhName;
    }

    public void setPersonalFhName(String personalFhName) {
        this.personalFhName = personalFhName;
    }

    @Basic
    @Column(name = "PersonalFHNameEN")
    public String getPersonalFhNameEn() {
        return personalFhNameEn;
    }

    public void setPersonalFhNameEn(String personalFhNameEn) {
        this.personalFhNameEn = personalFhNameEn;
    }

    @Basic
    @Column(name = "PersonalBirthday")
    public String getPersonalBirthday() {
        return personalBirthday;
    }

    public void setPersonalBirthday(String personalBirthday) {
        this.personalBirthday = personalBirthday;
    }

    @Basic
    @Column(name = "PersonalHomeAddressEN")
    public String getPersonalHomeAddressEn() {
        return personalHomeAddressEn;
    }

    public void setPersonalHomeAddressEn(String personalHomeAddressEn) {
        this.personalHomeAddressEn = personalHomeAddressEn;
    }

    @Basic
    @Column(name = "PersonalBirthPlace")
    public String getPersonalBirthPlace() {
        return personalBirthPlace;
    }

    public void setPersonalBirthPlace(String personalBirthPlace) {
        this.personalBirthPlace = personalBirthPlace;
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
    @Column(name = "PersonalDisc")
    public String getPersonalDisc() {
        return personalDisc;
    }

    public void setPersonalDisc(String personalDisc) {
        this.personalDisc = personalDisc;
    }

    @Basic
    @Column(name = "PersonalHobbies")
    public String getPersonalHobbies() {
        return personalHobbies;
    }

    public void setPersonalHobbies(String personalHobbies) {
        this.personalHobbies = personalHobbies;
    }

    @Basic
    @Column(name = "PersonalDeleted")
    public Integer getPersonalDeleted() {
        return personalDeleted;
    }

    public void setPersonalDeleted(Integer personalDeleted) {
        this.personalDeleted = personalDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DonPersonal that = (DonPersonal) o;

        if (personalId != that.personalId) return false;
      //  if (customerId != that.customerId) return false;
        if (persinalName != null ? !persinalName.equals(that.persinalName) : that.persinalName != null) return false;
        if (personalFamilyName != null ? !personalFamilyName.equals(that.personalFamilyName) : that.personalFamilyName != null)
            return false;
        if (personalGender != null ? !personalGender.equals(that.personalGender) : that.personalGender != null)
            return false;
        if (personalMobileNum != null ? !personalMobileNum.equals(that.personalMobileNum) : that.personalMobileNum != null)
            return false;
        if (personalNameEn != null ? !personalNameEn.equals(that.personalNameEn) : that.personalNameEn != null)
            return false;
        if (personalFamilyNameEn != null ? !personalFamilyNameEn.equals(that.personalFamilyNameEn) : that.personalFamilyNameEn != null)
            return false;
        if (personalPrefix != null ? !personalPrefix.equals(that.personalPrefix) : that.personalPrefix != null)
            return false;
        if (personalPrefixEn != null ? !personalPrefixEn.equals(that.personalPrefixEn) : that.personalPrefixEn != null)
            return false;
        if (personalHomeTel != null ? !personalHomeTel.equals(that.personalHomeTel) : that.personalHomeTel != null)
            return false;
        if (personalHomeFax != null ? !personalHomeFax.equals(that.personalHomeFax) : that.personalHomeFax != null)
            return false;
        if (personalPostalCode != null ? !personalPostalCode.equals(that.personalPostalCode) : that.personalPostalCode != null)
            return false;
        if (personalHomeAddress != null ? !personalHomeAddress.equals(that.personalHomeAddress) : that.personalHomeAddress != null)
            return false;
        if (personalFhName != null ? !personalFhName.equals(that.personalFhName) : that.personalFhName != null)
            return false;
        if (personalFhNameEn != null ? !personalFhNameEn.equals(that.personalFhNameEn) : that.personalFhNameEn != null)
            return false;
        if (personalBirthday != null ? !personalBirthday.equals(that.personalBirthday) : that.personalBirthday != null)
            return false;
        if (personalHomeAddressEn != null ? !personalHomeAddressEn.equals(that.personalHomeAddressEn) : that.personalHomeAddressEn != null)
            return false;
        if (personalBirthPlace != null ? !personalBirthPlace.equals(that.personalBirthPlace) : that.personalBirthPlace != null)
            return false;
        if (personalPassportNo != null ? !personalPassportNo.equals(that.personalPassportNo) : that.personalPassportNo != null)
            return false;
        if (personalBirthCertNo != null ? !personalBirthCertNo.equals(that.personalBirthCertNo) : that.personalBirthCertNo != null)
            return false;
        if (personalPersonalEmail != null ? !personalPersonalEmail.equals(that.personalPersonalEmail) : that.personalPersonalEmail != null)
            return false;
        if (!Arrays.equals(personalPassportScan, that.personalPassportScan)) return false;
        if (!Arrays.equals(personalBirthCertScan, that.personalBirthCertScan)) return false;
        if (personalDisc != null ? !personalDisc.equals(that.personalDisc) : that.personalDisc != null) return false;
        if (personalHobbies != null ? !personalHobbies.equals(that.personalHobbies) : that.personalHobbies != null)
            return false;
        if (personalDeleted != null ? !personalDeleted.equals(that.personalDeleted) : that.personalDeleted != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personalId;
      //  result = 31 * result + customerId;
        result = 31 * result + (persinalName != null ? persinalName.hashCode() : 0);
        result = 31 * result + (personalFamilyName != null ? personalFamilyName.hashCode() : 0);
        result = 31 * result + (personalGender != null ? personalGender.hashCode() : 0);
        result = 31 * result + (personalMobileNum != null ? personalMobileNum.hashCode() : 0);
        result = 31 * result + (personalNameEn != null ? personalNameEn.hashCode() : 0);
        result = 31 * result + (personalFamilyNameEn != null ? personalFamilyNameEn.hashCode() : 0);
        result = 31 * result + (personalPrefix != null ? personalPrefix.hashCode() : 0);
        result = 31 * result + (personalPrefixEn != null ? personalPrefixEn.hashCode() : 0);
        result = 31 * result + (personalHomeTel != null ? personalHomeTel.hashCode() : 0);
        result = 31 * result + (personalHomeFax != null ? personalHomeFax.hashCode() : 0);
        result = 31 * result + (personalPostalCode != null ? personalPostalCode.hashCode() : 0);
        result = 31 * result + (personalHomeAddress != null ? personalHomeAddress.hashCode() : 0);
        result = 31 * result + (personalFhName != null ? personalFhName.hashCode() : 0);
        result = 31 * result + (personalFhNameEn != null ? personalFhNameEn.hashCode() : 0);
        result = 31 * result + (personalBirthday != null ? personalBirthday.hashCode() : 0);
        result = 31 * result + (personalHomeAddressEn != null ? personalHomeAddressEn.hashCode() : 0);
        result = 31 * result + (personalBirthPlace != null ? personalBirthPlace.hashCode() : 0);
        result = 31 * result + (personalPassportNo != null ? personalPassportNo.hashCode() : 0);
        result = 31 * result + (personalBirthCertNo != null ? personalBirthCertNo.hashCode() : 0);
        result = 31 * result + (personalPersonalEmail != null ? personalPersonalEmail.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(personalPassportScan);
        result = 31 * result + Arrays.hashCode(personalBirthCertScan);
        result = 31 * result + (personalDisc != null ? personalDisc.hashCode() : 0);
        result = 31 * result + (personalHobbies != null ? personalHobbies.hashCode() : 0);
        result = 31 * result + (personalDeleted != null ? personalDeleted.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID", nullable = false)
    public DonCustomer getDonCustomerByCustomerIdInPersonal() {
        return donCustomerByCustomerIdInPersonal;
    }

    public void setDonCustomerByCustomerIdInPersonal(DonCustomer donCustomerByCustomerId) {
        this.donCustomerByCustomerIdInPersonal = donCustomerByCustomerId;
    }
}
