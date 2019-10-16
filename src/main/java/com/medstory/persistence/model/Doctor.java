package com.medstory.persistence.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Doctor {

    @Id
    private Long cedula;
    private String specialty;

    @OneToOne(cascade = {CascadeType.ALL})
    private Person personalData;

    public Doctor() {
    }

}
