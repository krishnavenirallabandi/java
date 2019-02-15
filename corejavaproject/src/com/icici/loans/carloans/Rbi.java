package com.icici.loans.carloans;

public interface Rbi {
	public void withdrawl();
	public void deposit();
	public static void main(String[]args ) {
		Rbi r=new Icici();
		r.deposit();
		r.withdrawl();
		Rbi r1=new Hdfc();
		r1.deposit();
		r1.withdrawl();
		
	}
	

}
