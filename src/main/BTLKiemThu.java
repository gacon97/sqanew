/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import view.*;
/**
 *
 * @author nam
 */
public class BTLKiemThu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
        Login login = new Login();
        login.setVisible(true);
        
    }
    
}
