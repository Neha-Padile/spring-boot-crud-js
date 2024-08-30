package com.spring_boot_crud_js.controller;

import com.spring_boot_crud_js.model.User;
import com.spring_boot_crud_js.service.UserService;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping("{id}")
    public  void deleteUser(@PathVariable int id){
        userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user){
        user.setId(id);
        return userService.saveUser(user);

    }
    @PutMapping("/{id}")
    public User updateUserList(@PathVariable int id, @RequestBody User user){
        user.setId(id);
        return userService.saveUser(user);

    }





}
