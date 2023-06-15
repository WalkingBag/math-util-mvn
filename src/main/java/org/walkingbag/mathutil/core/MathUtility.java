package org.walkingbag.mathutil.core;

/**
 *
 * @author Walking Bag
 */
//This class clone 100% all of java.util.Math from JDK.
//Math.sqrt() Math.sin() Math.random()
public class MathUtility {
    
    public static final double PI = 3.1415;
    
    //Calculate n! = 1.2.3...n
    //Design and measure for this method.
    //0! = 1! = 1
    //Do not apply for negatives (n<0 is not allowed), if any of the problems happens throws it to exception.
    //Do not apply for numbers that're > 20. Because 20! is fit enough for Long datatype (18 digits) (21! is not allowed).
    //
    public static long getFactorial(int n){
        
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be between 0 - 20, please I beg you."); 
            //This line will abort everything (everything loaded to the memory) that's happening in the main
        
        if (n == 0 || n == 1) 
            return 1;
        
        long product = 1; //Start: 1, after that multiply itself.
        
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        
        return product;
        //When returning, it's forbidden to system.out;
        //If you wanted to output that values, then use technique LOGGING.
    }
    
    
    //TEST CASE AND TEST DRIVE DEVLEOPMENT - TDD
    //Coding the methods and test code are processed simulatneously.
    //Meaning after finish a function, you must test straight away with the test code you have written.
    //We write a set of test cases, lots of test cases to make sure it's running properly.
    //We add/modify/fix our code while running the test until it's good enough.
    //Similar to QC: We write test case and run test case.
    //Different to QC: We have to write/fix code for the application we're building as well.
    //Test case is a set of data put into the application to test if it's working properly.
    //Test case includes input, expected value and methods to execute test cases.
    //Input data, process, display and output result.
    
    //Function getF(), the set of data is 0!: 0!->1, 1! -> 1, 2! -> 2, 3! -> 6
    //4! -> 24, 5! -> 120; (CONSTRAINT: negatives and over 20)
    //There're lots of data, each methods uses each test methods given => called test cases.
    
    //TEST CASES BASIC FORMATS
    
    //TEST CASE #1: Check GetF() with n = 0;
    //Steps/Procedures - how to write test methods for other devs.
    //                  1. given n = 0;
    //                  2. given getF(with n = 0)
    //Expected result: write your expected outputs.
    //                  expected values: 1
    
    //TLDR: Give n=0 use getF() and expect output result to be 1.
    
    //TEST CASE #2: Exactly like how test case 1 did.
    
}
