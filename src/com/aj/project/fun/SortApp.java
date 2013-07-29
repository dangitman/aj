package com.aj.project.fun;

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
		int maxValue = sort(randomNumbers);
		System.out.println("Max value is: " + maxValue);
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
	private static int sort(int[] unsortedInts) throws IllegalArgumentException{
		//TODO make it happen
		return -1; //obv needs to change
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