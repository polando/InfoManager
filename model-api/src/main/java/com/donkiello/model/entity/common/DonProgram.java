package com.donkiello.model.entity.common;

import javax.persistence.*;

/**
 * Created by ussocom on 2/1/2017.
 */
@Entity
@Table(name = "don_program", schema = "dondb")
public class DonProgram {
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
    private DonCustomer donCustomerByCustomerIdInProgram;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProgramID")
    public Integer getProgramId() {
        return programId;
    }

    public void setProgramId(Integer programId) {
        this.programId = programId;
    }


    @Basic
    @Column(name = "ProgramProgramName")
    public String getProgramProgramName() {
        return programProgramName;
    }

    public void setProgramProgramName(String programProgramName) {
        this.programProgramName = programProgramName;
    }

    @Basic
    @Column(name = "ProgramMasterThesis")
    public String getProgramMasterThesis() {
        return programMasterThesis;
    }

    public void setProgramMasterThesis(String programMasterThesis) {
        this.programMasterThesis = programMasterThesis;
    }

    @Basic
    @Column(name = "ProgramThesisSubject")
    public String getProgramThesisSubject() {
        return programThesisSubject;
    }

    public void setProgramThesisSubject(String programThesisSubject) {
        this.programThesisSubject = programThesisSubject;
    }

    @Basic
    @Column(name = "ProgramSecondPayment")
    public String getProgramSecondPayment() {
        return programSecondPayment;
    }

    public void setProgramSecondPayment(String programSecondPayment) {
        this.programSecondPayment = programSecondPayment;
    }

    @Basic
    @Column(name = "ProgramFirstPayment")
    public String getProgramFirstPayment() {
        return programFirstPayment;
    }

    public void setProgramFirstPayment(String programFirstPayment) {
        this.programFirstPayment = programFirstPayment;
    }

    @Basic
    @Column(name = "ProgramSupervisor")
    public String getProgramSupervisor() {
        return programSupervisor;
    }

    public void setProgramSupervisor(String programSupervisor) {
        this.programSupervisor = programSupervisor;
    }

    @Basic
    @Column(name = "ProgramPaymentDisc")
    public String getProgramPaymentDisc() {
        return programPaymentDisc;
    }

    public void setProgramPaymentDisc(String programPaymentDisc) {
        this.programPaymentDisc = programPaymentDisc;
    }

    @Basic
    @Column(name = "ProgramDeleted")
    public Integer getProgramDeleted() {
        return programDeleted;
    }

    public void setProgramDeleted(Integer programDeleted) {
        this.programDeleted = programDeleted;
    }

    @Basic
    @Column(name = "ProgramIsStudying")
    public String getProgramIsStudying() {
        return programIsStudying;
    }

    public void setProgramIsStudying(String programIsStudying) {
        this.programIsStudying = programIsStudying;
    }

    @Basic
    @Column(name = "ProgramPaymentStatus")
    public String getProgramPaymentStatus() {
        return programPaymentStatus;
    }

    public void setProgramPaymentStatus(String programPaymentStatus) {
        this.programPaymentStatus = programPaymentStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DonProgram that = (DonProgram) o;

        if (programId != that.programId) return false;
     //   if (customerId != that.customerId) return false;
        if (programProgramName != null ? !programProgramName.equals(that.programProgramName) : that.programProgramName != null)
            return false;
        if (programMasterThesis != null ? !programMasterThesis.equals(that.programMasterThesis) : that.programMasterThesis != null)
            return false;
        if (programThesisSubject != null ? !programThesisSubject.equals(that.programThesisSubject) : that.programThesisSubject != null)
            return false;
        if (programSecondPayment != null ? !programSecondPayment.equals(that.programSecondPayment) : that.programSecondPayment != null)
            return false;
        if (programFirstPayment != null ? !programFirstPayment.equals(that.programFirstPayment) : that.programFirstPayment != null)
            return false;
        if (programSupervisor != null ? !programSupervisor.equals(that.programSupervisor) : that.programSupervisor != null)
            return false;
        if (programPaymentDisc != null ? !programPaymentDisc.equals(that.programPaymentDisc) : that.programPaymentDisc != null)
            return false;
        if (programDeleted != null ? !programDeleted.equals(that.programDeleted) : that.programDeleted != null)
            return false;
        if (programIsStudying != null ? !programIsStudying.equals(that.programIsStudying) : that.programIsStudying != null)
            return false;
        if (programPaymentStatus != null ? !programPaymentStatus.equals(that.programPaymentStatus) : that.programPaymentStatus != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = programId;
    //    result = 31 * result + customerId;
        result = 31 * result + (programProgramName != null ? programProgramName.hashCode() : 0);
        result = 31 * result + (programMasterThesis != null ? programMasterThesis.hashCode() : 0);
        result = 31 * result + (programThesisSubject != null ? programThesisSubject.hashCode() : 0);
        result = 31 * result + (programSecondPayment != null ? programSecondPayment.hashCode() : 0);
        result = 31 * result + (programFirstPayment != null ? programFirstPayment.hashCode() : 0);
        result = 31 * result + (programSupervisor != null ? programSupervisor.hashCode() : 0);
        result = 31 * result + (programPaymentDisc != null ? programPaymentDisc.hashCode() : 0);
        result = 31 * result + (programDeleted != null ? programDeleted.hashCode() : 0);
        result = 31 * result + (programIsStudying != null ? programIsStudying.hashCode() : 0);
        result = 31 * result + (programPaymentStatus != null ? programPaymentStatus.hashCode() : 0);
        return result;
    }


    @ManyToOne
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID", nullable = false)
    public DonCustomer getDonCustomerByCustomerIdInProgram() {
        return donCustomerByCustomerIdInProgram;
    }

    public void setDonCustomerByCustomerIdInProgram(DonCustomer donCustomerByCustomerId) {
        this.donCustomerByCustomerIdInProgram = donCustomerByCustomerId;
    }
}
