package com.medstory.persistence.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@Entity
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long historyNumber;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Doctor doctor;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Patient patient;

    @OneToOne(cascade = {CascadeType.ALL})
    private Anamnesis anamnesis;

    private String diagnosis;


    public History() {

    }

}
