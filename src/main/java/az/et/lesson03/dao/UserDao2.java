package az.et.lesson03.dao;

import az.et.lesson03.bean.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserDao2 implements UserDao{
    private static final List<User> USERS = new ArrayList<>(
            Arrays.asList(
                    new User(1L, "Elvin", "Taghizade"),
                    new User(2L, "Parvin", "Etibarli"),
                    new User(3L, "John", "Smith")
            )
    );

    public List<User> findAll() {
        return USERS;
    }

    public Optional<User> findById(Long userId) {
        return USERS
                .stream()
                .filter(user -> user.getId().equals(userId))
                .findFirst();
    }
}