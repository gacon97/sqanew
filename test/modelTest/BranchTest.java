/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelTest;
import model.Branch;
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
public class BranchTest {
    public BranchTest() {
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
        Branch instance = new Branch(1, "9589 Gustave Lane", "1713 Adams Run\n" +
"Grahamside, AK 70049");
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetName() {
        System.out.println("Get Name");
        Branch instance = new Branch(1, "9589 Gustave Lane", "1713 Adams Run\n" +
"Grahamside, AK 70049");
        String expResult = "9589 Gustave Lane";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetAddress() {
        System.out.println("Get Address");
        Branch instance = new Branch(1, "9589 Gustave Lane", "1713 Adams Run\n" +
"Grahamside, AK 70049");
        String expResult = "1713 Adams Run\n" +
"Grahamside, AK 70049";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }
}
