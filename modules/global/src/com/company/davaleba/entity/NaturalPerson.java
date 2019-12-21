package com.company.davaleba.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "DAVALEBA_NATURAL_PERSON")
@Entity(name = "davaleba_NaturalPerson")
public class NaturalPerson extends StandardEntity {
    private static final long serialVersionUID = -3271034060908410516L;
}