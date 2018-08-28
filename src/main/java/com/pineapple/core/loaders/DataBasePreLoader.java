package com.pineapple.core.loaders;

import com.pineapple.core.entities.User;
import com.pineapple.core.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBasePreLoader implements CommandLineRunner{

    private final UserRepository userRepository;

    @Autowired
    public DataBasePreLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User("FrodoBeggins", "ring bearer"));
    }
}
