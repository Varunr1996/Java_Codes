package com.SamplePackage;

public class UsingSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Varun R";
		String[] split = name.split("");
		//name.split("")==> "V", "a", "r", "u", "n", " ", "R";
		//name.split(" ")==>"Varun", "R";
		System.out.println(split.length);
		for(int i=0 ; i<=split.length-1 ; i++ ) {
			System.out.print(split[i]);
		}

	}

}
