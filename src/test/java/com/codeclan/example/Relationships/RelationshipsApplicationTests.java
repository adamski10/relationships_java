package com.codeclan.example.Relationships;

import com.codeclan.example.Relationships.models.Department;
import com.codeclan.example.Relationships.models.Employee;
import com.codeclan.example.Relationships.models.Project;
import com.codeclan.example.Relationships.repositories.DepartmentRepository;
import com.codeclan.example.Relationships.repositories.EmployeeRepository;
import com.codeclan.example.Relationships.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class RelationshipsApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("Finance");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Mike", "Smith", 1234, department);
		employeeRepository.save(employee1);
	}

	@Test
	public void addEmployeesAndProjects(){
		Department department = new Department("Finance");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Mike", "Smith", 1234, department);
		employeeRepository.save(employee1);

		Project project1 = new Project("installation", 5);

		project1.addEmployee(employee1);
		projectRepository.save(project1);
	}




}
