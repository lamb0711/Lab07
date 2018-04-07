package edu.handong.csee.java.lab07.prob2;//package name
/**
 * Chicken class is set and get name, price and star.
 * @author magic
 *
 */
public class Chicken {//Chicken class
	public String name; //save chicken name variable
	public double price;//save chicken price variable
	public int star;//save star variable
	/**
	 * Chicken() method is basic method. if input data is not found, implement this method.
	 * @param name
	 * @param price
	 * @param star
	 */
	public Chicken() {//if input data is not found, implement this method.
		name = "";//name empty
		price = 0.00;//0 price
		star = 0;//0 star
	}
	/**
	 * Chicken(string, double, int) method is basic method. if input data exist, implement this method.
	 * @return
	 */

	public Chicken(String name, double price, int star) {//if input data exist, implement this method.
		this.name = name;//save input data to name
		this.price = price;//save input data to price
		this.star = star;//save input data to star
	}
	/**
	 * getName methods are return their variable.
	 * @return
	 */
	public String getName() {//return name variable
		return this.name;//return name
	}
	/**
	 * getPrice methods are return their variable.
	 * @return
	 */
	public double getPrice() {//return price variable
		return this.price;//return price
	}
	/**
	 * getStar methods are return their variable.
	 * @return
	 */
	public int getStar() {//return star variable
		return this.star;//return star
	}
	/**
	 * setName methods save input variable to their variable.
	 * @param n
	 */
	public void setName(String n) {//save input data to name variable
		this.name = n;//save n to name
	}
	/**
	 * setPrice methods save input variable to their variable.
	 * @param p
	 */
	public void setPrice(double p) {//save input data to price variable
		this.price = p;//save p to price
	}
	/**
	 * setStar methods save input variable to their variable.
	 * @param s
	 */
	public void setStar(int s) {//save input data to star variable
		this.star = s;//save s to star
	}
	/**
	 * main method
	 * @param args
	 */

	public static void main(String[] args) {//main method
		// TODO Auto-generated method stub
		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5);//call instance variable menu1 and initialize data
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);//call instance variable menu2 and initialize data
		Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);//call instance variable menu3 and initialize data

		menu1.setStar(3);//save input data to menu1 star
		menu2.setStar(4);//save input data to menu2 star
		menu3.setStar(1);//save input data to menu3 star

		System.out.println(menu1.getName() + "'s rating is " + menu1.getStar());//print menu1 chicken name and star to use get method
		System.out.println(menu2.getName() + "'s rating is " + menu2.getStar());//print menu2 chicken name and star to use get method
		System.out.println(menu3.getName() + "'s rating is " + menu3.getStar());//print menu3 chicken name and star to use get method



	}

}
