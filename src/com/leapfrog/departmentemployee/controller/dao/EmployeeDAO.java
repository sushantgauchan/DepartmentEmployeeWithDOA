/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.departmentemployee.controller.dao;

import com.leapfrog.departmentemployee.entity.Employee;
import java.util.List;

/**
 *
 * @author Sushant
 */
public interface EmployeeDAO {
    boolean insert(Employee e);
    boolean delete(int id);
    List<Employee> getAll();
    Employee getById(int id);
}
