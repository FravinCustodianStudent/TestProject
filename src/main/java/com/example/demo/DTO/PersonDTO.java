package com.example.demo.DTO;

import java.time.LocalDate;

public class PersonDTO {

    public PersonDTO(String name, String surname, LocalDate birthdayDate) {
        Name = name;
        Surname = surname;
        BirthdayDate = birthdayDate;
    }
    String Name;
    String Surname;
    LocalDate BirthdayDate;
}
