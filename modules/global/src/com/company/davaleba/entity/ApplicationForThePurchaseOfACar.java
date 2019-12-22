package com.company.davaleba.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Table(name = "DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR")
@Entity(name = "davaleba_ApplicationForThePurchaseOfACar")
public class ApplicationForThePurchaseOfACar extends StandardEntity {
    private static final long serialVersionUID = 6756172202595475212L;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_ID")
    protected LegalEntity car;

    @Column(name = "CAR_PAID")
    protected Boolean carPaid;

    @Column(name = "PRICE")
    protected BigDecimal price;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANAGER_ID")
    protected User manager;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "applicationForThePurchaseOfACar")
    protected List<LegalEntity> legalEntityAndNaturalPerson;

    public List<LegalEntity> getLegalEntityAndNaturalPerson() {
        return legalEntityAndNaturalPerson;
    }

    public void setLegalEntityAndNaturalPerson(List<LegalEntity> legalEntityAndNaturalPerson) {
        this.legalEntityAndNaturalPerson = legalEntityAndNaturalPerson;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getCarPaid() {
        return carPaid;
    }

    public void setCarPaid(Boolean carPaid) {
        this.carPaid = carPaid;
    }

    public void setCar(LegalEntity car) {
        this.car = car;
    }

    public LegalEntity getCar() {
        return car;
    }

}