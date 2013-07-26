package com.aj.project;
/**
 * The Project
 * @author Dan Perras
 */
public class Project extends Thread {
	
	boolean isRunning;
	
	/**
	 * Create a new {@link Project}
	 */
	public Project() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Start the project!
	 */
	public void start() {

		isRunning = true;
		System.out.println("Program has started");
		
		while(isRunning){
			System.out.println("running");
			try {
				Project.sleep(5000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
		//TODO make a while loop tests a CLASS-LEVEL boolean variable called isRunning
		//once start is called, that variable will need to be set to true before entering the while loop
		//in the while loop just print "running" every 5 seconds
	}
	
	//public void stop() {
		//isRunning = false;
	//}
}