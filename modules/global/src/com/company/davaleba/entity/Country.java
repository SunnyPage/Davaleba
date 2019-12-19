package com.company.davaleba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@NamePattern("%s|name")
@Table(name = "DAVALEBA_COUNTRY")
@Entity(name = "davaleba_Country")
public class Country extends StandardEntity {
    private static final long serialVersionUID = -6551375401393798256L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "CODE")
    protected String code;

    @Column(name = "COUNTRY")
    protected String country;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_MANUFACTURERS_ID")
    protected CarManufacturers carManufacturers;

    public CarManufacturers getCarManufacturers() {
        return carManufacturers;
    }

    public void setCarManufacturers(CarManufacturers carManufacturers) {
        this.carManufacturers = carManufacturers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}