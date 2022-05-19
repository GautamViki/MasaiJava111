package com.masaijava111;

public class CheckVowels {
	void checkChar(char ch) {
		String strSma="bcdfghjklmnpqrstvwxyz";
		String strCap="BCDFGHJKLMNPQRSTVWXYZ";
		String vow="aeiou";
		String vowCap="AEIOU";
		boolean flag=false;
		for(int i=0;i<21;i++) {
			if(ch==strCap.charAt(i)||ch==strSma.charAt(i)) {
				flag=true;
				System.out.println("Consonant");
			}
		}
		for(int i=0;i<5;i++) {
			if(ch==vowCap.charAt(i)||ch==vow.charAt(i)) {
				flag=true;
				System.out.println("Vowel");
			}
		}
		if(flag==false) {
			System.out.println("invalid character");
		}
	}
	
	public static void main(String[] args) {
		char ch='6';
		CheckVowels v1=new CheckVowels();
		v1.checkChar(ch);
	}
}
