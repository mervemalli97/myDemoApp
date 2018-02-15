package com.mycompany.app;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public static int search(int[] arr1, int[] arr2, int first, int second){
        return arr1[first] + arr2[second];
    }
}
