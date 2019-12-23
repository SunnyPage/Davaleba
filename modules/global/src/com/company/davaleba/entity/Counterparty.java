package com.company.davaleba.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@Table(name = "DAVALEBA_COUNTERPARTY")
@Entity(name = "davaleba_Counterparty")
public class Counterparty extends StandardEntity {
    private static final long serialVersionUID = 831304745236991229L;

    @Lob
    @Column(name = "IDENTIFICATION_NUMBER_AND_ADDRESS")
    protected String identificationNumberAndAddress;

    @Column(name = "TELEPHONE")
    protected String telephone;

    @Column(name = "FIRST_NAME_AND_LAST_NAME")
    protected String firstNameAndLastName;

    public String getFirstNameAndLastName() {
        return firstNameAndLastName;
    }

    public void setFirstNameAndLastName(String firstNameAndLastName) {
        this.firstNameAndLastName = firstNameAndLastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getIdentificationNumberAndAddress() {
        return identificationNumberAndAddress;
    }

    public void setIdentificationNumberAndAddress(String identificationNumberAndAddress) {
        this.identificationNumberAndAddress = identificationNumberAndAddress;
    }

}