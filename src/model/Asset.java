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
public class Asset {
    private int id, customer_id, loan_asset_id;
    private float value;
    private String group;
    private Date expririty_date;

    public Asset(int id, int customer_id, int loan_asset_id, int value, String group, Date expririty_date) {
        this.id = id;
        this.customer_id = customer_id;
        this.loan_asset_id = loan_asset_id;
        this.value = value;
        this.group = group;
        this.expririty_date = expririty_date;
    }

    public int getId() {
        return id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public int getLoan_asset_id() {
        return loan_asset_id;
    }

    public float getValue() {
        return value;
    }

    public String getGroup() {
        return group;
    }

    public Date getExpririty_date() {
        return expririty_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setLoan_asset_id(int loan_asset_id) {
        this.loan_asset_id = loan_asset_id;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setExpririty_date(Date expririty_date) {
        this.expririty_date = expririty_date;
    }
    
}
