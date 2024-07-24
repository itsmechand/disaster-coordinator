package com.example.disaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.disaster.model.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {}