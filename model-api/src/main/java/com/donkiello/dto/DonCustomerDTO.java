package com.donkiello.dto;

import java.util.List;

/**
 * Created by ussocom on 2/1/2017.
 */

public class DonCustomerDTO {
    private Integer customerId;
    private String customerRate;
    private String customerEcoRate;
    private Integer customerDeleted;
    private String customerNameEN;
    private String customerNameFA;
    private byte[] customerImage;
    private String customerPrograms;
    private String customerPaymentStatus;
    private List<DonBussinessDTO> donBusinessesByCustomerId;
    private List<DonPastDTO> donPastsByCustomerId;
    private List<DonPersonalDTO> donPersonalsByCustomerId;
    private List<DonProgramDTO> donProgramsByCustomerId;

    private String FirstBusinessNameEN;
    private String FirstBusinessAddressEN;
    private String FirstBusinessCityEN;
    private String FirstBusinessCountryEN;

    private String FirstBusinessNameFA;
    private String FirstBusinessAddressFA;
    private String FirstBusinessCityFA;
    private String FirstBusinessCountryFA;

    private  String FirstMobileNumber;



    private String FirstBusinessField;
    private String FirstBusinessEmail;



    private DonBussinessDTO FirstBusiness;
    private DonPersonalDTO FirstPersonal;


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
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

    public String getCustomerNameEN() {
        return customerNameEN;
    }

    public void setCustomerNameEN(String customerNameEN) {
        this.customerNameEN = customerNameEN;
    }

    public String getCustomerNameFA() {
        return customerNameFA;
    }

    public void setCustomerNameFA(String customerNameFA) {
        this.customerNameFA = customerNameFA;
    }

    public byte[] getCustomerImage() {
        return customerImage;
    }

