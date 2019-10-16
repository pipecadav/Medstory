package com.medstory.persistence.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Collection;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@Entity
public class Patient {

    @Id
    private Long cc;
    private boolean activePatient;
    private String eps;

    @OneToOne(cascade = {CascadeType.ALL})
    Person personalData;


    public Patient() {
    }

}
