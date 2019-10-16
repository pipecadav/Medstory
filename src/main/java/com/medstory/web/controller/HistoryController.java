package com.medstory.web.controller;

import com.medstory.persistence.model.History;
import com.medstory.persistence.model.Patient;
import com.medstory.service.DoctorService;
import com.medstory.service.HistoryService;
import com.medstory.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private DoctorService doctorService;

    @GetMapping(value="/histories")
    public List<History> getAll(){
        return historyService.getAllHistories();
    }

    @GetMapping(value="/histories/patient/{cc}")
    public List<History> historiesByPatient(@PathVariable Long cc){
        return historyService.findByPatient(patientService.getPatient(cc));
    }

    @GetMapping(value="/histories/doctor/{professionalCard}")
    public List<History> historiesByDoctor(@PathVariable Long professionalCard){
        return historyService.findByDoctor(doctorService.getDoctor(professionalCard));
    }

    @PostMapping(value="/histories")
    public String addHistory(@RequestBody History history){
/*        Patient patient = history.getPatient();

        if(patientService.getPatient(patient.getCc()) != null){
            history.setPatient(patient);
        }*/
        historyService.insert(history);
        return "History has been saved";
    }

}
