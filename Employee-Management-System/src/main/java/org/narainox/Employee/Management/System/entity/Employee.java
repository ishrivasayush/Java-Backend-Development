package org.narainox.Employee.Management.System.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    @Column(nullable = false)
    private String firstName;
    private String lastName;
    private Double salary;
    private String address;
    @Column(nullable = false)
    private String email;
}
