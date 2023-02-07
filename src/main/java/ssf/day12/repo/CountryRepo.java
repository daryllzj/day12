package ssf.day12.repo;

import java.util.ArrayList;
import java.util.List;

import ssf.day12.model.Country;

public class CountryRepo {

    List<Country> countryList;

    public List<Country> getAllCountries() {

        countryList = new ArrayList<>();

        Country country = new Country("SG", "Singapore", 1000);
        countryList.add(country);

        country = new Country("MY", "Malaysia", 2000);
        countryList.add(country);

        country = new Country("HK", "Hong Kong", 4000);
        countryList.add(country);

        return countryList;
        
    }

    public Boolean createCountry(Country country) {

        if (countryList == null) {
            countryList = new ArrayList<>();
        }

        countryList.add(country);

        return true;
        
    }
    
}
