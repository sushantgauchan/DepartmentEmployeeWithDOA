/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.departmentemployee.controller;

import com.leapfrog.departmentemployee.controller.dao.EmployeeDAO;
import com.leapfrog.departmentemployee.entity.Employee;
import com.leapfrog.departmentemployee.mainProcess.MainProcess;
import java.util.Scanner;

/**
 *
 * @author Sushant
 */
public class EmployeeController {

    EmployeeDAO empDao;
    Scanner input;
    MainProcess mainProcess;

    public EmployeeController(EmployeeDAO empDAO, Scanner input, MainProcess mainProcess) {
        this.empDao = empDAO;
        this.input = input;
        this.mainProcess = mainProcess;
    }

    public void menuEmp() {
        System.out.println("Employee Details");
        System.out.println("1. Add Employee");
        System.out.println("2. Delete Employee");
        System.out.println("3. Show all");
        System.out.println("4. Search by id");
        System.out.println("5. Back");
        System.out.print("Enter your choise [1-5] :");
    }

    public void addEmp() {
        while (true) {
            Employee emp = new Employee();
            System.out.println("Add employee Details");

            System.out.print("1. Enter Id: ");
            emp.setId(input.nextInt());
            System.out.print("2. Enter First Name: ");
            emp.setFirstName(input.next());
            System.out.print("3. Enter Last Name: ");
            emp.setLastName(input.next());
            System.out.print("4. Contact Number: ");
            emp.setContactNo(input.next());
            System.out.print("5. Email: ");
            emp.setEmail(input.next());
            empDao.insert(emp);

            System.out.print("DO you want to add more [Y/N] :");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void deleteEmp() {
        while (true) {
            System.out.println("Deleting employee Data");
            System.out.print("Enter the id of employee you want to delete: ");
            if (empDao.delete(input.nextInt())) {
                System.out.println("Deleted Successfully");
            } else {
                System.out.println("Id not found");
            }
            System.out.println("Do you want to delete more [Y-N]: ");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        } //end while

    }

    public void searchAllEmp() {
        System.out.println("Searching all employee");
        System.out.println("Employee Name" + "  " + "Contact Nmber" + "  " + "Email");
        empDao.getAll().forEach(e -> {
            System.out.println(e.getFullName() + "    " + e.getContactNo() + "    " + e.getEmail());
        });
    }

    public void searchByIdEmp() {
        while (true) {
            System.out.println("Search by id");
            System.out.print("Enter id to search: ");
            Employee employee = empDao.getById(input.nextInt());
            if (employee != null) {
                System.out.println(employee.toString());
            }
            System.out.println("DO you want to search more [Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }//end while

    }

    void back() {
        mainProcess.mainProcess();
    }

    public void processEmp() {
        while (true) {
            menuEmp();
            switch (input.nextInt()) {
                case 1:
                    addEmp();
                    break;
                case 2:
                    deleteEmp();
                    break;
                case 3:
                    searchAllEmp();
                    break;
                case 4:
                    searchByIdEmp();
                    break;
                case 5:
                    back();
                    break;
            }
        }
    }
}
