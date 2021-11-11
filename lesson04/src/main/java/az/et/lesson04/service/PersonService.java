package az.et.lesson04.service;

import az.et.lesson04.bean.Person;
import az.et.lesson04.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Optional<Person> findPersonById(Long personId) {
        return personRepository.findById(personId);
    }
}