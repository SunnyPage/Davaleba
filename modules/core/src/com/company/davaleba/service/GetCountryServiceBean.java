package com.company.davaleba.service;

import com.company.davaleba.core.CountryBean;
import com.company.davaleba.core.NumberOfDocumentsBean;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.UUID;

@Service(GetCountryService.NAME)
public class GetCountryServiceBean implements GetCountryService {
    @Inject
    private CountryBean Country;

    //@Transactional
    //@Override
    public String GetCountry(UUID countryId)
    {
        return Country.GetCountry(countryId);
    }
}
