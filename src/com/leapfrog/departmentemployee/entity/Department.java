/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.departmentemployee.entity;

/**
 *
 * @author Sushant
 */
public class Department {
    private int id;
    private String dName, location;
    private boolean status;

    public Department() {
    }

    public Department(int id, String dName, String location, boolean status) {
        this.id = id;
        this.dName = dName;
        this.location = location;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", dName=" + dName + ", location=" + location + ", status=" + status + '}';
    }
    
    
}
