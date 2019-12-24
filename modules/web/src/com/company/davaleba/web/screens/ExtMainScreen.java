package com.company.davaleba.web.screens;

import com.company.davaleba.service.GetCountryService;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.web.app.main.MainScreen;

import javax.inject.Inject;
import java.util.UUID;


@UiController("extMainScreen")
@UiDescriptor("ext-main-screen.xml")
public class ExtMainScreen extends MainScreen {

    @Inject
    protected UserSessionSource userSessionSource;

    GetCountryService CountryService;

    @Subscribe
    public void onInit(InitEvent event) {
        User user = userSessionSource.getUserSession().getUser();
        UUID userId = user.getId();
        CountryService.GetCountry(userId);
    }
}