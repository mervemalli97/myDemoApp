package com.mycompany.app;

import junit.framework.Test;
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

    public void testNullArray()
    {
    	int [] arr1 = null;
    	int [] arr2 = null;
        assertTrue(new App().decrypt(arr1, arr2, 0, 1) );
    }
    
    public void testSmallFirstArray()
    {
    	int [] arr1 = {1,1,1};
    	int [] arr2 = {1,1,1,1,1};
        assertFalse(new App().decrypt(arr1, arr2, 0, 1) );
    }
    
    public void testBigFirstArray()
    {
    	int [] arr1 = {1,1,1,1,1,1,1};
    	int [] arr2 = {1,1,1,1,1};
        assertFalse(new App().decrypt(arr1, arr2, 0, 1) );
    }
    
    public void testAppropriateArrays()
    {
    	int [] arr1 = {1,1,1,1,1};
    	int [] arr2 = {1,1,1,1,1};
        assertTrue(new App().decrypt(arr1, arr2, 0, 1) );
    }
    
    public void testInappropriateArrays()
    {
    	int [] arr1 = {1,1,1,1,1};
    	int [] arr2 = {2,2,2,2,2};
        assertFalse(new App().decrypt(arr1, arr2, 0, 1) );
    }
}
