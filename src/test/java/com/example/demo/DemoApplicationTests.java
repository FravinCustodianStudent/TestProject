package com.example.demo;

import com.example.demo.DTO.PersonDTO;
import com.example.demo.controllers.PersonController;
import com.example.demo.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.HttpServerErrorException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private PersonController personController;
    @Autowired
    private PersonRepository personRepository;
    @Test
    void CheckExceptionSituation() throws Exception{
        assertThrows(HttpServerErrorException.class, ()->{
           personController.GetPersonById(-1);
        });
        assertThrows(HttpServerErrorException.class, ()->{
            personController.GetPersonById(0);
        });

    }
    @Test
    void CheckTypicalSituation() throws Error{
        assertThat(personController.GetPersonById(1))
                .isNotNull()
                .isInstanceOf(PersonDTO.class);

    }
    @Test
    void CheckResponseAge(){
        assertThat(personController.GetPersonById(1).getAge())
                .isNotNull()
                .isGreaterThan(0);

    }
}
