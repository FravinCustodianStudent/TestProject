package com.example.demo.DTO;

import java.time.LocalDate;
import java.util.Date;

public class PersonDTO {
    String Name;
    String Surname;
    int Age;

    public PersonDTO() {
    }

    public PersonDTO(String name, String surname, LocalDate birthdayDate) {
        Name = name;
        Surname = surname;
        Age = LocalDate.now().getYear()-birthdayDate.getYear();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
