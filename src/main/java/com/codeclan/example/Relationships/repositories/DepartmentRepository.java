package com.codeclan.example.Relationships.repositories;

import com.codeclan.example.Relationships.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
