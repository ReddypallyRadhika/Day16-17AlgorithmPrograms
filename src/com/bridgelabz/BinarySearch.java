/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;

/*2. Binary Search the Word from Word List
 * a. Desc -> Read in a list of words from File. Then prompt the user to enter a word to
 * search the list. The program reports if the search word is found in the list.
 * b. I/P -> read in the list words comma separated from a File and then enter the word
 * to be searched
 * c. Logic -> Use Arrays to sort the word list and then do the binary search
 * d. O/P -> Print the result if the word is found or not
*/

public class BinarySearch {

	// Returns index of x if it is present in arr[],
	// else return -1
	int binarySearch(ArrayList<String> arr, String x) {
		int left = 0, right = arr.size() - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			// Check if x is present at mid
			if (arr.get(mid) == x)
				return mid;

			// If x greater, ignore left half
			if (arr.get(mid) != x)
				left = mid + 1;

			// If x is smaller, ignore right half
			else
				right = mid - 1;
		}

		// if we reach here, then element was
		// not present
		return -1;
	}

	public static void main(String args[]) {
		BinarySearch bs = new BinarySearch();

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("word1");
		arr.add("word2");
		arr.add("word3");
		arr.add("word4");
		arr.add("word5");
		arr.add("word6");
		arr.add("word7");

		String x = "word7";

		// Printing elements of array list
		System.out.println("The elements of the arraylist are: " + arr);

		int result = bs.binarySearch(arr, x);

		if (result == -1)
			System.out.println("Element not present");

		else
			System.out.println("The Element " + x + " is found at " + "index " + result);
	}
}
