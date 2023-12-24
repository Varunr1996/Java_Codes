package InterviewPrograms;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int given = 0;
		int reverse = 0;
		System.out.println("Enter your number: ");
		Scanner scanner = new Scanner(System.in);
		given= scanner.nextInt();
		
		while(given !=0) {
		reverse = reverse*10;
		reverse = reverse+given%10;
		given = given/10;
		
	}
		System.out.println(reverse);
	}
}
