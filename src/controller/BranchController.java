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
import java.util.ArrayList;
import model.Branch;
import model.User;

/**
 *
 * @author ngona
 */
public class BranchController {

    Connection conn = null;

    public BranchController() {
        String dbUrl = "jdbc:mysql://localhost:3306/sqa";
        String dbClass = "com.mysql.jdbc.Driver";
        try {
            Class.forName(dbClass);
            conn = DriverManager.getConnection(dbUrl, "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Branch> ListBranches() {
        ArrayList<Branch> branches = new ArrayList<Branch>();

        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            String searchQuery = "SELECT * FROM `branches` WHERE CONCAT(`id`, `name`, `address` )";
            rs = st.executeQuery(searchQuery);

            Branch branch;

            while (rs.next()) {
                branch = new Branch(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("address")
                );
                branches.add(branch);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return branches;
    }
}
