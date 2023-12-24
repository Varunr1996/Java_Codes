package com.SamplePackage;

public class SampleClass {
	
	public void add() {

		int num;  //declaration
		int number1 = 10; //initialization
		int number2 = 20;
		int c = number1 + number2;
		System.out.println(" Addition value " +c);
	}
	public void mul() {
		int num;
		int number1 = 10;
		int number2 = 20;
		int c = number1 * number2;
		System.out.println(" Multiplication value " +c);
	}
	public void sub() {
		int num;
		int number1 = 40;
		int number2 = 20;
		int c = number1 - number2;
		System.out.println(" Subtraction value " +c);
		
	}
	public void div() {
		int num;
		int number1 = 40;
		int number2 = 20;
		int c = number1 / number2;
		System.out.println(" Division value " +c);
	}

	public static void main(String[] args) {
		SampleClass obj= new SampleClass();
		obj.add();
		obj.mul();
		obj.sub();
		obj.div();

	}

}
