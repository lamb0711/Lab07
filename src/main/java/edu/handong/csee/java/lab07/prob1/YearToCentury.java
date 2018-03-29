package edu.handong.csee.java.lab07.prob1;//package name
import java.util.Scanner;//use scanner class
/**
 * It is YearToCentury class that calculates the century given a year.
 * setter method save input data in YearToCentury class.
 * WhatCentury method calculate century of input year.
 * @author magic
 *
 */
public class YearToCentury {//YearToCentury class
	int divYear;//save year variable that divided by 100
	int modYear;//save year variable that remainder of divided by 100
	int yr;//input data year
	int century=0;//save century of year
	
	public void setter(int year) {//setter method save data in class variable yr.
		yr = year;
	}
	
	public int WhatCentury() {//this method calculate century of year. and return century
		divYear = yr;
		modYear = yr;
		
		if(yr==2000) return 20;
		
		century = divYear/100+1;
		modYear = yr%100;
		
		if(modYear == 0) century--;
		
		return century;
		
	}

	public static void main(String[] args) {//main method
		// TODO Auto-generated method stub
		int year;//save input year
		
		Scanner keyboard = new Scanner(System.in);
		
		YearToCentury ytc = new YearToCentury();
		
		System.out.println("Input Year: ");
		year = keyboard.nextInt();
		ytc.setter(year);
		
		System.out.println(year+" is "+ytc.WhatCentury()+"th century.");
		
	}

}
