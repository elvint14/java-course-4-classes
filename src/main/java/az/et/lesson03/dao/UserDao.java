package az.et.lesson03.dao;

import az.et.lesson03.bean.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    List<User> findAll();

    Optional<User> findById(Long userId);
}
