package com.medstory.web.controller;

import com.medstory.persistence.model.History;
import com.medstory.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @GetMapping(value="/histories")
    public List<History> getAll(){
        return historyService.getAllHistories();
    }

    //@GetMapping(value="/histories/{patient}")

    @PostMapping(value="/histories")
    public String addHistory(@RequestBody History history){
        historyService.insert(history);
        return "History has been saved";
    }

}
