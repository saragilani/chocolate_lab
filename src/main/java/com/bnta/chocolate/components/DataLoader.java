package com.bnta.chocolate.components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
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

    Chocolate chocolate1 = new Chocolate("Bounty", 50, estate1);
    Chocolate chocolate2 = new Chocolate("Toblerone", 60, estate2);
    Chocolate chocolate3 = new Chocolate("Malteser", 65, estate3);
    Chocolate chocolate4 = new Chocolate("Ferrero Rocher", 70, estate1);
    Chocolate chocolate5 = new Chocolate("Lindt", 63, estate2);
    Chocolate chocolate6 = new Chocolate("Mars", 33, estate3);

    chocolateRepository.save(chocolate1);
    chocolateRepository.save(chocolate2);
    chocolateRepository.save(chocolate3);
    chocolateRepository.save(chocolate4);
    chocolateRepository.save(chocolate5);
    chocolateRepository.save(chocolate6);

    }


}
