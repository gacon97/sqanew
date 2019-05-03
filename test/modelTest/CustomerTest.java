/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelTest;
import model.Customer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author lxquanit
 */
public class CustomerTest {
    public CustomerTest() {
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
        Customer instance = new Customer(1, 1, "Hung Yen", "student", "developer", "cowell", "leader", 40000000);
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetBranch_id() {
        System.out.println("Get Branch_id");
        Customer instance = new Customer(1, 1, "Hung Yen", "student", "developer", "cowell", "leader", 40000000);
        int expResult = 1;
        int result = instance.getBranch_id();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetUser_id() {
        System.out.println("Get User_id");
        Customer instance = new Customer(1, 1, "Hung Yen", "student", "developer", "cowell", "leader", 40000000);
        int expResult = 1;
        int result = instance.getUser_id();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetSalary() {
        System.out.println("Get Salary");
        Customer instance = new Customer(1, 1, "Hung Yen", "student", "developer", "cowell", "leader", 40000000);
        float expResult = 40000000;
        float result = instance.getSalary();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetAddress() {
        System.out.println("Get Address");
        Customer instance = new Customer(1, 1, "Hung Yen", "student", "developer", "cowell", "leader", 40000000);
        String expResult = "Hung Yen";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetObject() {
        System.out.println("Get Object");
        Customer instance = new Customer(1, 1, "Hung Yen", "student", "developer", "cowell", "leader", 40000000);
        String expResult = "student";
        String result = instance.getObject();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetJob() {
        System.out.println("Get Job");
        Customer instance = new Customer(1, 1, "Hung Yen", "student", "developer", "cowell", "leader", 40000000);
        String expResult = "developer";
        String result = instance.getJob();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetCompany() {
        System.out.println("Get Company");
        Customer instance = new Customer(1, 1, "Hung Yen", "student", "developer", "cowell", "leader", 40000000);
        String expResult = "cowell";
        String result = instance.getCompany();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetPosition() {
        System.out.println("Get Position");
        Customer instance = new Customer(1, 1, "Hung Yen", "student", "developer", "cowell", "leader", 40000000);
        String expResult = "leader";
        String result = instance.getPosition();
        assertEquals(expResult, result);
    }
}
