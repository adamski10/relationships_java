package com.codeclan.example.Relationships.repositories;

import com.codeclan.example.Relationships.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
