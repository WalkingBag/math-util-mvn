package org.walkingbag.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.walkingbag.mathutil.core.MathUtility.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.walkingbag.mathutil.core.MathUtility;

/**
 *
 * @author Walking Bag
 */
public class MathUtilityAdvancedTest {
    
    //The prepared function to data test and used to fill into the AssertE() func below.
    public static Object[][] initTestData(){
        Object testData[][] = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {4, 24}, 
                               {6, 720}};
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunsWell(int n, long expected){
        assertEquals(expected, getFactorial(n));
    }
    
    @Test
    public void testFactorialGivenWrongArgumentThrowException(){
        
//        Executable gF = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                MathUtility.getFactorial(-5);
//            }
//        };

        Executable gF = () -> MathUtility.getFactorial(-5);
        
        assertThrows(IllegalArgumentException.class,
                gF);
        //It needs an executable, just make a lambda expression.
    }
    
}
