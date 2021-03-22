package com.mainul.fleetapp.controllers;

import com.mainul.fleetapp.model.State;
import com.mainul.fleetapp.services.CountryService;
import com.mainul.fleetapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {

    @Autowired
    private StateService stateService;

    @Autowired
    private CountryService countryService;
    // get add states
    @GetMapping("/states")
    public String getStates(Model model) {
        List<State> stateList = stateService.getstates();
        model.addAttribute("states", stateList);
        model.addAttribute("countries", countryService.getCountries());
        // StateList.forEach(n -> System.out.println(n.getId()+"----"+n.getCode()+"------"+n.getCapital()+"----"+n.getCapital()));
        return "state";
    }

    // add State
    @PostMapping("/states/addNew")
    public String addNew(State state) {
        stateService.save(state);
        return "redirect:/states";
    }

    // fetch State by id
    @RequestMapping("/states/findById")
    @ResponseBody
    public Optional<State> findById(int id) {
        return stateService.findById(id);

    }

    // update State information
    @RequestMapping(value = "/states/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(State state) {
        stateService.save(state);
        return "redirect:/states";
    }

    // delete State
    @RequestMapping(value = "states/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(int id){
        stateService.delete(id);
        return "redirect:/states";
    }

}
