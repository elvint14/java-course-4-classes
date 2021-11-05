package az.et.lesson03;

import az.et.lesson03.bean.User;
import az.et.lesson03.controller.UserController;
import az.et.lesson03.controller.UserController1;
import az.et.lesson03.controller.UserController2;
import az.et.lesson03.dao.UserDao;
import az.et.lesson03.dao.UserDao1;
import az.et.lesson03.dao.UserDao2;
import az.et.lesson03.service.UserService;
import az.et.lesson03.service.UserService1;
import az.et.lesson03.service.UserService2;

public class UserApp {
    public static void mainV1(String[] args) {
        // constructor injection
        final UserDao userDao1 = new UserDao1();
        final UserService userService1 = new UserService1(userDao1);
        final UserController userController1 = new UserController1(userService1);

        System.out.println(userController1.findAll());
        System.out.println(userController1.findById(1L));
        System.out.println(
                userController1
                        .findById(5L)
                        .map(User::getName)
                        .map(String::toUpperCase)
                        .orElse("USER IS NOT PRESENT!")
        );

        System.out.println("Elvin".toUpperCase());
        System.out.println(((String) null).toUpperCase());

    }

    public static void main(String[] args) {
        //setter injection
        final UserDao userDao2 = new UserDao2();

        final UserService2 userService2 = new UserService2();
        userService2.setUserDao(userDao2);

        final UserController2 userController2 = new UserController2();
        userController2.setUserService(userService2);

        System.out.println(userController2.findAll());
        System.out.println(userController2.findById(1L));
        System.out.println(
                userController2
                        .findById(5L)
                        .map(User::getName)
                        .map(String::toUpperCase)
                        .orElse("USER IS NOT PRESENT!")
        );
    }
}