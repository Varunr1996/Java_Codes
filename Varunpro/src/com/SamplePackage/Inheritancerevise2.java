package com.SamplePackage;

public class Inheritancerevise2 extends Inheritancerevise {
	
	protected void foodchain3() {
		System.out.println("carrot");
		
	}
	protected void foodchain4() {
		System.out.println("cow");
		
	}
	public static void main(String[] args) {
		Inheritancerevise2 b = new Inheritancerevise2();
		b.foodchain1();
		b.foodchain2();
		b.foodchain3();
		b.foodchain4();
	}

}
