package edu.handong.csee.java.lab07.prob2;

public class Chicken {
	public static String name;
	public static double price;
	public static int star;
	
	public void Chicken() {
		name = "";
		price = 0.00;
		star = 0;
	}
	
	public void Chicken(String n, double p, int s) {
		this.name = n;
		this.price = p;
		this.star = s;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int star() {
		return this.star;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setPrice(double p) {
		this.price = p;
	}
	
	public void setStar(int s) {
		this.star = s;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
