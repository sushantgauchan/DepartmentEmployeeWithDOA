/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.departmentemployee.controller.dao.impl;

import com.leapfrog.departmentemployee.controller.dao.DepartmentDAO;
import com.leapfrog.departmentemployee.entity.Department;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sushant
 */
public class DepartmentDAOImpl implements DepartmentDAO{
    
    List<Department> depList = new ArrayList<>();
    
    @Override
    public boolean insert(Department d) {
        return depList.add(d);
    }

    @Override
    public boolean delete(int id) {
        for(Department d:depList){
           if(d.getId()==id){
                depList.remove(d);
                return true;
            }    
        } 
        return false;    
    }
    
    @Override
    public List<Department> getAll() {
        return depList;
    }

    @Override
    public Department getById(int id) {
        for(Department d:  depList){
            if(d.getId() == id){
                return d;
            }
        }
        return null;
    }
    
    
    
}
