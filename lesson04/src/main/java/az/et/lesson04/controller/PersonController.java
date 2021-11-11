package az.et.lesson04.controller;

import az.et.lesson04.bean.Person;
import az.et.lesson04.exception.PersonNotFoundException;
import az.et.lesson04.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/persons")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll() {
        return personService.findAll();
    }

    @GetMapping(path = "/{personId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable(name = "personId") Long personId) {
        return personService.findPersonById(personId)
                .orElseThrow(PersonNotFoundException::new);
    }

}