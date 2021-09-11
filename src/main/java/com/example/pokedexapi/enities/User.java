package com.example.pokedexapi.enities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;



@Entity
@Data
@ToString
@Getter
@Setter
public class User {

    @Column(nullable = false)
    private @Id @GeneratedValue Long id;
    private String firstname;
    private String lastname;
    private String username;
    private LocalDate dateOfBirth;
    private Integer age;

    public User(String firstname, String lastname, String username, LocalDate dateOfBirth){
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear() - this.dateOfBirth.getYear();
    }

    public User(){
    }
}
