/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelTest;
import java.util.Date;
import model.Register;
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
public class RegisterTest {
    long mili = System.currentTimeMillis();
    Date d = new Date(mili);
    public RegisterTest() {
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
        Register instance = new Register(1, 145756359, "0385112988", 1000, 3000, "quanlx", "Hung Yen", "male", "developer", d);
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetCMTND() {
        System.out.println("Get CMTND");
        Register instance = new Register(1, 145756359, "0385112988", 1000, 3000, "quanlx", "Hung Yen", "male", "developer", d);
        int expResult = 145756359;
        int result = instance.getCMTND();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetSoDT() {
        System.out.println("Get SoDT");
        Register instance = new Register(1, 145756359, "0385112988", 1000, 3000, "quanlx", "Hung Yen", "male", "developer", d);
        String expResult = "0385112988";
        String result = instance.getSoDT();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetThuNhap() {
        System.out.println("Get ThuNhap");
        long mili = System.currentTimeMillis();
        Date d = new Date(mili);
        Register instance = new Register(1, 145756359, "0385112988", 1000, 3000, "quanlx", "Hung Yen", "male", "developer", d);
        int expResult = 1000;
        int result = instance.getThuNhap();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetSoTienVay() {
        System.out.println("Get SoTienVay");
        Register instance = new Register(1, 145756359, "0385112988", 1000, 3000, "quanlx", "Hung Yen", "male", "developer", d);
        int expResult = 3000;
        int result = instance.getSoTienVay();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetTenKH() {
        System.out.println("Get TenKH");
        Register instance = new Register(1, 145756359, "0385112988", 1000, 3000, "quanlx", "Hung Yen", "male", "developer", d);
        String expResult = "quanlx";
        String result = instance.getTenKH();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDiaChi() {
        System.out.println("Get DiaChi");
        Register instance = new Register(1, 145756359, "0385112988", 1000, 3000, "quanlx", "Hung Yen", "male", "developer", d);
        String expResult = "Hung Yen";
        String result = instance.getDiaChi();
        assertEquals(expResult, result);
    }
}
