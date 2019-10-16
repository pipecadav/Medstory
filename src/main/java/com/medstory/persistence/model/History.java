package com.medstory.persistence.model;

import lombok.Data;

import javax.persistence.*;

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
