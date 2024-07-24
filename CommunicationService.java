package com.example.disaster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.disaster.model.Communication;
import com.example.disaster.repository.CommunicationRepository;
import java.util.List;

@Service
public class CommunicationService {
    @Autowired
    private CommunicationRepository communicationRepository;

    public List<Communication> getAllCommunications() {
        return communicationRepository.findAll();
    }

    public Communication saveCommunication(Communication communication) {
        return communicationRepository.save(communication);
    }

    public Communication getCommunicationById(Long id) {
        return communicationRepository.findById(id).orElse(null);
    }
}