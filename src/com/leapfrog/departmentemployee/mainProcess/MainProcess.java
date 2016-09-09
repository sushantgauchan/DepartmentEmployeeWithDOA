/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.departmentemployee.mainProcess;

import com.leapfrog.departmentemployee.controller.DepartmentController;
import com.leapfrog.departmentemployee.controller.EmployeeController;
import com.leapfrog.departmentemployee.controller.dao.impl.DepartmentDAOImpl;
import com.leapfrog.departmentemployee.controller.dao.impl.EmployeeDAOImpl;
import java.util.Scanner;

/**
 *
 * @author Sushant
 */
public class MainProcess {

    public void mainProcess() {
        DepartmentController dc = new DepartmentController(new DepartmentDAOImpl(), new Scanner(System.in), new MainProcess());
        EmployeeController ec = new EmployeeController(new EmployeeDAOImpl(), new Scanner(System.in), new MainProcess());

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("1. Department");
            System.out.println("2. Employee");
            System.out.println("3. Exit");
            System.out.print("Enter your chosie [1-3] :");

            switch (input.nextInt()) {
                case 1:

                    dc.processDep();

                    break;
                case 2:
                    ec.processEmp();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
