package com.masaijava111;

public class CricketScore {
	static void totalScore(int num1,int num2,int num3,int num4,int num5) {
		int total =num1+num2+num3+num4+num5;
		System.out.println(total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1;
		int num2=3;
		int num3=2;
		int num4=4;
		int num5=6;
		totalScore(num1, num2, num3, num4, num5);
	}

}
