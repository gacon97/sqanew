/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelTest;
import model.Employee;
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
public class EmployeeTest {
    public EmployeeTest() {
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
        Employee instance = new Employee(1, 1, "Royce Marvin", "45933 Arlie Greens\n" +
"North Dannieborough, UT 36389", "Director", "female", "Director", "604-682-7282");
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetBranchId() {
        System.out.println("Get Branch_id");
        Employee instance = new Employee(1, 168, "Royce Marvin", "45933 Arlie Greens\n" +
"North Dannieborough, UT 36389", "Director", "female", "Director", "604-682-7282");
        int expResult = 168;
        int result = instance.getBranch_id();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetName() {
        System.out.println("Get name");
        Employee instance = new Employee(1, 168, "Royce Marvin", "45933 Arlie Greens\n" +
"North Dannieborough, UT 36389", "Director", "female", "Director", "604-682-7282");
        String expResult = "Royce Marvin";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetAddress() {
        System.out.println("Get Address");
        Employee instance = new Employee(1, 168, "Royce Marvin", "45933 Arlie Greens\n" +
"North Dannieborough, UT 36389", "Director", "female", "Director", "604-682-7282");
        String expResult = "North Dannieborough, UT 36389";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetPosition() {
        System.out.println("Get Position");
        Employee instance = new Employee(1, 168, "Royce Marvin", "45933 Arlie Greens\n" +
"North Dannieborough, UT 36389", "Director", "female", "Director", "604-682-7282");
        String expResult = "Director";
        String result = instance.getPosition();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetSex() {
        System.out.println("Get Sex");
        Employee instance = new Employee(1, 168, "Royce Marvin", "45933 Arlie Greens\n" +
"North Dannieborough, UT 36389", "Director", "female", "Director", "604-682-7282");
        String expResult = "female";
        String result = instance.getSex();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetJob() {
        System.out.println("Get Job");
        Employee instance = new Employee(1, 168, "Royce Marvin", "45933 Arlie Greens\n" +
"North Dannieborough, UT 36389", "Director", "female", "Director", "604-682-7282");
        String expResult = "Director";
        String result = instance.getJob();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetPhone() {
        System.out.println("Get Job");
        Employee instance = new Employee(1, 168, "Royce Marvin", "45933 Arlie Greens\n" +
"North Dannieborough, UT 36389", "Director", "female", "Director", "604-682-7282");
        String expResult = "604-682-7282";
        String result = instance.getPhone();
        assertEquals(expResult, result);
    }
}
