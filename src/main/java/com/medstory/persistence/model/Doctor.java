package com.medstory.persistence.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@Entity
public class Doctor {

    @Id
    private Long professionalCard;
    private String specialty;

    @OneToOne(cascade = {CascadeType.ALL})
    private Person personalData;

    public Doctor() {
    }

}
