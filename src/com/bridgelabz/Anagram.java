/**
 * 
 */
package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hp
 *
 */
/*
 * 6. An Anagram Detection Example a. Desc -> One string is an anagram of
 * another if the second is simply a rearrangement of the first. For example,
 * 'heart' and 'earth' are anagrams... b. I/P -> Take 2 Strings as Input such
 * abcd and dcba and Check for Anagrams c. O/P -> The Two Strings are Anagram or
 * not....
 */
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1, string2;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string : ");
		string1 = input.nextLine();
		System.out.print("Enter the second string : ");
		string2 = input.nextLine();
		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();
		if (string1.length() == string2.length()) {
			char[] array1 = string1.toCharArray();
			char[] array2 = string2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			boolean my_result = Arrays.equals(array1, array2);
			if (my_result) {
				System.out.println("The strings " + string1 + " and " + string2 + " are anagram.");
			} else {
				System.out.println("The strings " + string1 + " and " + string2 + " are not anagram.");
			}

		}
	}

}
