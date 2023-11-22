package gov.in.oupp.training.java.corejava.junit.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MessageUtilTest.class,
        CalculationTest.class,
        CalculatorTest.class
})
public class AllTest {
}
