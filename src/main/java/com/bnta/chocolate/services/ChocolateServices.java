package com.bnta.chocolate.services;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChocolateServices {

    @Autowired
    ChocolateRepository chocolateRepository;

//    @Autowired
//    EstateService estateService;
//
//    @Autowired
//    EstateRepository estateRepository;

    public List<Chocolate> getAllChocolates(){
        return chocolateRepository.findAll();
    }

//    public List<Chocolate> getAllChocolatesByEstateId(Long id){
//        return chocolateRepository.findAllById(id);
//    }



}
