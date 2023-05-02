package com.codingdojo.loops;

public class Item {
	    // MEMBER VARIABLES
	    private String name;
	    private double price;
	    // CONSTRUCTOR
	    public Item(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }
	    
	    //Getters
	    public String getName() {
	    	return name;
	    }
	    
	    public double getPrice() {
	    	return price;
	    }
	    
	    
	    //Setters
	    public void setName(String name) {
	    	this.name = name;
	}
	    
	    public void setPrice(double price) {
	    	this.price = price;
	    }
	    
}
