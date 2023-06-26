package org.walkingbag.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.walkingbag.mathutil.core.MathUtility;

/**
 *
 * @author Walking Bag
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentRunsWell(){
//        assertEquals(69, 69);
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(120, MathUtility.getFactorial(6));
    }
    
}
