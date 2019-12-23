package com.company.davaleba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@NamePattern("%s|name")
@Table(name = "DAVALEBA_LEGAL_ENTITY")
@Entity(name = "davaleba_LegalEntity")
public class LegalEntity extends StandardEntity {
    private static final long serialVersionUID = -6055240521053488770L;

    @Column(name = "NAME")
    protected String name;

    @Lob
    @Column(name = "IDENTIFICATION_NUMBER_AND_ADDRESS")
    protected String identificationNumberAndAddress;

    @Column(name = "TELEPHONE")
    protected String telephone;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}