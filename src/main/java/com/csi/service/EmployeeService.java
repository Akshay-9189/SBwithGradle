package com.csi.service;

import com.csi.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    Employee updateEmployee(int id, Employee employee);

    Employee getEmployee(int id);

    List<Employee> getAllEmployees();

    void deleteEmployee(int id);
}