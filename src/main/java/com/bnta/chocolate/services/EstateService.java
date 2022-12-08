package com.bnta.chocolate.services;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstateService {

    @Autowired
    EstateRepository estateRepository;

    @Autowired
    ChocolateServices chocolateServices;



    public List<Estate> getAllEstates(){
        return estateRepository.findAll();
    }

    public Optional<Estate> getEstatesById(Long id) {
        return estateRepository.findById(id);
    }

    public Estate addEstate(Estate estate){
        estateRepository.save(estate);
        return estate;
    }
}
