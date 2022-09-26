/**
 * 
 */
package com.bridgelabz;

import java.util.Arrays;

/**
 * @author hp
 *
 */
public class PrimeAnagram {

	/**
	 * @param args
	 */
	 static boolean areAnagrams(int a, int b)
	    {
	 
	        // Converting numbers to strings
	        char[] c = (String.valueOf(a)).toCharArray();
	        char[] d = (String.valueOf(b)).toCharArray();
	 
	        // Checking if the sorting values
	        // of two strings are equal
	        Arrays.sort(c);
	        Arrays.sort(d);
	 
	        return (Arrays.equals(c, d));
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	        int a = 240;
	        int b = 204;
	 
	        System.out.println((areAnagrams(a, b)) ? "Yes"
	                                               : "No");
	    }
	
	 
}
