package com.hi.techpoints.algorithms;

import java.util.Scanner;

/**
 * @author elavarasan_pk
 *
 */
public class QuicksortPartition {

	
	/** Performing quickSort
	 * @param arr
	 */
	public static void partition(int[] arr) {
		int zero = 0, 
			size = arr.length - 1, 
			leftIndex = zero, //Assigning left index as ZERO
			rightIndex = size + 1,//Assigning right index as actual array input size.
			pivot = arr[zero];
		while (size > zero) {
			while (arr[++leftIndex] < pivot) {
				if (leftIndex == size)
					break;
			}
			while (arr[--rightIndex] > pivot) {
				if (rightIndex == zero)
					break;
			}
			if (leftIndex >= rightIndex) {
				break;
			}
			swap(arr, leftIndex, rightIndex);
		}
		swap(arr, zero, rightIndex);
		printArray(arr);
	}

	/** if rightIndex array is less than pivot value,
	 * Swapping the rightIndex value  to leftIndex position array.   
	 * @param array
	 * @param i
	 * @param j
	 */
	private static void swap(int arr[], int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	/** After quick sort, Print output on single line.
	 * @param arr
	 */
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.format("%d ", arr[i]);
		}
	}

	public static void main(String[] args) {
		String input = "7 \n" //Input array size.
				      + "6 4 1 3 8 7 9";//Array values.
		Scanner sc = new Scanner(input);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		partition(arr);
		sc.close();

	}
}