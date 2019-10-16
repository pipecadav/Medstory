package com.medstory.service;

import com.medstory.persistence.model.Patient;
import com.medstory.persistence.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient getPatient(Long cedula){
        return patientRepository.getOne(cedula);
    }
}
