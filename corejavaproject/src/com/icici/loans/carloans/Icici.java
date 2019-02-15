package com.icici.loans.carloans;

public class Icici implements Rbi{

	public static void main(String[] args) {
		Icici obj=new Icici();
		obj.withdrawl();
		obj.deposit();

		
		
	}

	@Override
	public void withdrawl() {
		System.out.println("i am overridden withdrawl in Icici");
		
	}

	@Override
	public void deposit() {
		System.out.println("i am overridden deposit in Icici");
		
	}

}
