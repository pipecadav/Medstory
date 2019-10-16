package com.medstory.persistence.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Person {

    @Id
    private Long cedula;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String age;

    public Person() {
    }

}
