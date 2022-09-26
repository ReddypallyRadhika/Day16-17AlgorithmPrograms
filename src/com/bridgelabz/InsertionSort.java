/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
/*
 * Insertion Sort a. Desc -> Reads in strings and prints them in sorted order
 * using insertion sort. b. I/P -> read in the list words c. Logic -> Use
 * Insertion Sort to sort the words in the String array d. O/P -> Print the
 * Sorted List
 */
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, i, j;
		String words;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the Size of Array: ");
		n = input.nextInt();
		String[] arr = new String[n];
		System.out.print("Enter " + n + " words: ");
		i = 0;
		while (i < n) {
			arr[i] = input.nextLine();
			i++;
		}

		i = 1;
		while (i < n) {
			words = arr[i];

			j = i - 1;
			while (j >= 0 && arr[j] != words) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = words;
			i++;
		}

		System.out.println("\nThe new sorted array is: ");
		i = 0;
		while (i < n) {
			System.out.print(arr[i] + " ");
			i++;
		}
	}

}
