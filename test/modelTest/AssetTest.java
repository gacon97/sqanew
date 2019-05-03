/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelTest;
import java.util.Date;
import model.Asset;
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
public class AssetTest {
    long milis = System.currentTimeMillis();
    Date date = new Date(milis);
    public AssetTest() {
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
        Asset instance = new Asset(1, 1, 1, 1000, "asset",date);
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetCustomer_id() {
        System.out.println("Get CustomerId");
        Asset instance = new Asset(1, 1, 1, 1000, "asset",date);
        int expResult = 1;
        int result = instance.getCustomer_id();
        assertEquals(expResult, result);
    }
    @Test
    public void testLoan_asset_id() {
        System.out.println("Get Loan_asset_id");
        Asset instance = new Asset(1, 1, 1, 1000, "asset",date);
        int expResult = 1000;
        int result = instance.getLoan_asset_id();
        assertEquals(expResult, result);
    }
    @Test
    public void testValue() {
        System.out.println("Get Value");
        Asset instance = new Asset(1, 1, 1, 1000, "asset",date);
        float expResult = 1000;
        float result = instance.getValue();
        assertEquals(expResult, result);
    }
    @Test
    public void testGroup() {
        System.out.println("Get Group");
        Asset instance = new Asset(1, 1, 1, 1000, "asset",date);
        String expResult = "asset";
        String result = instance.getGroup();
        assertEquals(expResult, result);
    }
    @Test
    public void testExpririty_date() {
        System.out.println("Get Expririty_date");
        Asset instance = new Asset(1, 1, 1, 1000, "asset",date);
        Date expResult = date;
        Date result = instance.getExpririty_date();
        assertEquals(expResult, result);
    }
}
