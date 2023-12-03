package org.narainox.Employee.Management.System.service;

import org.narainox.Employee.Management.System.entity.Employee;
import org.narainox.Employee.Management.System.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent())
        {
            return employee.get();
        }
        return null;
    }

    @Override
    public String deleteEmployee(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent())
        {
            employeeRepository.delete(employee.get());
        }

        return "Delete Employee SuccessFully";
    }

    @Override
    public Employee upsertEmployee(Employee employee) {
        Employee save = employeeRepository.save(employee);
        return save;
    }

}
