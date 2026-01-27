package com.joaodojava21.meuprojeto.Configuration;

import com.joaodojava21.meuprojeto.Entities.User;
import com.joaodojava21.meuprojeto.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfiguration implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

         User u1 = new User(null,"Maria Brown" , "maria@gmail.com" , "98888888" , "71965332109");
         userRepository.saveAll(Arrays.asList(u1));

    }
}
