package com.donkiello.dto;

import com.donkiello.model.entity.common.DonCustomer;

import javax.persistence.*;

/**
 * Created by ussocom on 2/1/2017.
 */

public class DonProgramDTO {
    private Integer programId;
    // private Integer customerId;
    private String programProgramName;
    private String programMasterThesis;
    private String programThesisSubject;
    private String programSecondPayment;
    private String programFirstPayment;
    private String programSupervisor;
    private String programPaymentDisc;
    private Integer programDeleted;
    private String programIsStudying;
    private String programPaymentStatus;
    private DonCustomerDTO donCustomerByCustomerIdInProgram;


    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public String getProgramProgramName() {
        return programProgramName;
    }

    public void setProgramProgramName(String programProgramName) {
        this.programProgramName = programProgramName;
    }


    public String getProgramMasterThesis() {
        return programMasterThesis;
    }

    public void setProgramMasterThesis(String programMasterThesis) {
        this.programMasterThesis = programMasterThesis;
    }

    public String getProgramThesisSubject() {
        return programThesisSubject;
    }

    public void setProgramThesisSubject(String programThesisSubject) {
        this.programThesisSubject = programThesisSubject;
    }


    public String getProgramSecondPayment() {
        return programSecondPayment;
    }

    public void setProgramSecondPayment(String programSecondPayment) {
        this.programSecondPayment = programSecondPayment;
    }


    public String getProgramFirstPayment() {
        return programFirstPayment;
    }

    public void setProgramFirstPayment(String programFirstPayment) {
        this.programFirstPayment = programFirstPayment;
    }


    public String getProgramSupervisor() {
        return programSupervisor;
    }

    public void setProgramSupervisor(String programSupervisor) {
        this.programSupervisor = programSupervisor;
    }


    public String getProgramPaymentDisc() {
        return programPaymentDisc;
    }

    public void setProgramPaymentDisc(String programPaymentDisc) {
        this.programPaymentDisc = programPaymentDisc;
    }


    public Integer getProgramDeleted() {
        return programDeleted;
    }

    public void setProgramDeleted(Integer programDeleted) {
        this.programDeleted = programDeleted;
    }


    public String getProgramIsStudying() {
        return programIsStudying;
    }

    public void setProgramIsStudying(String programIsStudying) {
        this.programIsStudying = programIsStudying;
    }


    public String getProgramPaymentStatus() {
        return programPaymentStatus;
    }

    public void setProgramPaymentStatus(String programPaymentStatus) {
        this.programPaymentStatus = programPaymentStatus;
    }

    public DonCustomerDTO getDonCustomerByCustomerIdInProgram() {
        return donCustomerByCustomerIdInProgram;
    }

    public void setDonCustomerByCustomerIdInProgram(DonCustomerDTO donCustomerByCustomerIdInProgram) {
        this.donCustomerByCustomerIdInProgram = donCustomerByCustomerIdInProgram;
    }
}
