/* PairSum.java
   CSC 201
   
   Template for the PairSum201 problem, which takes an array A and returns
	- true if there are two elements of A which add to 201
	- false otherwise
   
   The provided code for the problem (in the PairSum201 function below) implements
   a O(n^2) algorithm. A simple O( n*log(n) ) algorithm also exists if array., 
   and the optimal algorithm is O(n).

	Adapted from assignment given by Bill Bird, 2015

   A. Webster 2016
   edited 9/10/18
*/

import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PairSum{
	/* PairSum201()
		The input array A will contain non-negative integers. The function
		will search the array A for a pair of elements which sum to 201.
		If such a pair is found, return true. Otherwise, return false.
		The function may modify the array A.
		Do not change the function signature (name/parameters).
	*/
	public boolean PairSum201(int[] A){
		
		int n = A.length;
		
		//Use nested loops to check every pair of values in A
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				if (A[i] + A[j] == 201) {
					System.out.println(A[i] + " " + A[j]);
					return true;
				}
			}
			
		}
		
		return false;
	}

	/* main()
	   Contains code to test the PairSum201 function. 
	*/
	public static void main(String[] args){
		PairSum p = new PairSum();
		Scanner file;
		int [] array = null;
		
		//read in a file and store in array
		try {
			file = new Scanner(new FileReader("ints.txt"));
			
			int many = file.nextInt();
			array = new int[many];
			int counter = 0;
			while(file.hasNext()) {
				array[counter] = file.nextInt();
				counter++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		long startTime = System.currentTimeMillis();
		
		boolean pairExists = p.PairSum201(array);
		System.out.println(pairExists);
		
		long endTime = System.currentTimeMillis();
		
		double totalTimeSeconds = (endTime-startTime)/1000;
		
		System.out.printf("Array %s a pair of values which add to 201.\n",pairExists? "contains":"does not contain");
		System.out.printf("Total Time (seconds): %.4f\n",totalTimeSeconds);
	}
}