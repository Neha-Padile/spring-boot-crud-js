package com.spring_boot_crud_js.service;

import com.spring_boot_crud_js.model.User;
import com.spring_boot_crud_js.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public Optional<User> getUserById(int id){
       return userRepo.findById(id);
    }
    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    public User saveUser(User user){
        return userRepo.save(user);
    }
    public void deleteUser(int id){
        userRepo.deleteById(id);
    }


}
