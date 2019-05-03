/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author ngona
 */
public class User {
    private int id;
    private String name, email, sex, phone, cmnd, place_cmnd, password, type;
    private Date date_cmnd;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
//        this.type = type;
    }

    public User(int id, String name, String email, String sex, String phone, String cmnd,  Date date_cmnd) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.sex = sex;
        this.phone = phone;
        this.cmnd = cmnd;
        this.date_cmnd = date_cmnd;

    }
    
    
    public User(int id, String name, String email, String sex, String phone, String cmnd, String place_cmnd, String password, Date date_cmnd) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.sex = sex;
        this.phone = phone;
        this.cmnd = cmnd;
        this.place_cmnd = place_cmnd;
        this.password = password;
        this.date_cmnd = date_cmnd;
    }

    public User(String name, String email, String sex, String phone, String cmnd, String place_cmnd, Date date_cmnd, String type) {
        this.name = name;
        this.email = email;
        this.sex = sex;
        this.phone = phone;
        this.cmnd = cmnd;
        this.place_cmnd = place_cmnd;
        this.date_cmnd = date_cmnd;
        this.type = type;
    }
    public User(String name, String email, String sex, String phone, String cmnd, String place_cmnd, Date date_cmnd,String password, String type) {
        this.name = name;
        this.email = email;
        this.sex = sex;
        this.phone = phone;
        this.cmnd = cmnd;
        this.place_cmnd = place_cmnd;
        this.date_cmnd = date_cmnd;
        this.password = password;
        this.type = type;
    }

    public User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSex() {
        return sex;
    }

    public String getPhone() {
        return phone;
    }

    public String getCmnd() {
        return cmnd;
    }

    public String getPlace_cmnd() {
        return place_cmnd;
    }

    public String getPassword() {
        return password;
    }

    public Date getDate_cmnd() {
        return new java.sql.Date(date_cmnd.getTime());
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void setPlace_cmnd(String place_cmnd) {
        this.place_cmnd = place_cmnd;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDate_cmnd(Date date_cmnd) {
        this.date_cmnd = date_cmnd;
    }
      
}
