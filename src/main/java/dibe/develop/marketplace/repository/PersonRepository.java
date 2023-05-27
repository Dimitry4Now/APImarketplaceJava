package dibe.develop.marketplace.repository;

import dibe.develop.marketplace.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
    public Person findByNameAndSurname(String name, String surname);
}