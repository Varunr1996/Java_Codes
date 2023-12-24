package InterviewPrograms;

import java.util.Scanner;

public class FindMyPosition {

	public static void main(String[] args) {
		// To find the position of the given English alphabet

        //		ASCII--> 97-a, 65-A

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your chararcter: ");
		char givenchar = scanner.next().charAt(0);
		givenchar = Character.toLowerCase(givenchar);
		int asciiValue = (int)givenchar;
		System.out.println(asciiValue);
		int position = asciiValue-96;
		System.out.println(position);
		
		
	}

}
