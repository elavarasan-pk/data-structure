package com.hi.techpoints.algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author elavarasan_pk
 *
 */
public class MarcsCakewalk {

	/** Determine the minimum number of miles Marc must walk to maintain his weight.
	 * @param calorie
	 * @return
	 */
	public static long marcsCakewalk(int[] calorie) {
        Arrays.sort(calorie);
        long sum = 0;
        for(int c = 0;c < calorie.length;c++) {
           long pow = (long)Math.pow(2,c);
           sum = sum + (pow * calorie[calorie.length-1-c]);
        }
        return sum;
    }
	
	public static void main(String[] args) {
		String input = "4 \n" //Input array size.
			      + "2 7 8 1";//Array values.
		Scanner sc = new Scanner(input);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		long result = marcsCakewalk(arr);
		System.out.println(result);
		sc.close();
	}
}
