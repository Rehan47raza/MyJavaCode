package com;

public class BasicPayException extends Exception {

//private static final long serialVersionUID = 1L;
private double basicSalary;

public BasicPayException(double basicSalary){
	this.basicSalary=basicSalary;
}

public String getMessage(){
	
	
	return null;
	
}

public double getBasicSalary() {
	return basicSalary;
}

public void setBasicSalary(double basicSalary) {
	this.basicSalary = basicSalary;
}
}
