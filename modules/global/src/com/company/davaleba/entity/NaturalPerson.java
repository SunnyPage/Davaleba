package com.company.davaleba.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "DAVALEBA_NATURAL_PERSON")
@Entity(name = "davaleba_NaturalPerson")
public class NaturalPerson extends StandardEntity {
    private static final long serialVersionUID = -3271034060908410516L;

    @Column(name = "FIRST_NAME_AND_LAST_NAME")
    protected String firstNameAndLastName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "APPLICATION_FOR_THE_PURCHASE_OF_A_CAR_ID")
    protected ApplicationForThePurchaseOfACar applicationForThePurchaseOfACar;

    @Column(name = "TELEPHONE")
    protected String telephone;

    public ApplicationForThePurchaseOfACar getApplicationForThePurchaseOfACar() {
        return applicationForThePurchaseOfACar;
    }

    public void setApplicationForThePurchaseOfACar(ApplicationForThePurchaseOfACar applicationForThePurchaseOfACar) {
        this.applicationForThePurchaseOfACar = applicationForThePurchaseOfACar;
    }

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