package com.deloitte.demo.service;

import com.deloitte.demo.model.Department;
import com.deloitte.demo.repository.DepartmentRepository;

import javax.inject.Inject;
import java.util.List;

public class DepartmentService {

    @Inject
    private DepartmentRepository departmentRepository;

    public void createDepartment(Department department) {
        departmentRepository.saveDepartment(department);
    }

    public Department getDepartmentById(int id) {
        return departmentRepository.findDepartmentById(id);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAllDepartments();
    }

    public void updateDepartment(Department department) {
        departmentRepository.updateDepartment(department);
    }

    public void deleteDepartment(int id) {
        departmentRepository.deleteDepartment(id);
    }
}
