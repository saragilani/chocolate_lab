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



    }


}
