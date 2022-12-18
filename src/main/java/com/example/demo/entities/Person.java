package com.example.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import javax.naming.Name;
import java.time.LocalDate;


@Entity
@Table(name = "Person")
public class Person {
    private int Id;




    private String Name;
    private String Surname;
    private LocalDate BirthdayDate;

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public LocalDate getBirthdayDate() {
        return BirthdayDate;
    }
}
