package com.example.disaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.disaster.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {}