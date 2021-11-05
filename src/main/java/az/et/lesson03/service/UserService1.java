package az.et.lesson03.service;

import az.et.lesson03.bean.User;
import az.et.lesson03.dao.UserDao;

import java.util.List;
import java.util.Optional;


public class UserService1 implements UserService{
    private final UserDao userDao1;

    public UserService1(UserDao userDao1) {
        this.userDao1 = userDao1;
    }

    public List<User> findAll() {
        return userDao1.findAll();
    }

    public Optional<User> findById(Long userId) {
        return userDao1.findById(userId);
    }
}