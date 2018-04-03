package edu.handong.csee.java.prob3;
import java.util.Random;
public class Attendance {
	public String name;
	public int year;
	public int stdNum;
	public int absence;
	
	public Attendance() {
		this.name = "";
		this.year = 0;
		this.stdNum = 0;
		this.absence = 0;
	}
	
	public Attendance(String n, int y, int s) {
		this.name = n;
		this.year = y;
		this.stdNum = s;
	}
	
	public void randAbsence() {
		Random randomGen = new Random();
		int randomInt = randomGen.nextInt(10);
		this.absence = randomInt;
	}
	
	public void compareAbsence() {
		if(this.absence > 6)
			System.out.println("��I��m sorry, "+this.name+". You failed this course");
	}
	
	public String getName() {//return name variable
		return this.name;//return name
	}

	public int getYear() {//return year variable
		return this.year;//return year
	}

	public int getStdNum() {//return student number variable
		return this.stdNum;//return stdNum
	}

	public void setName(String n) {//save input data to name variable
		this.name = n;//save n to name
	}

	public void setYear(int y) {//save input data to year variable
		this.year = y;//save y to year
	}

	public void setStdNum(int s) {//save input data to stdNum variable
		this.stdNum = s;//save s to stdNum
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
