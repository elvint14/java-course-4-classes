package az.et.lesson03.service;

import az.et.lesson03.bean.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
   List<User> findAll();

   Optional<User> findById(Long userId);
}