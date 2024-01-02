package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonRepository Person;
//    @GetMapping("/Person")
//    public  Person createPerson(Person p){
//
//       return new Person() ;
//    }
//    public Person getPerson(int id){
//       return new Person();
//    }
//    public List<Person> getPersonList(){
//
//    }
//    public Person updatePerson(Person p){
//
//    }
//    public void DeletePerson(int id){
//
//    }
}
