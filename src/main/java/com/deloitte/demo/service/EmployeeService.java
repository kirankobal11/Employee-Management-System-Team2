package com.deloitte.demo.service;

import com.deloitte.demo.model.Employee;
import com.deloitte.demo.repository.EmployeeRepository;

import javax.inject.Inject;
import java.util.List;

public class EmployeeService {

    @Inject
    private EmployeeRepository employeeRepository;

    public void createEmployee(Employee employee) {
        employeeRepository.saveEmployee(employee);
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findEmployeeById(id);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAllEmployees();
    }

    public void updateEmployee(Employee employee) {
        employeeRepository.updateEmployee(employee);
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteEmployee(id);
    }
}
