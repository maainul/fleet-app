package com.mainul.fleetapp.controllers;

import com.mainul.fleetapp.model.Country;
import com.mainul.fleetapp.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    // get add countries
    @GetMapping("/countries")
    public String getCountries(Model model) {
        List<Country> countryList = countryService.getCountries();
        model.addAttribute("countries", countryList);
        // countryList.forEach(n -> System.out.println(n.getId()+"----"+n.getCode()+"------"+n.getCapital()+"----"+n.getCapital()));
        return "country";
    }

    // add country
    @PostMapping("/countries/addNew")
    public String addNew(Country country) {
        countryService.save(country);
        return "redirect:/countries";
    }

    // fetch country by id
    @RequestMapping("/countries/findById")
    @ResponseBody
    public Optional<Country> findById(int id) {
        return countryService.findById(id);

    }

    // update country information
    @RequestMapping(value = "/countries/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Country country) {
        countryService.save(country);
        return "redirect:/countries";
    }

    // delete country
    @RequestMapping(value = "countries/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(int id){
        countryService.delete(id);
        return "redirect:/countries";
    }

}
