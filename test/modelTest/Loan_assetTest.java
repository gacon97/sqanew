/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelTest;

import java.util.Date;
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
public class Loan_assetTest {
    
    Date date = new Date(System.currentTimeMillis());
    
    public Loan_assetTest() {
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
    public void testGetId() {
        System.out.println("Get Id");
        Loan_asset instance = new Loan_asset(4, 5, 17, 200000000, "1","done", 'Sat May 04 11:51:33 ICT 2019', date);
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetCustomer_id() {
        System.out.println("Get Customer_id");
        Loan_asset instance = new Loan_asset(1, 1, 12, 1000.0, "2 năm", "long term", "continue", "2009-08-24 13:19:24", "2009-08-24 13:19:24");
        int expResult = 1;
        int result = instance.getCustomer_id();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetAsset_id() {
        System.out.println("Get Asset_id");
        Loan_asset instance = new Loan_asset(1, 1, 1, 12, 1000, "2 năm", "long term", "continue", "2009-08-24 13:19:24", "2009-08-24 13:19:24");
        int expResult = 1;
        int result = instance.getAsset_id();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetInterest() {
        System.out.println("Get Interest");
        Loan_asset instance = new Loan_asset(1, 1, 1, 12, 1000, "2 năm", "long term", "continue", "2009-08-24 13:19:24", "2009-08-24 13:19:24");
        float expResult = 12;
        float result = instance.getInterest();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetAmount() {
        System.out.println("Get GetAmount");
        Loan_asset instance = new Loan_asset(1, 1, 1, 12, 1000, "2 năm", "long term", "continue", "2009-08-24 13:19:24", "2009-08-24 13:19:24");
        float expResult = 1000;
        float result = instance.getAmount();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testGetTerm() {
        System.out.println("Get GetTerm");
        Loan_asset instance = new Loan_asset(1, 1, 1, 12, 1000, "2 năm", "long term", "continue", "2009-08-24 13:19:24", "2009-08-24 13:19:24");
        String expResult = "2 năm";
        String result = instance.getTerm();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testGetType() {
        System.out.println("Get GetType");
        Loan_asset instance = new Loan_asset(1, 1, 1, 12, 1000, "2 năm", "long term", "continue", "2009-08-24 13:19:24", "2009-08-24 13:19:24");
        String expResult = "long term";
        String result = instance.getType();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testGetStatus() {
        System.out.println("Get GetStatus");
        Loan_asset instance = new Loan_asset(1, 1, 1, 12, 1000, "2 năm", "long term", "continue", "2009-08-24 13:19:24", "2009-08-24 13:19:24");
        String expResult = "continue";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testGetStart_date() {
        System.out.println("Get Start_date");
        Loan_asset instance = new Loan_asset(1, 1, 1, 12, 1000, "2 năm", "long term", "continue", "2009-08-24 13:19:24", "2009-08-24 13:19:24");
        String expResult = "2009-08-24 13:19:24";
        String result = instance.getStart_date();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testGetEnd_date() {
        System.out.println("Get End_date");
        Loan_asset instance = new Loan_asset(1, 1, 1, 12, 1000, "2 năm", "long term", "continue", "2009-08-24 13:19:24", "2009-08-24 13:19:24");
        String expResult = "2009-08-24 13:19:24";
        String result = instance.getEnd_date();
        assertEquals(expResult, result);
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
