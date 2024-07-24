package com.example.disaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.disaster.model.RiskAssessment;
import com.example.disaster.service.RiskAssessmentService;
import java.util.List;

@RestController
@RequestMapping("/api/riskassessments")
public class RiskAssessmentController {
    @Autowired
    private RiskAssessmentService riskAssessmentService;

    @GetMapping
    public List<RiskAssessment> getAllRiskAssessments() {
        return riskAssessmentService.getAllRiskAssessments();
    }

    @PostMapping
    public RiskAssessment createRiskAssessment(@RequestBody RiskAssessment riskAssessment) {
        return riskAssessmentService.saveRiskAssessment(riskAssessment);
    }

    @GetMapping("/{id}")
    public RiskAssessment getRiskAssessmentById(@PathVariable Long id) {
        return riskAssessmentService.getRiskAssessmentById(id);
    }
}