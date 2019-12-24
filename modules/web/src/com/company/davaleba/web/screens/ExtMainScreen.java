package com.company.davaleba.web.screens;

import com.company.davaleba.entity.Country;
import com.company.davaleba.entity.ExtUser;
import com.company.davaleba.service.GetCountryService;
import com.haulmont.cuba.core.entity.ReferenceToEntity;
import com.haulmont.cuba.core.global.*;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.web.app.main.MainScreen;

import javax.inject.Inject;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import java.util.UUID;


@UiController("extMainScreen")
@UiDescriptor("ext-main-screen.xml")
public class ExtMainScreen extends MainScreen {

    @Inject
    private DataManager dataManager;

    @Inject
    private Metadata metadata;

    @Inject
    private Persistence persistence;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        /*User user = userSessionSource.getUserSession().getUser();
        UUID userId = user.getId();
        String Country = CountryService.GetCountry(userId);
        if (Country != null)
        {
            LoadContext<ExtUser> lc = new LoadContext<>(ExtUser.class);
            lc.setQueryString(
                    "select * from ExtUser where user = userId")
                    .setParameter("userId", userId);

            List<ExtUser> list = dataManager.loadList(lc);

            if (list.size() == 0) {
                ExtUser extUser = metadata.create(ExtUser.class);

                LoadContext<com.company.davaleba.entity.Country> lc2 = new LoadContext<>(Country.class);
                lc.setQueryString(
                        "select * from Country where user = userId")
                        .setParameter("userId", userId);

                List<ExtUser> list2 = dataManager.loadList(lc);

                if (list2.size() > 0) {


                    // dataManager.load(Country.class).id(userId).view("book.edit").one()
                    //dataManager.load();
                    //extUser.setCountry(Country);
                    //dataManager.commit(user);
                }
            }
        }*/
    }
}