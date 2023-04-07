package com.csi.dao;

import com.csi.model.Employee;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface EmployeeDao {

    @CacheEvict(value = {"Id", "Employees"}, allEntries = true)
    Employee saveEmployee(Employee employee);

    @Cacheable(value = "Id")
    Employee getEmployee(int id);

    @Cacheable(value = "Employees")
    List<Employee> getAllEmployees();

    @CacheEvict(value = {"Id", "Employees"}, allEntries = true)
    void deleteEmployee(Employee employee);
}