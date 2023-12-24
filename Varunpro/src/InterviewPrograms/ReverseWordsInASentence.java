package InterviewPrograms;

public class ReverseWordsInASentence {

	public static void main(String[] args) {
		// input - i love agni
//        output- agni love i
		
		String given = "I Love Agni";
		String rev = "";
	    String [] temp = given.split(" ");
	    System.out.println(temp.length);
	    System.out.println(temp[0]);
	    System.out.println(temp[1]);
	    System.out.println(temp[2]);
	    for(int i=temp.length-1; i>=0; i--) {
	    	rev = rev + temp[i] + " ";
	    	
	    }
	    System.out.println(rev);

	}

}
