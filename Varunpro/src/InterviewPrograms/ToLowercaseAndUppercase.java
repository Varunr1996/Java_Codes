package InterviewPrograms;

public class ToLowercaseAndUppercase {
	public static void main(String[] args) {
		// ASCII UPPERCASE-65-90   LOWERCASE-97-122  A-65  a-97-----97-65=32		
		String input = "HELLO, I AM VARUN";
		char[] chararray = input.toCharArray();
		for(int i=0; i<input.length(); i++) {
			if(chararray[i]>=65 && chararray[i]<=90) {
				chararray[i]= (char) (chararray[i]+32);
			}
		}
		for(int i=0;i<input.length();i++) {
			System.out.print(chararray[i]);
		}
        // to upper case
		System.out.println();
		String given = "i am varun";
		char[] givenarray=given.toCharArray();
		for (int i=0; i<given.length(); i++) {
			if(givenarray[i]>=97 && givenarray[i]<=122) {
				givenarray[i] = (char) (givenarray[i]-32);
			}
		}
		for(int i=0; i<given.length(); i++) {
			System.out.print(givenarray[i]);
		}
	}
}