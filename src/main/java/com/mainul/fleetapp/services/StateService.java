package com.mainul.fleetapp.services;

import com.mainul.fleetapp.model.State;
import com.mainul.fleetapp.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;

    public List<State> getstates(){
        return stateRepository.findAll();
    }

    public void save(State State) {
        stateRepository.save(State);
    }

    public Optional<State> findById(int id){
        return stateRepository.findById(id);
    }

    public void delete(int id) {
        stateRepository.deleteById(id);
    }

}
