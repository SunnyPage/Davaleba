package com.company.davaleba.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TypeOfCar implements EnumClass<String> {

    A("Crossover"),
    B("Station wagon"),
    C("Sedan");

    private String id;

    TypeOfCar(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TypeOfCar fromId(String id) {
        for (TypeOfCar at : TypeOfCar.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}