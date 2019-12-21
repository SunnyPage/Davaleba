package com.company.davaleba.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "DAVALEBA_ASSEMBLY")
@Entity(name = "davaleba_Assembly")
public class Assembly extends StandardEntity {
    private static final long serialVersionUID = 6411491084350059341L;

    @Column(name = "PRICE")
    protected BigDecimal price;

    @Column(name = "TYPE_OF_CAR")
    protected String typeOfCar;

    @Column(name = "NOTE")
    protected String note;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_ID")
    protected Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public TypeOfCar getTypeOfCar() {
        return typeOfCar == null ? null : TypeOfCar.fromId(typeOfCar);
    }

    public void setTypeOfCar(TypeOfCar typeOfCar) {
        this.typeOfCar = typeOfCar == null ? null : typeOfCar.getId();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}