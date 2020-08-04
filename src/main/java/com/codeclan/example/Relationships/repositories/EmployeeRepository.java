package com.codeclan.example.Relationships.repositories;

import com.codeclan.example.Relationships.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
