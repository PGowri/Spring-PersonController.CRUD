package io.zipcoder.crudapp;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
