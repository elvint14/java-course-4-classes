package az.et.lesson03.service;

import az.et.lesson03.bean.User;
import az.et.lesson03.dao.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService1 implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserService1(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public Optional<User> findById(Long userId) {
        return userDao.findById(userId);
    }
}