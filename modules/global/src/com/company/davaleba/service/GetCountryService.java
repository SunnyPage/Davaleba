package com.company.davaleba.service;

import java.util.UUID;

public interface GetCountryService {
    String NAME = "davaleba_GetCountryService";

    String GetCountry(UUID countryId);
}