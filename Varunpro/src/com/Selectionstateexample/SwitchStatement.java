package com.Selectionstateexample;

public class SwitchStatement {

	public static void main(String[] args) {
		int number=40;
		String size;
		switch (number) {
		case 30:
			size="xs";
			break;
		case 32:
			size="small";
			break;
		case 36:
			size="xxl";
			break;
	    default:
	    	size="incorrect size";
				
		}
		System.out.println(size);
		

	}

}
