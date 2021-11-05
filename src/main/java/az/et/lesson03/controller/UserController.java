package az.et.lesson03.controller;

import az.et.lesson03.bean.User;

import java.util.List;
import java.util.Optional;

public interface UserController {
    List<User> findAll();

    Optional<User> findById(Long userId);
}
