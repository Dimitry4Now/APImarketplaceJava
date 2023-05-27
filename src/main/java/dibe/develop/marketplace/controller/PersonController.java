package dibe.develop.marketplace.controller;

import dibe.develop.marketplace.entity.Person;
import dibe.develop.marketplace.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {
    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public List<Person> getPerson(){
        return (List<Person>) personRepository.findAll();
    }

    @PostMapping
    void addPerson(@RequestBody Person person){
        personRepository.save(person);
    }
}
