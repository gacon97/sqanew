/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Customer;
import model.User;

/**
 *
 * @author ngona
 */
public class CustomerController {

    Connection conn = null;

    public CustomerController() {
        String dbUrl = "jdbc:mysql://localhost:3306/sqa";
        String dbClass = "com.mysql.jdbc.Driver";
        try {
            Class.forName(dbClass);
            conn = DriverManager.getConnection(dbUrl, "root", "root");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Customer findCustomer(int id) {
        Customer customer = null;
        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            String searchQuery = "SELECT * FROM `customers` WHERE CONCAT(`id`) LIKE '%" + id + "%'";
            rs = st.executeQuery(searchQuery);
            if (rs.next()) {
                customer = new Customer(
                        rs.getInt("id"),
                        rs.getInt("branch_id"),
                        rs.getInt("user_id"),
                        rs.getString("object"),
                        rs.getString("address"),
                        rs.getString("job"),
                        rs.getString("position"),
                        rs.getString("company"),
                        rs.getFloat("salary")
                );
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return customer;
    }
    public Customer findCustomerLastest() {
        Customer customer = null;
        try {
        Statement st;
        ResultSet rs;
            st = conn.createStatement();
            String searchQuery = "SELECT * FROM `customers` ORDER BY id DESC LIMIT 1";
            rs = st.executeQuery(searchQuery);
            if (rs.next()) {
                customer = new Customer(
                        rs.getInt("id"),
                        rs.getInt("branch_id"),
                        rs.getInt("user_id"),
                        rs.getString("object"),
                        rs.getString("address"),
                        rs.getString("job"),
                        rs.getString("position"),
                        rs.getString("company"),
                        rs.getFloat("salary")
                );
            }
            rs.close();
        } catch (Exception ex) {
                            System.out.println("ko co");

            System.out.println(ex.getMessage());
        }

        return customer;
    }

    public boolean save(Customer customer) throws SQLException, ParseException {
//        Date date = customer.getDate_cmnd();
//        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
////    Date myDate = formatter.parse(date);
//        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        try {
            // the mysql insert statement

            String query = " insert into customers (branch_id, user_id, address, object, job, company, position, salary) values (?, ?, ?, ?, ?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement st = conn.prepareStatement(query);

            st.setInt(1, customer.getBranch_id());
            st.setInt(2, customer.getUser_id());
            st.setString(3, customer.getAddress());
            st.setString(4, customer.getObject());
            st.setString(5, customer.getJob());
            st.setString(6, customer.getCompany());
            st.setString(7, customer.getPosition());
            st.setFloat(8, customer.getSalary());

            // execute the preparedstatement
            st.execute();

            return true;

        } catch (Exception ex) {

            System.err.println("Got an exception!");

            System.err.println(ex.getMessage());

            return false;

        }
    }
}
