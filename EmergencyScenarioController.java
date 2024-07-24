package com.example.disaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.disaster.model.EmergencyScenario;
import com.example.disaster.service.EmergencyScenarioService;
import java.util.List;

@RestController
@RequestMapping("/api/emergencyscenarios")
public class EmergencyScenarioController {
    @Autowired
    private EmergencyScenarioService emergencyScenarioService;

    @GetMapping
    public List<EmergencyScenario> getAllEmergencyScenarios() {
        return emergencyScenarioService.getAllEmergencyScenarios();
    }

    @PostMapping
    public EmergencyScenario createEmergencyScenario(@RequestBody EmergencyScenario emergencyScenario) {
        return emergencyScenarioService.saveEmergencyScenario(emergencyScenario);
    }

    @GetMapping("/{id}")
    public EmergencyScenario getEmergencyScenarioById(@PathVariable Long id) {
        return emergencyScenarioService.getEmergencyScenarioById(id);
    }
}