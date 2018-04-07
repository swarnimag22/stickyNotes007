package com.stickynotes.service.impl;

import com.stickynotes.dao.UserRepository;
import com.stickynotes.entity.UserEntity;
import com.stickynotes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String createUser(String name, String emailId, String password, Boolean isActive) {
        UserEntity user = new UserEntity();
        try {
            user.setName(name);
            user.setEmailId(emailId);
            user.setPassword(password);
            user.setActive(isActive);
            userRepository.save(user);
        }catch(Exception e){
            return "FAILED";
        }
        return "SUCCESS";
    }
}
