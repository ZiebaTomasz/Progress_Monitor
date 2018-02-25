package com.tomek;

import com.tomek.domain.User;
import com.tomek.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataLoader {

    private UserRepository userRepository;

    @Autowired
    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void loadUsers(){

        User tomek = new User();
        tomek.setFirstName("Tomek");
        tomek.setLastName("Zięba");
        userRepository.save(tomek);
    }
}