    public void setCustomerImage(byte[] customerImage) {
        this.customerImage = customerImage;
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


    public List<DonBussinessDTO> getDonBusinessesByCustomerId() {
        return donBusinessesByCustomerId;
    }

    public void setDonBusinessesByCustomerId(List<DonBussinessDTO> donBusinessesByCustomerId) {
        this.donBusinessesByCustomerId = donBusinessesByCustomerId;
    }

    public List<DonPersonalDTO> getDonPersonalsByCustomerId() {
        return donPersonalsByCustomerId;
    }

    public void setDonPersonalsByCustomerId(List<DonPersonalDTO> donPersonalsByCustomerId) {
        this.donPersonalsByCustomerId = donPersonalsByCustomerId;
    }

    public List<DonPastDTO> getDonPastsByCustomerId() {
        return donPastsByCustomerId;
    }

    public void setDonPastsByCustomerId(List<DonPastDTO> donPastsByCustomerId) {
        this.donPastsByCustomerId = donPastsByCustomerId;
    }

    public List<DonProgramDTO> getDonProgramsByCustomerId() {
        return donProgramsByCustomerId;
    }

    public void setDonProgramsByCustomerId(List<DonProgramDTO> donProgramsByCustomerId) {
        this.donProgramsByCustomerId = donProgramsByCustomerId;
    }

    public void setFirstBusinessNameFA(String firstBusinessNameFA){
        this.FirstBusinessNameFA = firstBusinessNameFA;
    }

    public String getFirstBusinessNameFA(){
        if(donBusinessesByCustomerId != null && donBusinessesByCustomerId.size() > 0 )
        {
            FirstBusinessNameFA = donBusinessesByCustomerId.get(0).getBusinessNameFa();
        }
        else
            {
                 FirstBusinessNameFA ="";
            }

        return FirstBusinessNameFA;
    }

    public String getFirstBusinessAddressFA() {
        if(donBusinessesByCustomerId != null && donBusinessesByCustomerId.size() > 0)
        {
            FirstBusinessAddressFA = donBusinessesByCustomerId.get(0).getBusinessAddressFa();
        }
        else
        {
            FirstBusinessNameFA ="";
        }

        return FirstBusinessAddressFA;
    }

    public void setFirstBusinessAddressFA(String firstBusinessAddressFA) {
        FirstBusinessAddressFA = firstBusinessAddressFA;
    }

    public String getFirstBusinessCityFA() {

        if(donBusinessesByCustomerId != null && donBusinessesByCustomerId.size() > 0)
        {
            FirstBusinessCityFA = donBusinessesByCustomerId.get(0).getBusinessCityFa();
        }
        else
        {
            FirstBusinessCityFA ="";
        }

        return FirstBusinessCityFA;
    }

    public void setFirstBusinessCityFA(String firstBusinessCityFA) {
        FirstBusinessCityFA = firstBusinessCityFA;
    }

    public String getFirstBusinessCountryFA() {

        if(donBusinessesByCustomerId != null && donBusinessesByCustomerId.size() > 0)
        {
            FirstBusinessCountryFA = donBusinessesByCustomerId.get(0).getBusinessCountryFa();
        }
        else
        {
            FirstBusinessCountryFA ="";
        }

        return FirstBusinessCountryFA;
    }

    public void setFirstBusinessCountryFA(String firstBusinessCountryFA) {
        FirstBusinessCountryFA = firstBusinessCountryFA;
    }


    public String getFirstBusinessNameEN() {
        if(donBusinessesByCustomerId != null && donBusinessesByCustomerId.size() > 0 )
        {
            FirstBusinessNameEN = donBusinessesByCustomerId.get(0).getBusinessNameEn();
        }
        else
        {
            FirstBusinessNameEN ="";
        }

        return FirstBusinessNameEN;
    }

    public void setFirstBusinessNameEN(String firstBusinessNameEN) {
        FirstBusinessNameEN = firstBusinessNameEN;
    }

    public String getFirstBusinessAddressEN() {
        if(donBusinessesByCustomerId != null && donBusinessesByCustomerId.size() > 0)
        {
            FirstBusinessAddressEN = donBusinessesByCustomerId.get(0).getBusinessAddressEn();
        }
        else
        {
            FirstBusinessAddressEN ="";
        }

        return FirstBusinessAddressEN;
    }

    public void setFirstBusinessAddressEN(String firstBusinessAddressEN) {
        FirstBusinessAddressEN = firstBusinessAddressEN;
    }

    public String getFirstBusinessCityEN() {
        if(donBusinessesByCustomerId != null && donBusinessesByCustomerId.size() > 0)
        {
            FirstBusinessCityEN = donBusinessesByCustomerId.get(0).getBusinessCityEn();
        }
        else
        {
            FirstBusinessCityEN ="";
        }
        return FirstBusinessCityEN;
    }

    public void setFirstBusinessCityEN(String firstBusinessCityEN) {
        FirstBusinessCityEN = firstBusinessCityEN;
    }

    public String getFirstBusinessCountryEN() {
        if(donBusinessesByCustomerId != null && donBusinessesByCustomerId.size() > 0)
        {
            FirstBusinessCountryEN = donBusinessesByCustomerId.get(0).getBusinessCountryEn();
        }
        else
        {
            FirstBusinessCountryEN ="";
        }

        return FirstBusinessCountryEN;
    }

    public void setFirstBusinessCountryEN(String firstBusinessCountryEN) {
        FirstBusinessCountryEN = firstBusinessCountryEN;
    }

    public String getFirstBusinessField() {
        if(donBusinessesByCustomerId != null && donBusinessesByCustomerId.size() > 0)
        {
            FirstBusinessField = donBusinessesByCustomerId.get(0).getBusinessField();
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

        if(donBusinessesByCustomerId != null && donBusinessesByCustomerId.size() > 0)
        {
            FirstBusinessEmail = donBusinessesByCustomerId.get(0).getBusinessEmail();
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

    public DonBussinessDTO getFirstBusiness() {

        if(donBusinessesByCustomerId != null && donBusinessesByCustomerId.size() > 0)
        {
            FirstBusiness = donBusinessesByCustomerId.get(0);
        }
        else
        {
            FirstBusiness = new DonBussinessDTO();
        }


        return FirstBusiness;
    }

    public void setFirstBusiness(DonBussinessDTO firstBusiness) {
        FirstBusiness = firstBusiness;
    }

    public DonPersonalDTO getFirstPersonal() {

        if(donPersonalsByCustomerId != null && donPersonalsByCustomerId.size() > 0)
        {
            FirstPersonal  = donPersonalsByCustomerId.get(0);
        }
        else
        {
            FirstPersonal = new DonPersonalDTO();
        }

        return FirstPersonal;
    }

    public void setFirstPersonal(DonPersonalDTO firstPersonal) {
        FirstPersonal = firstPersonal;
    }

    public String getFirstMobileNumber() {

        if(donPersonalsByCustomerId != null && donPersonalsByCustomerId.size() > 0)
        {
            FirstMobileNumber = donPersonalsByCustomerId.get(0).getPersonalMobileNum();
        }
        else
        {
            FirstMobileNumber ="";
        }


        return FirstMobileNumber;
    }

    public void setFirstMobileNumber(String firstMobileNumber) {
        FirstMobileNumber = firstMobileNumber;
    }
}
