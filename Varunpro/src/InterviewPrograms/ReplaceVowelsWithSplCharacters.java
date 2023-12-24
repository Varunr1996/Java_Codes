package InterviewPrograms;

public class ReplaceVowelsWithSplCharacters {
	
	public void UsingIteration() {
		
		String giventext ="I miss you Mahindra Singh Dhoni ";
		char[] chararray = giventext.toCharArray();
		for(int i=0;i<giventext.length();i++) {
			if(giventext.charAt(i)=='A' || giventext.charAt(i)=='E' || giventext.charAt(i)=='I' || giventext.charAt(i)=='O'||
					giventext.charAt(i)=='U' || giventext.charAt(i)=='a' || giventext.charAt(i)=='e' || giventext.charAt(i)=='i'
					|| giventext.charAt(i)=='o' || giventext.charAt(i)=='u')
				chararray[i]='*';
		}
		for(int i =0;i<giventext.length();i++) {
			System.out.print(chararray[i]);
		}
		
	}
	public void UsingRegularExpression() {
		String giventext = "I Miss You Mahi";
		String replacedtext = giventext.replaceAll("[AEIOUaeiou]", "*");
//		if using $ we must use it as \\$
//		String replacedtext = giventext.replaceAll("[AEIOUaeiou]", "\\$");
		System.out.println(replacedtext);
		
	}
	
	

	public static void main(String[] args) {
		ReplaceVowelsWithSplCharacters replace = new ReplaceVowelsWithSplCharacters();
//		replace.UsingIteration();
		replace.UsingRegularExpression();

	}

}
