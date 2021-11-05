package az.et.lesson03.dao;

import az.et.lesson03.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao {
    List<User> findAll();

    Optional<User> findById(Long userId);
}
