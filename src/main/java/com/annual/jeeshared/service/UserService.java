package com.annual.jeeshared.service;

import com.annual.jeeshared.entity.User;
import com.annual.jeeshared.enums.Role;
import com.annual.jeeshared.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends GenericService<User, UserRepository> {

    private static final Logger logger = LogManager.getLogger(UserService.class);

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository) {
        super.repository = userRepository;
    }

    public List<User> getByName(String name) {
        return repository.findByName(name);
    }

    public User getByEmail(String email) {
        return repository.findByEmail(email);
    }

    public User getUserByEmailAndPassword(String email, String password) {
        return repository.findByEmailAndPassword(email, password);
    }

    public User save(User user, boolean encodePassword) {
        if (encodePassword)
            user.setPassword(passwordEncoder.encode(user.getPassword()));

        return super.save(user);
    }

}