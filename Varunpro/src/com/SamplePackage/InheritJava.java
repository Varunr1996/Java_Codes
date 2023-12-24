package com.SamplePackage;

public class InheritJava {
	
	protected void supermethod1() {
	
	System.out.println("Grand-father");

}
	protected void supermethod2() {
		
		System.out.println("Grand-mother");
		
	}
	public static void main(String[] args) {
		InheritJava a = new InheritJava();
		a.supermethod1();
		a.supermethod2();
	}
	}

