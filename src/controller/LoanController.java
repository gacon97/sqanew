/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Loan_asset;
import model.Loan_none_asset;

/**
 *
 * @author phamt
 */
public class LoanController {
    Connection conn = null;

    public LoanController() {
        String dbUrl = "jdbc:mysql://localhost:3306/sqa";
        String dbClass = "com.mysql.jdbc.Driver";
        try {
            Class.forName(dbClass);
            conn = DriverManager.getConnection(dbUrl, "root", "root");
        } catch (ClassNotFoundException e) {
            System.out.println("Class was not found.");
        }
        catch(SQLException e){
            System.out.println("Error connection!");
        }
    }
    
    public boolean checkCustomer(int id)
    {
         String query = "Select * FROM customers WHERE id =?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void RegisCustomerAsetLoan(Loan_asset loan)
    {
        System.out.println(loan.getCustomer_id());
        System.out.println(loan.getAmount());

        System.out.println(loan.getStatus());
            String query = "INSERT INTO loan_assets (customer_id, amount, term, start_date, status) VALUES(?, ?,?,?,?)";
            try {
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, loan.getCustomer_id());
                ps.setDouble(2, loan.getAmount());
                ps.setString(3, loan.getTerm());
                ps.setDate(4, (Date) loan.getStart_date());
                ps.setString(5, loan.getStatus());
                ps.executeUpdate();
            } catch (Exception ex) {

            System.err.println("Got an exception!");

            System.err.println(ex.getMessage());
            }
    }
    
    public void RegisCustomerNoneAsetLoan(Loan_none_asset loan)
    {
        System.out.println(loan.getCustomer_id());
                                        System.out.println(loan.getAmount());
                                        
                                        System.out.println(loan.getStatus());
            String query = "INSERT INTO loan_none_assets (customer_id, amount, type_loan, type_purpose, start_date, status) VALUES(?, ?, ?,?,?,?)";
            try {
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, loan.getCustomer_id());
                ps.setDouble(2, loan.getAmount());
                ps.setString(3, loan.getType_loan());
                ps.setString(4, loan.getType_purpose());
                ps.setDate(5,(Date) loan.getStart_date());
                ps.setString(6, loan.getStatus());
                ps.executeUpdate();
            } catch (Exception ex) {

            System.err.println("Got an exception!");

            System.err.println(ex.getMessage());
            }
    }
}
