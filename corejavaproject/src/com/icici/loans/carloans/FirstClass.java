package com.icici.loans.carloans;

public class FirstClass {
	int a=10,b=20,c;
	public void add(){
		c=a+b;
		System.out.println("addition of a&b is:"+c);
		
	}
	public void sub() {
		c=a-b;
		System.out.println("subtraction of a&b is"+c);
		
	}
	

	public static void main(String[] args) {
		System.out.println("This is my first class");
		FirstClass obj=new FirstClass();
		obj.add();
		obj.sub();
		System.out.println("a="+obj.a+"  and b="+obj.b);
		
		
	}

}
