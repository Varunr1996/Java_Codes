package com.SamplePackage;

public class Abstract_B extends Abstract_A {
	
	void otp() {
		
		System.out.println("enter your phone number");
		System.out.println("enter 6 digit otp");
		
	}
	private void success() {
		
		System.out.println("login successfull");
		
	}
	public static void main (String[] args) {
		Abstract_B b = new Abstract_B();
		b.signin();
		b.otp();
		b.success();
	}

}
