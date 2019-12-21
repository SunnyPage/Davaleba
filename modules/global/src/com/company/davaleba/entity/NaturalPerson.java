package com.company.davaleba.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "DAVALEBA_NATURAL_PERSON")
@Entity(name = "davaleba_NaturalPerson")
public class NaturalPerson extends StandardEntity {
    private static final long serialVersionUID = -3271034060908410516L;

    @Column(name = "FIRST_NAME_AND_LAST_NAME")
    protected String firstNameAndLastName;

    @Column(name = "TELEPHONE")
    protected String telephone;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFirstNameAndLastName() {
        return firstNameAndLastName;
    }

    public void setFirstNameAndLastName(String firstNameAndLastName) {
        this.firstNameAndLastName = firstNameAndLastName;
    }
}