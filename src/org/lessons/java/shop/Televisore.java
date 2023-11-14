package org.lessons.java.shop;

public class Televisore extends Prodotto {
	
	private int size;
	private boolean smart;
	
	//CONSTRUCTOR
	
	public Televisore(String name, String text, double price, double vat, int size, boolean smart) {
    super(name, text, price, vat);
    this.size = size;
    this.smart = smart;
	}
	
	//GETTER & SETTER

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "size= " + size
				+ "smart= " + smart;
	}
	
	
}


