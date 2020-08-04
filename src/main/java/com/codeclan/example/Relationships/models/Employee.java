package com.codeclan.example.Relationships.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName")
    String firstName;
    @Column(name = "lastName")
    String lastName;
    @Column(name = "employeeNumber")
    int employeeNumber;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    @JsonIgnoreProperties({"employees"})
    private Department department;

//    @ManyToMany
//    @JsonIgnoreProperties({"employees"})
//    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
//    @JoinTable(
//            name = "employees_projects",
//            joinColumns = { @JoinColumn(
//                    name = "employees_id",
//                    nullable = false,
//                    updatable = false)
//            },
//            inverseJoinColumns = { @JoinColumn(
//                    name = "project_id",
//                    nullable = false,
//                    updatable = false)
//            }
//    )
//    List<Project> projects;

    public Employee(String firstName, String lastName, int employeeNumber, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.department = department;
//        this.projects = new ArrayList<Project>();
    }

    public Employee(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

//    public List<Project> getProjects() {
//        return projects;
//    }
//
//    public void setProjects(List<Project> projects) {
//        this.projects = projects;
//    }
}
