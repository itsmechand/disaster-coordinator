package com.example.disaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.disaster.model.Communication;

@Repository
public interface CommunicationRepository extends JpaRepository<Communication, Long> {}