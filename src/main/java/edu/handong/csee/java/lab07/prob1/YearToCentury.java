package edu.handong.csee.java.lab07.prob1;
import java.util.Scanner;
public class YearToCentury {
	int divYear;
	int modYear;
	int yr;
	int century=0;
	
	public void setter(int year) {
		yr = year;
	}
	
	public int WhatCentury() {
		divYear = yr;
		modYear = yr;
		
		century = divYear/100;
		modYear = yr%100;
		if(modYear <100) return (int)century;
		else if(modYear == 0) return (int)century+1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		
		Scanner keyboard = new Scanner(System.in);
		
		YearToCentury ytc = new YearToCentury();
		
		System.out.println("Input Year: ");
		year = keyboard.nextInt();
		ytc.setter(year);
		
		System.out.println(year+" is "+WhatCentury()+"th century.");
		
		

	}

}
