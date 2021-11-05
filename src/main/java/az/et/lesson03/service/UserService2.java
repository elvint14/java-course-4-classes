package az.et.lesson03.service;

import az.et.lesson03.bean.User;
import az.et.lesson03.dao.UserDao;
import az.et.lesson03.dao.UserDao1;

import java.util.List;
import java.util.Optional;


public class UserService2 implements UserService {
    private UserDao userDao;

    public UserService2() {
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public Optional<User> findById(Long userId) {
        return userDao.findById(userId);
    }
}