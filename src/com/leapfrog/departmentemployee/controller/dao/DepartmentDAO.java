/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.departmentemployee.controller.dao;

import com.leapfrog.departmentemployee.entity.Department;
import java.util.List;

/**
 *
 * @author Sushant
 */
public interface DepartmentDAO {
    boolean insert(Department d);
    boolean delete(int id);
    List<Department> getAll();
    Department getById(int id);
    
         
}
