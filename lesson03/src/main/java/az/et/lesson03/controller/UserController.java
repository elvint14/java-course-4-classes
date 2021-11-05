package az.et.lesson03.controller;

import az.et.lesson03.bean.User;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public interface UserController {
    List<User> findAll();

    Optional<User> findById(Long userId);
}
