package org.narainox.Employee.Management.System.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.narainox.Employee.Management.System.entity.Employee;
import org.narainox.Employee.Management.System.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class reportGenerator {

    @Autowired
    private EmployeeRepository employeeRepository;
    public void getReport(HttpServletResponse httpServletResponse)
    {
        List<Employee> employees = employeeRepository.findAll();

        HSSFWorkbook hssfWorkbook=new HSSFWorkbook();
        HSSFSheet sheet = hssfWorkbook.createSheet("employee_info");
        HSSFRow row = sheet.createRow(0);

        row.createCell(0).setCellValue("id");
        row.createCell(1).setCellValue("firstName");
        row.createCell(2).setCellValue("lastName");
        row.createCell(3).setCellValue("salary");
        row.createCell(4).setCellValue("address");
        row.createCell(5).setCellValue("email");

        int index=1;
        for (Employee employee:employees)
        {
            HSSFRow row1 = sheet.createRow(index);
            row1.createCell(0).setCellValue(employee.getEmpId());
            row1.createCell(1).setCellValue(employee.getFirstName());
            row1.createCell(2).setCellValue(employee.getLastName());
            row1.createCell(3).setCellValue(employee.getSalary());
            row1.createCell(4).setCellValue(employee.getAddress());
            row1.createCell(5).setCellValue(employee.getEmail());
            index++;
        }








    }
}
