package com.icici.loans.carloans;

public abstract class FirstAbstract {
	public void m1() {
	System.out.println("i am concreate method of m1");	
	}
	public abstract void m2();
		
	
	

	public static void main(String[] args) {
		FirstAbstract f=new Child();
		f.m1();
		f.m2();
		

	}

}
