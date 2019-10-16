package com.medstory.persistence.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Anamnesis {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uuid;
    private double height;
    private double weight;
    private String consultationReason;
    private String currentIllnesses;

    public Anamnesis() {
    }

}
