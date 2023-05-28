package com.example;

public class Airtel implements Sim {

private String dataStrength;

	
	public String getDataStrength() {
	return dataStrength;
}

public void setDataStrength(String dataStrength) {
	this.dataStrength = dataStrength;
}

	@Override
	public void TypeOfSim() {

		System.out.println("This is Airtel Sim");
	}

	@Override
	public void DataTypeOfSim() {
		
		System.out.println("Provides 5G network");
		
	}

	
}
