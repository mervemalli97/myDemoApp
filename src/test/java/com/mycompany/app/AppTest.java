package com.mycompany.app;

import junit.framework.Test;
import java.util.ArrayList;
import java.util.Arrays;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    extends TestCase
{
    
    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testEmptyArray()
    {
    	ArrayList<Integer> arr1 = new ArrayList<Integer>();
    	ArrayList<Integer> arr2 = new ArrayList<Integer>();
        assertTrue(new App().decrypt(arr1, arr2, 0, 1) );
    }
    
    public void testSmallFirstArray()
    {
    	ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,1,1));
    	ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1,1,1,1,1));
        assertFalse(new App().decrypt(arr1, arr2, 0, 1) );
    }
    
    public void testBigFirstArray()
    {
    	ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1));
    	ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1,1,1,1,1));
        assertFalse(new App().decrypt(arr1, arr2, 0, 1) );
    }
    
    public void testAppropriateArrays()
    {
    	ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,1,1));
    	ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1,1,1));
        assertTrue(new App().decrypt(arr1, arr2, 0, 1) );
    }
    
    public void testInappropriateArrays()
    {
    	ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2,2,2,2,2));
    	ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1,1,1,1,1));
        assertFalse(new App().decrypt(arr1, arr2, 0, 1) );
    }
}
