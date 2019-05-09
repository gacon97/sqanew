/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import model.User;

/**
 *
 * @author ngona
 */
public class UserController {

    Connection conn = null;

    public UserController() {
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

    public ArrayList<User> ListUsers(String ValToSearch) {
        ArrayList<User> usersList = new ArrayList<User>();

        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            String searchQuery = "SELECT * FROM `users` WHERE type = 'customer' AND CONCAT(`id`, `name`, `email`, `sex`, `phone`, `cmnd`, `date_cmnd` ) LIKE '%" + ValToSearch + "%' ";
            rs = st.executeQuery(searchQuery);

            User user;

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
                usersList.add(user);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return usersList;
    }

    public User findUser(int id) {
        User user = null;
        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            String searchQuery = "SELECT * FROM `users` WHERE CONCAT(`id`) LIKE '%" + id + "%'";
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

    public boolean save(User user) throws SQLException, ParseException {
        Date date = user.getDate_cmnd();
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//    Date myDate = formatter.parse(date);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        try {
            // the mysql insert statement

            String query = " insert into users (name, email, sex, phone, cmnd, date_cmnd, place_cmnd, password)"
                    + " values (?, ?, ?, ?, ?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement st = conn.prepareStatement(query);

            String password = this.RandomString(10);
            st.setString(1, user.getName());
            st.setString(2, user.getEmail());
            st.setString(3, user.getSex());
            st.setString(4, user.getPhone());
            st.setString(5, user.getCmnd());
            st.setDate(6, sqlDate);
            st.setString(7, user.getPlace_cmnd());
            st.setString(8, password);

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
