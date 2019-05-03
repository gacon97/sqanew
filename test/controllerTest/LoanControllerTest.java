/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerTest;

import controller.LoanController;
import model.Loan_asset;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phamt
 */
public class LoanControllerTest {
    
    public LoanControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
     @Test
    public void testCheckCustomer() {
        System.out.println("Kiem tra khach hang o thong tin chua!");
        LoanController loan = new LoanController();
        boolean expResult =true;
        boolean result =loan.checkCustomer(70);
        assertEquals(expResult, result);
    }
    
//     @Test
//    public void testRegisCustomerAsetLoan() {
//        System.out.println("Them thong tin khach hang dang ky goi vay co tsdb dai han");
//        Loan_asset ls = new Loan_asset(1, 70, 1, 12, 2000000, "2 năm", "long term", "continue", "2009-08-24 13:19:24", "2009-08-24 13:19:24");
//        LoanController loan = new LoanController();
//        Loan_asset expResult =ls;
//        loan.RegisCustomerAsetLoan(ls);
//        assertEquals(expResult, result);
//    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
