package edu.handong.csee.java.lab07.prob2;

public class Chicken {
	public String name;
	public double price;
	public int star;
	
	public Chicken() {
		name = "";
		price = 0.00;
		star = 0;
	}
	
	public Chicken(String name, double price, int star) {
		this.name = name;
		this.price = price;
		this.star = star;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getStar() {
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
	Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5);
	Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);
	Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);

	menu1.setStar(3);
	menu2.setStar(4);
	menu3.setStar(1);
	
	System.out.println(menu1.getName() + "'s rating is " + menu1.getStar());
	System.out.println(menu2.getName() + "'s rating is " + menu2.getStar());
	System.out.println(menu3.getName() + "'s rating is " + menu3.getStar());



	}

}
