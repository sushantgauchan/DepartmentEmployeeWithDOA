/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.departmentemployee.controller;

import com.leapfrog.departmentemployee.controller.dao.DepartmentDAO;
import com.leapfrog.departmentemployee.entity.Department;
import com.leapfrog.departmentemployee.mainProcess.MainProcess;
import java.awt.Menu;
import java.util.Scanner;

/**
 *
 * @author Sushant
 */
public class DepartmentController {

    DepartmentDAO depDao;
    Scanner input;
    MainProcess mainProcess;
   
    public DepartmentController(DepartmentDAO depDao, Scanner input, MainProcess mainProcess) {
        this.depDao = depDao;
        this.input = input;
        this.mainProcess = mainProcess;
    }

    public void menuDep() {
        System.out.println("Department");
        System.out.println("1. Add Department");
        System.out.println("2. Delete Department");
        System.out.println("3. Show all");
        System.out.println("4. Search by id");
        System.out.println("5. Back");
        System.out.print("Enter your choise [1-5] :");

    }

    public void add() {
        while (true) {
            Department dpt = new Department();
            System.out.println("Add Department Information");
            System.out.print("Enter Id :");
            dpt.setId(input.nextInt());
            System.out.print("Enter Department Name :");
            dpt.setdName(input.next());
            System.out.print("Enter Location :");
            dpt.setLocation(input.next());
            System.out.print("Enter status: ");
            dpt.setStatus(input.nextBoolean());
            depDao.insert(dpt);

            System.out.println("DO you want to add more [Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;

            }
        } //end while
    }

    public void delete() {
        while (true) {
            System.out.println("Delete department");

            System.out.print("Enter the id of record you want to delete: ");

            if (depDao.delete(input.nextInt())) {
                System.out.println("Deleated successifully");
            } else {
                System.out.println("Id not found");
            }
            System.out.println("DO you want to delete more [Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        } //end while

    }

    public void showall() {
        System.out.println("The list of all departments");
        System.out.println("Depatment Name" + "    " + "Location");
        depDao.getAll().forEach(d -> {
            System.out.println(d.getdName() + "                  " + d.getLocation());

        });

    }

    public void searchById() {
        while (true) {
            System.out.println("Search by id");
            System.out.print("Enter id to search: ");
            Department department = depDao.getById(input.nextInt());
            if (department != null) {
                System.out.println(department.toString());
            }
            System.out.println("DO you want to search more [Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }//end while

    }
    
    void back(){
       mainProcess.mainProcess();
    }

    public void processDep() {

        while (true) {
            menuDep();
            switch (input.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    showall();
                    break;
                case 4:
                    searchById();
                    break;
                case 5:
                    back();
                    break;
            }
        } //end while
    }

}
