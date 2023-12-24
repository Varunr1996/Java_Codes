package com.SamplePackage;

public class InheritJavab extends InheritJava {
	protected void submethod1() {
		
		System.out.println("father");
		
	}
	
	protected void submethod2() {
	
		System.out.println("mother");
		
	}
	
	public static void main(String[] args) {
		InheritJavab b = new InheritJavab();
		b.supermethod1();
		b.supermethod2();
		b.submethod1();
		b.submethod2();
		
		
	}

}
