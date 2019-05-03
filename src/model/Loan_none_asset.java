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
public class Loan_none_asset {
    private int id, customer_id;
    private float amount;
    private String type_loan, type_purpose, status;
    private Date start_date;

    public Loan_none_asset(int id, int customer_id, float amount, String type_loan, String type_purpose, String status, Date start_date) {
        this.id = id;
        this.customer_id = customer_id;
        this.amount = amount;
        this.type_loan = type_loan;
        this.type_purpose = type_purpose;
        this.status = status;
        this.start_date = start_date;
    }

    public Loan_none_asset() {
    }

    public int getId() {
        return id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public float getAmount() {
        return amount;
    }

    public String getType_loan() {
        return type_loan;
    }

    public String getType_purpose() {
        return type_purpose;
    }

    public String getStatus() {
        return status;
    }

    public Date getStart_date() {
        return new java.sql.Date(start_date.getTime());
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setType_loan(String type_loan) {
        this.type_loan = type_loan;
    }

    public void setType_purpose(String type_purpose) {
        this.type_purpose = type_purpose;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    

    
    
}
