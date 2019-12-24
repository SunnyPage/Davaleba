package com.company.davaleba.core;

import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import com.haulmont.cuba.core.entity.LocaleHelper;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.GlobalConfig;
import com.haulmont.cuba.core.global.UserSessionSource;
import jdk.nashorn.internal.objects.annotations.Property;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.io.IOException;
import java.io.StringReader;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(CountryBean.NAME)
public class CountryBean {
    public static final String NAME = "davaleba_CountryBean";

    @Inject
    private Persistence persistence;
    @Inject
    protected GlobalConfig globalConfig;

    private final static Logger log = LoggerFactory.getLogger(LocaleHelper.class);

    public String GetCountry(UUID countryId)
    {
        Query query = persistence.getEntityManager().createQuery(
                "select count(*) from ExtUser where country = countryId");
        query.setParameter("countryId", countryId);
        if (query.getFirstResult() == null)
        {
            return getCountryName();
        }

        return "";
    }

    public static String getCountryName() {
        Locale locale = AppBeans.get(UserSessionSource.class).getLocale();
        String localeName = null;

        if (StringUtils.isNotEmpty(locale.getCountry())) {
            return locale.getCountry();
        }

        return null;
    }
}