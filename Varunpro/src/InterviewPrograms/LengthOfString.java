package InterviewPrograms;

public class LengthOfString {
	
	public static void main(String[] args) {
		
		String given = "VarunRadhakrishnan";
		System.out.println(given.length());
		
		char [] characterarray=given.toCharArray();
		int length=0;
		for (char c : characterarray) {
			
			length++;
			
		}
		
		System.out.println(length);
		
	}

}
