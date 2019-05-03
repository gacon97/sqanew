/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ngona
 */
public class Employee {
    private int id, branch_id;
    private String name, address, position, sex, job, phone;

    public Employee(int id, int branch_id, String name, String address, String position, String sex, String job, String phone) {
        this.id = id;
        this.branch_id = branch_id;
        this.name = name;
        this.address = address;
        this.position = position;
        this.sex = sex;
        this.job = job;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public int getBranch_id() {
        return branch_id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPosition() {
        return position;
    }

    public String getSex() {
        return sex;
    }

    public String getJob() {
        return job;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
