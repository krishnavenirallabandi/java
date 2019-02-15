package com.icici.loans.carloans;

import javax.swing.text.AsyncBoxView.ChildLocator;

public class Child extends FirstAbstract{
	

	public static void main(String[] args) {
	Child c=new Child();
	c.m1();
	c.m2();
		
			
			
		};


		@Override
		public void m1() {
		System.out.println("concreate method m1 overridden in child class");
			
		}

		
		
		
	

	

	@Override
	public void m2() {
	System.out.println("abstract method m2 implemented in child class");
		
	}

}
