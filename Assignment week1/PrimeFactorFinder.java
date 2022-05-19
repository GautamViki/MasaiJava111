package com.masaijava111;

public class PrimeFactorFinder {
	static void primeFactor(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+", ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=11;
		if(number<100 && number>2) {
			primeFactor(number);
		}
		else {
			System.out.println("Invalid number");
		}
	}

}
