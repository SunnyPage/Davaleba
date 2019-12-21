package com.company.davaleba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "DAVALEBA_CAR")
@Entity(name = "davaleba_Car")
public class Car extends StandardEntity {
    private static final long serialVersionUID = -2472896009759563408L;

    @OneToMany(mappedBy = "car")
    protected List<CarManufacturers> carManufacturers;

    @OneToMany(mappedBy = "car")
    protected List<CarModel> carModel;

    @OneToMany(mappedBy = "car")
    protected List<Assembly> assembly;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "YEAR_OF_ISSUE")
    protected String yearOfIssue;

    @Column(name = "CAR_COST")
    protected String carCost;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "APPLICATION_FOR_THE_PURCHASE_OF_A_CAR_ID")
    protected ApplicationForThePurchaseOfACar applicationForThePurchaseOfACar;

    public ApplicationForThePurchaseOfACar getApplicationForThePurchaseOfACar() {
        return applicationForThePurchaseOfACar;
    }

    public void setApplicationForThePurchaseOfACar(ApplicationForThePurchaseOfACar applicationForThePurchaseOfACar) {
        this.applicationForThePurchaseOfACar = applicationForThePurchaseOfACar;
    }

    public String getCarCost() {
        return carCost;
    }

    public void setCarCost(String carCost) {
        this.carCost = carCost;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Assembly> getAssembly() {
        return assembly;
    }

    public void setAssembly(List<Assembly> assembly) {
        this.assembly = assembly;
    }

    public List<CarModel> getCarModel() {
        return carModel;
    }

    public void setCarModel(List<CarModel> carModel) {
        this.carModel = carModel;
    }

    public List<CarManufacturers> getCarManufacturers() {
        return carManufacturers;
    }

    public void setCarManufacturers(List<CarManufacturers> carManufacturers) {
        this.carManufacturers = carManufacturers;
    }
}