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
		


		if(unsortedInts.length == 0){
			throw new IllegalArgumentException("Array is empty.");
		}
		
		
		int[] sortedArray = new int[unsortedInts.length]; //temp array
		int sortedMin = unsortedInts[0]; //default minimum

		for(int i = 0; i < unsortedInts.length-1; i++){
			if(sortedMin < unsortedInts[i+1]){
				sortedArray[i] = unsortedInts[i];
				sortedArray[i+1] = unsortedInts[i+1];
				sortedMin = sortedArray[i+1];
			} else {
				sortedArray[i] = unsortedInts[i+1];
				sortedArray[i+1] = unsortedInts[i];
				sortedMin = sortedArray[i+1];
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
