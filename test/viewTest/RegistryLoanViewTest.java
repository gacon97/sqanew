/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import view.RegistryLoanview;

/**
 *
 * @author phamt
 */
public class RegistryLoanViewTest {
    
    public RegistryLoanViewTest() {
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
    public void testCheckNumInterger() {
        System.out.println("Kiem tra so nguyen duong: bien la chu");
        RegistryLoanview instance = new RegistryLoanview();
        boolean expResult = false;
        boolean result = instance.checkNumInterger("afasf");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckNumInterger1() {
        System.out.println("Kiem tra so nguyen duong: bien la so am");
        RegistryLoanview instance = new RegistryLoanview();
        boolean expResult = false;
        boolean result = instance.checkNumInterger("-1");
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCheckNumInterger2() {
        System.out.println("Kiem tra so nguyen duong: bien la so kieu float");
        RegistryLoanview instance = new RegistryLoanview();
        boolean expResult = false;
        boolean result = instance.checkNumInterger("5.3663");
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCheckNumInterger3() {
        System.out.println("Kiem tra so nguyen duong: bien la so nguyen duong");
        RegistryLoanview instance = new RegistryLoanview();
        boolean expResult = true;
        boolean result = instance.checkNumInterger("5");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckNum() {
        System.out.println("Kiem tra tong tien: bien la so am");
        RegistryLoanview instance = new RegistryLoanview();
        boolean expResult = false;
        boolean result = instance.checkNum("-5");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckNum1() {
        System.out.println("Kiem tra tong tien: bien la so duong nho hon 1000000");
        RegistryLoanview instance = new RegistryLoanview();
        boolean expResult = false;
        boolean result = instance.checkNum("13414");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckNum2() {
        System.out.println("Kiem tra tong tien: bien la so duong lon hon 1000000");
        RegistryLoanview instance = new RegistryLoanview();
        boolean expResult = true;
        boolean result = instance.checkNum("134142345");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckNum3() {
        System.out.println("Kiem tra tong tien: bien khong phai la so");
        RegistryLoanview instance = new RegistryLoanview();
        boolean expResult = false;
        boolean result = instance.checkNum("@sdf");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsThisDateValid() {
        System.out.println("Kiem tra dinh dang ngay yyyy-MM-dd HH:mm:ss: Bien: fafffaFF ");
        RegistryLoanview instance = new RegistryLoanview();
        boolean expResult = false;
        boolean result = instance.isThisDateValid("fafffaFF");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsThisDateValid1() {
        System.out.println("Kiem tra dinh dang ngay yyyy-MM-dd HH:mm:ss: Bien: 1997-12-03 12:23:09 ");
        RegistryLoanview instance = new RegistryLoanview();
        boolean expResult = true;
        boolean result = instance.isThisDateValid("1997-12-03 12:23:09");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsThisDateValid2() {
        System.out.println("Kiem tra dinh dang ngay yyyy-MM-dd HH:mm:ss: Bien: 1997-100-03 67:23:09 ");
        RegistryLoanview instance = new RegistryLoanview();
        boolean expResult = true;
        boolean result = instance.isThisDateValid("1997-100-03 67:23:09");
        assertEquals(expResult, result);
    }
    
    
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
