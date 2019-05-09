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
public class Customer {
    private int id, branch_id, user_id;
    private float salary;
    private String address, object, job, company, position;

    public Customer() {
        
    }
    
    public Customer(int id, int branch_id, int user_id, String object,  String address,  String job, String company, String position, float salary) {
        this.id = id;
        this.branch_id = branch_id;
        this.user_id = user_id;
        this.salary = salary;
        this.address = address;
        this.object = object;
        this.job = job;
        this.company = company;
        this.position = position;
    }
    
    public Customer(int id, int user_id) {
        this.id = id;
        this.user_id = user_id;
    }

    public Customer(int branch_id, int user_id, String address, String object, String job, String company, String position, float salary) {
        this.branch_id = branch_id;
        this.user_id = user_id;
        this.salary = salary;
        this.address = address;
        this.object = object;
        this.job = job;
        this.company = company;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public int getBranch_id() {
        return branch_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public float getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public String getObject() {
        return object;
    }

    public String getJob() {
        return job;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    
    
}
