package InterviewPrograms;

public class FindingTheNumberOfVowels {

	public static void main(String[] args) {
		String input = "Agniprasath";
		int vowelscount=0;
		input=input.toLowerCase();
		int length = input.length();
		for(int i=0; i<length; i++) {
			if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' 
					|| input.charAt(i)=='u') {
				
				vowelscount=vowelscount+1;
				
			}
				
		}
		System.out.println("Your name has " +vowelscount+ " vowels");

	}

}
