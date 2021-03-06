package com.aj.project.fun;

import java.util.Arrays;
import java.util.Random;
/**
 * Class to sort and stuff and have fun
 * @author Dan Perras
 */
public class SortApp {

	private static final Random RANDOM = new Random();

	/**
	 * Do it
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] randomNumbers = getRandomNumbers();
		System.out.println("Unsorted: " + Arrays.toString(randomNumbers));
		
		int maxValue = getMaxValue(randomNumbers);
		System.out.println("Max value is: " + maxValue);
		
		int[] sortedNumbers = sort(randomNumbers);
		System.out.println("Sorted: " + Arrays.toString(sortedNumbers));
	}

	/**
	 * Takes an unsorted array of ints
	 * and returns the largest value.
	 * If any array size of 0 is passed in,
	 * an IllegalArgumentException is thrown.
	 * @param unsortedInts
	 * @return int
	 * @throws IllegalArgumentException
	 */
	private static int getMaxValue(int[] unsortedInts) throws IllegalArgumentException{
		//TODO make it happen

		if(unsortedInts.length == 0){
			throw new IllegalArgumentException("Array is empty.");
		}

		int max = unsortedInts[0]; //set a default max
		
		for(int i = 0; i < unsortedInts.length; i++){ //iterate through array
			if(unsortedInts[i] > max){ //if the element in the array at i is greater than the max, the new max is assigned to that element
				max = unsortedInts[i];
			}
		}

		return max; 
	}

	/**
	 * Takes an unsorted array of ints
	 * and returns the sorted values.
	 * If any array size of 0 is passed in,
	 * an IllegalArgumentException is thrown.
	 * @param unsortedInts
	 * @return int
	 * @throws IllegalArgumentException
	 */
	private static int[] sort(int[] unsortedInts) throws IllegalArgumentException {
		if(unsortedInts.length == 0)
			throw new IllegalArgumentException("Array is empty.");
		
		//sorted array is the same length as the unsorted
		int[] sortedArray = new int[unsortedInts.length];
		//fill the sorted array with all MAX to make greater than comparison work
		Arrays.fill(sortedArray, Integer.MAX_VALUE); 

		//iterate over each unsorted int
		for(int i = 0; i < unsortedInts.length; i++){
			//need to iterate over each int in the sorted array
			for(int j = 0; j < sortedArray.length; j++) {
				//until an appropriate spot is found for this unsorted int
				if(unsortedInts[i] < sortedArray[j]) {
					//then move each sorted element over one spot
					for(int k = sortedArray.length - 2; k >= j; k--) {
						sortedArray[k + 1] = sortedArray[k];
					}
					//now put the unsorted int into its new sorted spot
					sortedArray[j] = unsortedInts[i];
					//break the sorted int for loop. since we already found a spot, we can stop iterating
					break;
				}
			}
		}
		return sortedArray;
	}

	/**
	 * Method to return an int array, between
	 * the size of 0 and 50 containing all random
	 * ints between 0-500.
	 * @return int[]
	 */
	private static int[] getRandomNumbers() {
		int[] randomInts = new int[RANDOM.nextInt(50)]; //random array size between 0-50

		for (int i = 0; i < randomInts.length; i++) {
			randomInts[i] = RANDOM.nextInt(500); //random between 0-500
		}
		return randomInts;
	}
}
