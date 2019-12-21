package com.company.davaleba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "DAVALEBA_MODEL")
@Entity(name = "davaleba_Model")
public class CarModel extends StandardEntity {
    private static final long serialVersionUID = -882134388970068227L;

    @Column(name = "NAME")
    protected String name;

    @OneToMany(mappedBy = "model")
    protected List<CarManufacturers> carManufacturers;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_ID")
    protected Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<CarManufacturers> getCarManufacturers() {
        return carManufacturers;
    }

    public void setCarManufacturers(List<CarManufacturers> carManufacturers) {
        this.carManufacturers = carManufacturers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}