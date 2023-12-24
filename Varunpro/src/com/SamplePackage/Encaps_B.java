package com.SamplePackage;

public class Encaps_B extends Encaps_A{
	public static void main(String[] args) {
		Encaps_B b = new Encaps_B();
		System.out.println(b.getname());
		b.setday("Day-one");
		System.out.println(b.getday());
		}

}
