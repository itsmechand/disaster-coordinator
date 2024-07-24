package com.example.disaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.disaster.model.RiskAssessment;

@Repository
public interface RiskAssessmentRepository extends JpaRepository<RiskAssessment, Long> {}