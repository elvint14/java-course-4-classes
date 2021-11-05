package az.et.lesson03.dao;

import az.et.lesson03.bean.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class UserDao1 implements UserDao{
    private static final List<User> USERS = new ArrayList<>(
            Arrays.asList(
                    new User(1L, "Elvin", "Taghizade"),
                    new User(2L, "Parvin", "Etibarli"),
                    new User(3L, "John", "Smith")
            )
    );

    @Override
    public List<User> findAll() {
        return USERS;
    }

    @Override
    public Optional<User> findById(Long userId) {
        return USERS
                .stream()
                .filter(user -> user.getId().equals(userId))
                .findFirst();
    }
}