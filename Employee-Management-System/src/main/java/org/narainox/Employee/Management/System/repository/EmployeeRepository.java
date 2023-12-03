package org.narainox.Employee.Management.System.repository;

import org.narainox.Employee.Management.System.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
