package com.example.disaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.disaster.model.Communication;
import com.example.disaster.service.CommunicationService;
import java.util.List;

@RestController
@RequestMapping("/api/communications")
public class CommunicationController {
    @Autowired
    private CommunicationService communicationService;

    @GetMapping
    public List<Communication> getAllCommunications() {
        return communicationService.getAllCommunications();
    }

    @PostMapping
    public Communication createCommunication(@RequestBody Communication communication) {
        return communicationService.saveCommunication(communication);
    }

    @GetMapping("/{id}")
    public Communication getCommunicationById(@PathVariable Long id) {
        return communicationService.getCommunicationById(id);
    }
}