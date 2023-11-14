package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	private int code;
	private String name;
	private String text;
	private double price;
	private double vat;
	
	// CONSTRUCTOR
	
    public Prodotto(String name, String text, double price, double vat) {
        this.code = generateRandomCode();
        this.name = name;
        this.text = text;
        this.price = price;
        this.vat = vat;
    }
    
    //	GETTER & SETTER
	
	public int getCode(){
		return code;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getText(){
		return text;
	}
	public void setText(String text){
		this.text = text;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public double getVat(){
		return vat;
	}
	public void setVat(int vat){
		this.vat = vat;
	}
	
	// METODO PER IL PREZZO BASE
	
    public double getBasePrice() {
        return price;
    }
    
    // METODO PER IL PREZZO CON IVA
    public double getTotalPrice() {
        return price * (1 + vat / 100);
    }

    // METODO PER IL NOME
    public String getExtendedName() {
        return generatedPaddedCode() + "-" + name;
    }

    // METODO PER CODICE
    private int generateRandomCode() {
        Random rnd = new Random();
        return rnd.nextInt(10000000);
    }
    
    // METODO PER IL CODICE CON 0
    
    private String generatedPaddedCode(){
    	String codeString = String.valueOf(generateRandomCode());
    	
    	int z = 8 - codeString.length();
    	
        if (z > 0) {
            String paddedCode = "";
            for (int i = 0; i < z; i++) {
                paddedCode = paddedCode + '0';
            }
            paddedCode = paddedCode + codeString;

            return paddedCode;
        } else {
        	
            return codeString;
        }
    }
    
    @Override
    public String toString() {
        return "Prodotto: " +
                "Name= " + getExtendedName() +
                ", text= " + text +
                ", price no Vat= " + getBasePrice() +
                ", price with Vat= " + getTotalPrice() +
                ", vat= " + vat ;
    }
}

