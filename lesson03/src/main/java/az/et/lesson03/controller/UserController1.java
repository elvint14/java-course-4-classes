package az.et.lesson03.controller;

import az.et.lesson03.bean.User;
import az.et.lesson03.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Log4j2
@Controller
@RequestMapping("api/v1/users")
public class UserController1 implements UserController {
    private final UserService userService;

    @Autowired
    public UserController1(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/1")
    public List<User> findAll() {
        final List<User> users = userService.findAll();
        users.forEach(user -> log.info("Users from db: " + user));
        return users;
    }

    @GetMapping("/2")
    public Optional<User> findById(Long userId) {
        final Optional<User> userById = userService.findById(5L);
        log.info(
                userById
                        .map(User::toString)
                        .orElse("USER NOT FOUND!")
        );
        return userById;
    }
}