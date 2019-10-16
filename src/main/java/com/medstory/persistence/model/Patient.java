package com.medstory.persistence.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Collection;

@Data
@Entity
public class Patient {

    @Id
    private Long cedula;
    private boolean activePatient;
    private String eps;

    @OneToOne(cascade = {CascadeType.ALL})
    Person personalData;


    public Patient() {
    }

}
