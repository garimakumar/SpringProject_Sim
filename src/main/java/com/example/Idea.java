package com.example;

public class Idea  implements Sim{

private String dataStrength;
	
	
	public Idea(String dataStrength) {
	super();
	this.dataStrength = dataStrength;
}

	@Override
	public void TypeOfSim() {
		
		System.out.println("This is Idea Sim");

	}

	@Override
	public void DataTypeOfSim() {
		
		System.out.println("Provides 4G network");

	}
	
	public void DisplayInIdea() {
		
		System.out.println(dataStrength);
	}

	
}
