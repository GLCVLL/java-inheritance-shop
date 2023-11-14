package org.lessons.java.shop;

public class Cuffie extends Prodotto {
	
	private String color;
	private boolean Wireless;
	
	//CONSTRUCTOR
	
	public Cuffie(String name, String text, double price, double vat, String color, boolean Wireless) {
    super(name, text, price, vat);
    this.color = color;
    this.Wireless = Wireless;
	}
	
	//GETTER & SETTER	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean Wireless() {
		return Wireless;
	}

	public void setWireless(boolean Wireless) {
		this.Wireless = Wireless;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "colore= " + color
				+ "wireless o cablate= " + Wireless;
	}


}
