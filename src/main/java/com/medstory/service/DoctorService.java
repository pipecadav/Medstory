package com.medstory.service;

import com.medstory.persistence.model.Doctor;
import com.medstory.persistence.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    public Doctor getDoctor(Long professionalCard){
        return doctorRepository.getOne(professionalCard);
    }
}
