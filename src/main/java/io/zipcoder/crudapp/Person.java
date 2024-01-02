package io.zipcoder.crudapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
     String firstName ;
     String lastName;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }
}
