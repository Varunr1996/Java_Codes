package com.SamplePackage;

public class ConstructorJava {
	
	public void ConstructorJava() {//user method
		
		System.out.println("I'm a normal method");
		
	}
	
	public ConstructorJava() {//default constructor
		
		this(26);
		this.ConstructorJava();
		System.out.println("Constructor");
		
	}
	
	public ConstructorJava(String a) {//parameterised constructor
		
		System.out.println("parent name : " + a);
		
	}
	
	public ConstructorJava(int i) {//parameterised constructor
		
		this("HAYLEY");
		System.out.println("Age : " +i);
		
	}
	
	public static void main (String[] args) {
		
		ConstructorJava c = new ConstructorJava();
		
	}

}
