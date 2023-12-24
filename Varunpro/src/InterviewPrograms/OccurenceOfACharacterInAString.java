package InterviewPrograms;

public class OccurenceOfACharacterInAString {
//	using iterations
	
	public void UsingIteration() {
		String input = "Agniprasath";
		char toFind = 'a';
		int occurence = 0;
		input = input.toLowerCase();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==toFind) {
				occurence=occurence+1;
			}
		}
		System.out.println(toFind+" is present "+occurence+" number of times");
	}
	
	public void WithoutIteration() {
		String input ="Agniprasath";
		char toFind ='a';
		input=input.toUpperCase();
		String chartofind = Character.toString(toFind).toUpperCase();
		int actuallength=input.length();
		System.out.println(actuallength);
		input=input.replace(chartofind, "");
		int lengthafterreplacing = input.length();
		System.out.println(lengthafterreplacing);
		System.out.println(actuallength-lengthafterreplacing);
	}

	public static void main(String[] args) {
		OccurenceOfACharacterInAString occ = new OccurenceOfACharacterInAString();
//		occ.UsingIteration();
		occ.WithoutIteration();
		
	}

}
