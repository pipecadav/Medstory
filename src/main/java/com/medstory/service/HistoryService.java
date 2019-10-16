package com.medstory.service;

import com.medstory.persistence.model.History;
import com.medstory.persistence.model.Patient;
import com.medstory.persistence.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {

    @Autowired
    private HistoryRepository historyRepository;

    public List<History> getAllHistories(){
        return historyRepository.findAll();
    }

    public void insert(History history){
        historyRepository.save(history);

    }


}
