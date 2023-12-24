package com.SamplePackage;

public class ForLoopConcept {
public static void main(String[] args) {
	for (int i=3;i>=1;i--) {
		for (int j=3;j>=i;j--) {
	   System.out.print("*");
		}
		System.out.println();
	}
}
}
/*
i=3,true,
j=3,true=j=3,3-1
j=2,true=j=2,2-1
j=1,true=j=1,1-1
j=0,false;
printi=3,3-1
i=2,true
j=3,true=j=3,3-1
j=2,true=j=2,2-1
j=1,true=j=1,1-1
j=0,false;

*/