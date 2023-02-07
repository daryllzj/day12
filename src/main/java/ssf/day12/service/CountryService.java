package ssf.day12.service;

import java.util.List;

import ssf.day12.model.Country;
import ssf.day12.repo.CountryRepo;

public class CountryService {

    CountryRepo countryRepo;

    public CountryService(){

        countryRepo = new CountryRepo();

    }

    public List<Country> getAllCountries() {

        return countryRepo.getAllCountries();
        
    }

    public Boolean createCountry(Country country) {

        Boolean result = countryRepo.createCountry(country);

        return result;
        
    }
    
}
