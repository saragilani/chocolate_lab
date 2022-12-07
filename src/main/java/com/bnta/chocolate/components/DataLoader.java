package com.bnta.chocolate.components;

import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ChocolateRepository chocolateRepository;

    @Autowired
    EstateRepository estateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

    Estate estate1 = new Estate("Mondelez", "Spain");
    Estate estate2 = new Estate("Cadbury", "England");
    Estate estate3 = new Estate("Hersheys", "United States");

    estateRepository.save(estate1);
    estateRepository.save(estate2);
    estateRepository.save(estate3);


    }


}
