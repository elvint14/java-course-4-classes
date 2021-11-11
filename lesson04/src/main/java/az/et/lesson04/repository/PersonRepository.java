package az.et.lesson04.repository;

import az.et.lesson04.bean.Person;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class PersonRepository {
    private final List<Person> PERSONS = new ArrayList<>(
            Arrays.asList(
                    new Person(1L, "Elvin", "Taghizade", BigDecimal.valueOf(100L)),
                    new Person(2L, "Pervin", "Etibarli", BigDecimal.valueOf(200L)),
                    new Person(3L, "Elvin #2", "Taghizade #2", BigDecimal.valueOf(300L)),
                    new Person(4L, "Elvin #3", "Taghizade #3", BigDecimal.valueOf(400L))

            )
    );

    public List<Person> findAll() {
        return PERSONS;
    }

    public Optional<Person> findById(Long personId) {
        return PERSONS
                .stream()
                .filter(person -> person.getId().equals(personId))
                .findFirst();
    }
}