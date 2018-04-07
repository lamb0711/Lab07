package edu.handong.csee.java.lab07.prob1;//package name
import java.util.Scanner;//use scanner class 
/**
 * It is YearToCentury class that calculates the century given a year.
 * @author magic
 */
public class YearToCentury {//YearToCentury class
	int divYear;//save year variable that divided by 100
	int modYear;//save year variable that remainder of divided by 100
	int yr;//input data year
	int century=0;//save century of year
	/**
	 * setter method save input data in YearToCentury class.
	 * @param year
	 */
	public void setYear(int year) {//setter method save data in class variable yr.
		yr = year;//save input year to yr
	}
	/**
	 * whatCentury method calculate century of input year.
	 * @return
	 */

	public int whatCentury() {//this method calculate century of year. and return century
		divYear = yr;//save input year to divYear
		modYear = yr;//save input year to modYear

		if(yr==2000) return 20;//if yr is 2000, return 20. (it is exception)

		century = divYear/100+1;//save century
		modYear = yr%100;//save remainder of divided by 100

		if(modYear == 0) century--;//if remainder is 0, century subtract by -1

		return century;//return century variable

	}
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {//main method
		// TODO Auto-generated method stub
		int year;//save input year

		Scanner keyboard = new Scanner(System.in);//use scanner class with keyboard

		YearToCentury ytc = new YearToCentury();//declare instance variable ytc

		System.out.println("Input Year: ");//print message for input year
		year = keyboard.nextInt();//input year and save it
		ytc.setYear(year);//call setter method 

		System.out.println(year+" is "+ytc.whatCentury()+"th century.");//call WhatCentury method and print century 

	}

}
