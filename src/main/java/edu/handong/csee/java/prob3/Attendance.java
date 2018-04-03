package edu.handong.csee.java.prob3;
import java.util.Random;
public class Attendance {
	public String name;
	public int year;
	public int sutNum;
	public int absence;
	
	public Attendance() {
		this.name = "";
		this.year = 0;
		this.sutNum = 0;
		this.absence = 0;
	}
	
	public Attendance(String n, int y, int s) {
		this.name = n;
		this.year = y;
		this.sutNum = s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
