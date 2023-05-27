package dibe.develop.marketplace.service.impl;

import dibe.develop.marketplace.entity.Person;
import dibe.develop.marketplace.repository.PersonRepository;
import dibe.develop.marketplace.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;
    @Override
    public void save(Person p) {
        this.personRepository.save(p);
    }

    @Override
    public List<Person> findAll() {
        return (List<Person>) this.personRepository.findAll();
    }

    @Override
    public Person findById(Long id) {
        return this.personRepository.findById(id).orElse(null);
    }

    @Override
    public Person findByNameAndSurname(String name, String surname) {
        return this.personRepository.findByNameAndSurname(name, surname);
    }

    @Override
    public Long delete(Person person) {
        Long ret = person.getId();
        this.personRepository.delete(person);
        return ret;
    }
}
