package com.mycompany.app;


public class App 
{
    
    public static boolean decrypt(int[] crypted, int[] solved, int add, int mult){
    	if (crypted == null){
    		if (solved != null)
    			return false;
    		else return true;
    	}
    	
    	if (crypted.length != solved.length)
    		return false;
    	
        for (int i = 0; i < crypted.length; i++){
        	if ((crypted[i]+add)*mult != solved[i])
        		return false;
        }
        return true;
    }
}

