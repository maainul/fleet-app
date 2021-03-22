package com.mainul.fleetapp.services;

import com.mainul.fleetapp.model.Country;
import com.mainul.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries(){
        return countryRepository.findAll();
    }

    public void save(Country country) {
    	countryRepository.save(country);
    }

    public Optional<Country> findById(int id){
        return countryRepository.findById(id);
    }

    public void delete(int id) {
        countryRepository.deleteById(id);
    }
}
