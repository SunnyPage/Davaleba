package com.company.davaleba.web.screens.carmanufacturers;

import com.haulmont.cuba.gui.screen.*;
import com.company.davaleba.entity.CarManufacturers;

@UiController("davaleba_CarManufacturing.edit")
@UiDescriptor("car-manufacturers-edit.xml")
@EditedEntityContainer("carManufacturersDc")
@LoadDataBeforeShow
public class CarManufacturersEdit extends StandardEditor<CarManufacturers> {
}