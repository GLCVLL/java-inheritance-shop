package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	
	    private String imeiCode;
	    private int memory;
	    
	    //CONSTRUCTOR

	    public Smartphone(String name, String text, double price, double vat, String imeiCode, int memory) {
	        super(name, text, price, vat);
	        this.imeiCode = imeiCode;
	        this.memory = memory;
	    }
	    
	    // GETTER & SETTER

		public String getImei() {
			return imeiCode;
		}

		public void setImei(String imeiCode) {
			this.imeiCode = imeiCode;
		}

		public int getMemory() {
			return memory;
		}

		public void setMemory(int memory) {
			this.memory = memory;
		}
		
		@Override
		public String toString() {
			return super.toString()
					+ "imei= " + imeiCode 
					+ "memory= " + memory;
		}
	    
	    
}
