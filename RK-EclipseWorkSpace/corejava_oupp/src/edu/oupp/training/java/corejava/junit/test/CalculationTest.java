package edu.oupp.training.java.corejava.junit.test;
import org.junit.*;

import edu.oupp.training.java.corejava.junit.Calculation;

import static org.junit.Assert.assertEquals;

public class CalculationTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Before Class");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
    }

    @Test
    public void testFindMax() {
        System.out.println("Print Max Value");
        assertEquals(4, Calculation.findMax(new int[]{1, 2, 3, 4}));
        assertEquals(-2, Calculation.findMax(new int[]{-11, -2, -3, -4}));
    }

    @Test
    public void testCube() {
        System.out.println("Print cube value");
        assertEquals(8, Calculation.cube(2));
        assertEquals(343, Calculation.cube(7));
    }
    @After
    public void tearDown()throws Exception{
        System.out.println("After");
    }
    @AfterClass
    public static void tearDownAfteClass() throws Exception{
        System.out.println("After Class");
    }
}
