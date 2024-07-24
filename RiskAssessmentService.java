package com.example.disaster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.disaster.model.RiskAssessment;
import com.example.disaster.repository.RiskAssessmentRepository;
import java.util.List;

@Service
public class RiskAssessmentService {
    @Autowired
    private RiskAssessmentRepository riskAssessmentRepository;

    public List<RiskAssessment> getAllRiskAssessments() {
        return riskAssessmentRepository.findAll();
    }

    public RiskAssessment saveRiskAssessment(RiskAssessment riskAssessment) {
        return riskAssessmentRepository.save(riskAssessment);
    }

    public RiskAssessment getRiskAssessmentById(Long id) {
        return riskAssessmentRepository.findById(id).orElse(null);
    }
}