package dibe.develop.marketplace.service;

import dibe.develop.marketplace.entity.Person;

import java.util.List;

public interface PersonService {
    void save(Person p);
    List<Person> findAll();
    Person findById(Long id);
    Person findByNameAndSurname(String name, String surname);
    Long delete(Person person);
}
