package com.example.disaster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.disaster.model.EmergencyScenario;
import com.example.disaster.repository.EmergencyScenarioRepository;
import java.util.List;

@Service
public class EmergencyScenarioService {
    @Autowired
    private EmergencyScenarioRepository emergencyScenarioRepository;

    public List<EmergencyScenario> getAllEmergencyScenarios() {
        return emergencyScenarioRepository.findAll();
    }

    public EmergencyScenario saveEmergencyScenario(EmergencyScenario emergencyScenario) {
        return emergencyScenarioRepository.save(emergencyScenario);
    }

    public EmergencyScenario getEmergencyScenarioById(Long id) {
        return emergencyScenarioRepository.findById(id).orElse(null);
    }
}