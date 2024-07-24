package com.example.disaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.disaster.model.EmergencyScenario;

@Repository
public interface EmergencyScenarioRepository extends JpaRepository<EmergencyScenario, Long> {}