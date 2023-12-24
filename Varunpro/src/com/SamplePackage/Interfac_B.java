package com.SamplePackage;

public class Interfac_B implements Interfac_A {
	
	public void AccountNumber() {
		
		System.out.println("Acc No : 1283837849847");
		
	}
	public void Pin() {
		
		System.out.println("Pin : ****");
		
	}
	public void ccv() {
		System.out.println("***");
		
	}
	public static void main(String[] args) {
		
		Interfac_B b = new Interfac_B();
		b.AccountNumber();
		b.Pin();
		b.ccv();
	}

}
