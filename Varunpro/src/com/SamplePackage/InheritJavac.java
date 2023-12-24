package com.SamplePackage;

public class InheritJavac extends InheritJavab {
	private void submethod3() {
		
		System.out.println("son");
		
	}
	private void submethod4(){
		
		System.out.println("daughter");
	}
	public static void main (String[] args) {
		InheritJavac c = new InheritJavac();
		c.supermethod1();
		c.supermethod2();
		c.submethod1();
		c.submethod2();
		c.submethod3();
		c.submethod4();
	}

}
