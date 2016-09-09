/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.departmentemployee;

import com.leapfrog.departmentemployee.controller.DepartmentController;
import com.leapfrog.departmentemployee.controller.EmployeeController;
import com.leapfrog.departmentemployee.controller.dao.DepartmentDAO;
import com.leapfrog.departmentemployee.controller.dao.impl.DepartmentDAOImpl;
import com.leapfrog.departmentemployee.controller.dao.impl.EmployeeDAOImpl;
import com.leapfrog.departmentemployee.mainProcess.MainProcess;
import java.util.Scanner;

/**
 *
 * @author Sushant
 */
public class Program {

    public static void main(String[] args) {
        MainProcess mp = new MainProcess();
        mp.mainProcess();
    }

}
