package com.company.davaleba.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.EmbeddableEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@NamePattern("%s|name")
@MetaClass(name = "davaleba_Components")
@Embeddable
public class Components extends EmbeddableEntity {
    private static final long serialVersionUID = -4312311105643891712L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "PRICE")
    protected String price;

    @Column(name = "TYPE_OF_CAR")
    protected String typeOfCar;

    @Column(name = "NOTE")
    protected String note;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}