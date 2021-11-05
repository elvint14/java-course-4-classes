package az.et.lesson03.controller;

import az.et.lesson03.bean.User;
import az.et.lesson03.service.UserService;
import az.et.lesson03.service.UserService1;

import java.util.List;
import java.util.Optional;

public class UserController2 implements UserController{
    private UserService userService;

    public UserController2() {
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public List<User> findAll() {
        return userService.findAll();
    }

    public Optional<User> findById(Long userId) {
        return userService.findById(userId);
    }
}
