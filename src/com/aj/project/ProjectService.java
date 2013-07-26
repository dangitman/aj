package com.aj.project;

/**
 * Main entry point into our Project
 * @author Dan Perras
 */
public class ProjectService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//TODO project will need to be run within it's own thread
		Project p = new Project();
		p.start();

	}

}
