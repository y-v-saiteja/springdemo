package com.coforge.training.springdemo.model;

//constructor injection with dependant object of Address
//loosely coupled class- injecting address object at runtime
public class Candidate {

	private int id;
    private String name;
    //Aggregation
    private Address a;
	
    public Candidate() {
    	
    	System.out.println("CANDIDATE DETAILS: ");
	}

	public Candidate(int id, String name, Address a) {
		super();
		this.id = id;
		this.name = name;
		this.a = a;
	}
    
	public void disp()
    {
        System.out.println(id+" "+name);
        System.out.println(a);  // invoke toString() method of Address class
    }
    
    
    
    
    
    
}
