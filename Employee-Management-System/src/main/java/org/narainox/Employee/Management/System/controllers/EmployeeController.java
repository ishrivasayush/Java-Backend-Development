package org.narainox.Employee.Management.System.controllers;

import org.narainox.Employee.Management.System.entity.Employee;
import org.narainox.Employee.Management.System.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployee()
    {
        List<Employee> em = employeeService.getAllEmployee();
        return new ResponseEntity<>(em, HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getAllEmployee(@PathVariable Long id)
    {
        Employee em = employeeService.getEmployee(id);
        return new ResponseEntity<>(em, HttpStatus.OK);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id)
    {
        String em = employeeService.deleteEmployee(id);
        return new ResponseEntity<>(em, HttpStatus.OK);
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee)
    {
        Employee em = employeeService.upsertEmployee(employee);
        return new ResponseEntity<>(em, HttpStatus.CREATED);
    }
    @PutMapping("/employee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee)
    {
        Employee em = employeeService.upsertEmployee(employee);
        return new ResponseEntity<>(em, HttpStatus.OK);
    }
}
