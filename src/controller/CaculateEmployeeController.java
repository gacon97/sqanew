/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import model.Loan_asset;
import model.Loan_none_asset;
import model.User;

/**
 *
 * @author nam
 */
public class CaculateEmployeeController {
    Connection conn = null;

    public CaculateEmployeeController(){
        String dbUrl = "jdbc:mysql://localhost:3306/sqa";
        String dbClass = "com.mysql.jdbc.Driver";
        
        try {
            // dang ki driver
            Class.forName(dbClass);
            // tao 1 ket noi
            conn = DriverManager.getConnection(dbUrl, "root", "root");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CaculateEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CaculateEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public User findUser(int id) {
        User user = null;
        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            String searchQuery = "SELECT * FROM `users` WHERE `id` LIKE '" + id + "'";
            rs = st.executeQuery(searchQuery);
            
            while (rs.next()) {
                user = new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("sex"),
                        rs.getString("phone"),
                        rs.getString("cmnd"),
                        rs.getDate("date_cmnd")
                );
            }
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return user;

    }
    
    public Customer findCustomerByUserId(int user_id) {
        Customer customer = null;
        Statement st;
        ResultSet rs;
        
        try {
            st = conn.createStatement();
            String searchQuery = "SELECT * FROM `customers` WHERE `user_id` LIKE '" + user_id + "' ORDER BY id DESC LIMIT 1";
            rs = st.executeQuery(searchQuery);

            if(rs == null) {
                return customer;
            }
            while (rs.next()) {
                customer = new Customer(
                        rs.getInt("id"),
                        rs.getInt("user_id")
                );
            }
            rs.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return customer;
        
    }
    
        
    public Loan_asset findLoanAsset(int customer_id) {
        Loan_asset loanAsset = null;
        Statement st;
        ResultSet rs;
        try {
            st = conn.createStatement();
            String searchQuery = "SELECT * FROM `loan_assets` WHERE `customer_id` LIKE '" + customer_id + "'";
            rs = st.executeQuery(searchQuery);
            if(rs == null) {
                return loanAsset;
            }
            while (rs.next()) {
                loanAsset = new Loan_asset(
                        rs.getInt("id"),
                        rs.getInt("customer_id"),
                        rs.getFloat("amount"),
                        rs.getString("term"),
                        rs.getString("status"),
                        rs.getDate("start_date")
                );
            }
            rs.close();
            System.out.println("loan asset" + loanAsset);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
                
        return loanAsset;
    }
    
    public Loan_none_asset findLoanNoneAsset(int customer_id) {
        Loan_none_asset loanNoneAsset = null;
        Statement st;
        ResultSet rs;
                try {
            st = conn.createStatement();
            String searchQuery = "SELECT * FROM `loan_none_assets` WHERE `customer_id` LIKE '" + customer_id + "'";
            rs = st.executeQuery(searchQuery);

            if(rs == null) {
                return loanNoneAsset;
            }
            while (rs.next()) {
                loanNoneAsset = new Loan_none_asset(
                        rs.getInt("id"),
                        rs.getInt("customer_id"),
                        rs.getFloat("amount"),
                        rs.getString("type_loan"),
                        rs.getString("type_purpose"),
                        rs.getString("status"),
                        rs.getDate("start_date")
                );
            }
            System.out.println("loan none asset" + loanNoneAsset);
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
                
        return loanNoneAsset;
    }

    
    
    
    
    
}
