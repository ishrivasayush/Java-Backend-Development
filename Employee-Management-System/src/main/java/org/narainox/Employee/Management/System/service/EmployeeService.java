package org.narainox.Employee.Management.System.service;


import org.narainox.Employee.Management.System.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    Employee getEmployee(Long id);

    String deleteEmployee(Long id);

    Employee upsertEmployee(Employee employee);



}
