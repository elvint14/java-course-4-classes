package az.et.lesson03.controller;

import az.et.lesson03.bean.User;
import az.et.lesson03.service.UserService;
import az.et.lesson03.service.UserService1;

import java.util.List;
import java.util.Optional;

public class UserController1 implements UserController{
    private final UserService userService1;

    public UserController1(UserService userService1) {
        this.userService1 = userService1;
    }

    public List<User> findAll() {
        return userService1.findAll();
    }

    public Optional<User> findById(Long userId) {
        return userService1.findById(userId);
    }
}
