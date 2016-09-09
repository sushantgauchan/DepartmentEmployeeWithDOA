/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.departmentemployee.controller.dao.impl;

import com.leapfrog.departmentemployee.controller.dao.EmployeeDAO;
import com.leapfrog.departmentemployee.entity.Department;
import com.leapfrog.departmentemployee.entity.Employee;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sushant
 */
public class EmployeeDAOImpl implements EmployeeDAO{
    List<Employee> empList = new ArrayList<>();
    
    @Override
    public boolean insert(Employee e) {
        return empList.add(e);
    }

    @Override
    public boolean delete(int id) {
        for(Employee e:empList){
           if(e.getId()==id){
                empList.remove(e);
                return true;
            }    
        } 
        return false;    
    }

    @Override
    public List<Employee> getAll() {
        return empList;
    }

    @Override
    public Employee getById(int id) {
        for(Employee d:  empList){
            if(d.getId() == id){
                return d;
            }
        }
        return null;
    }

    
}
