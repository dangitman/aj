package com.aj.project;
/**
 * The Project
 * @author Dan Perras
 */
public class Project {
	
	boolean isRunning;
	int counter = 0;
	
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
				Thread.sleep(5000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			
			counter++;
			
			if (counter == 4){
				stop();
				System.out.println("Program has stopped");
			}
		}
	}
	
	public void stop() {
		isRunning = false;
	}
}