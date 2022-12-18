package com.example.demo.controllers;

import ch.qos.logback.core.joran.conditional.IfAction;
import com.example.demo.DTO.PersonDTO;
import com.example.demo.repositories.PersonRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/Person/{Id}")
    public PersonDTO GetPersonById(@PathVariable int Id){

        try {
            if (Id <=0) throw new HttpServerErrorException(HttpStatus.BAD_REQUEST);
            var person = personRepository.findPersonById(Id);
             return new PersonDTO(person.getName(),person.getSurname(),person.getBirthdayDate());

        }catch (Exception ex){
            throw ex;
        }
    }
}
