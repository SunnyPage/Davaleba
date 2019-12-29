package com.company.davaleba.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

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

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "carModel")
    protected List<Characteristics> characteristics;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_ID")
    protected Car car;

    public List<Characteristics> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<Characteristics> characteristics) {
        this.characteristics = characteristics;
    }

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