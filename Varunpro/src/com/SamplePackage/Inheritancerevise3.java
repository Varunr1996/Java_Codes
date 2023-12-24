package com.SamplePackage;

public class Inheritancerevise3 extends Inheritancerevise2 {
	
	private void foodchain5() {
		System.out.println("goat");
		
	}
	private void foodchain6() {
		System.out.println("human");
		
	}
	public static void main(String[] args) {
		Inheritancerevise3 c = new Inheritancerevise3();
		c.foodchain1();
		c.foodchain2();
		c.foodchain3();
		c.foodchain4();
		c.foodchain5();
		c.foodchain6();
	}

}
