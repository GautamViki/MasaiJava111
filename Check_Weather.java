package com.masaijava111;

public class Check_Weather {
	public static void main(String [] args) {
		boolean isSnowing=true;
		boolean isRaining=true;
		double temperature =60.0;
		
		if(isRaining|| isSnowing||temperature <50) {
			System.out.println( "Let?s stay home.");
		}
		else {
			System.out.println("Let?s go out!");
		}
	}
}
