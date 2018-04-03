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
	
	public Attendance(String n, int y, int s, int a) {
		this.name = n;
		this.year = y;
		this.stdNum = s;
		this.absence = a;
	}
	
	public void randAbsence() {
		Random randomGen = new Random();
		int randomInt = randomGen.nextInt(10);
		this.absence = randomInt;
	}
	
	public void compareAbsence() {
		if(this.absence > 6) {
			System.out.println("¡°I¡¯m sorry, "+this.name+". You failed this course");
		    System.out.println(this.name + " - Number of absence: " + this.absence);
		}
		    else
			System.out.println("We'll see about the grade, " + this.name);

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
	
	public void setAbsence(int a) {//save input data to stdNum variable
		this.absence = a;//save s to stdNum
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Attendance s_1 = new Attendance();
		Attendance s_2 = new Attendance();
		Attendance s_3 = new Attendance("Lucas", 1, 21833222, 0);
		Attendance s_4 = new Attendance("Martha", 2, 21733444, 0);
		
		s_1.setName("Jess"); s_1.setYear(4); s_1.setStdNum(21400999); s_1.setAbsence(0);
		s_2.setName("Kent"); s_2.setYear(2); s_2.setStdNum(21700111); s_2.setAbsence(0);
		
		s_1.randAbsence();
		s_2.randAbsence();
		s_3.randAbsence();
		s_4.randAbsence();
		
		s_1.compareAbsence();
		s_2.compareAbsence();
		s_3.compareAbsence();
		s_4.compareAbsence();
		
	}

}
