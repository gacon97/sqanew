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
import java.sql.SQLException;
import model.User;

/**
 *
 * @author ngona
 */
public class RegisterController {

    Connection conn = null;

    public RegisterController() {
        String dbUrl = "jdbc:mysql://localhost:3306/sqa";
        String dbClass = "com.mysql.jdbc.Driver";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbUrl, "root", "root");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String RandomString(int n) {

        // function to generate a random string of length n 
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb 
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public boolean save(User user, boolean newUser) {

        try {
            // the mysql insert statement

            String query = " insert into users (name, email, sex, phone, cmnd, date_cmnd, place_cmnd, password, type)"
                    + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement st = conn.prepareStatement(query);

            String password = this.RandomString(10);
            st.setString(1, user.getName());
            st.setString(2, user.getEmail());
            st.setString(3, user.getSex());
            st.setString(4, user.getPhone());
            st.setString(5, user.getCmnd());
            st.setDate(6, (Date) user.getDate_cmnd());
            st.setString(7, user.getPlace_cmnd());
            if (newUser) {
                st.setString(8, user.getPassword());
            } else {
                st.setString(8, password);
            }
            st.setString(9, user.getType());

            // execute the preparedstatement
            st.execute();

            conn.close();

            return true;

        } catch (Exception ex) {

            System.err.println("Got an exception!");

            System.err.println(ex.getMessage());

            return false;

        }
    }

}
