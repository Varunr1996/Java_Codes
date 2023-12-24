package InterviewPrograms;

import java.util.stream.IntStream;

public class ArrayContainsElementOrNot {
	
	int[] array = {1,2,3,4,5,3,3};
	int numbertofind = 31;
	boolean found = false;
	
	public void presentornot(){
		for (int number : array) {
			if (number == numbertofind) {
				found=true;
				break;
			}
				
			}
		if(found) {
			System.out.println("Number Present");
		}else {
			System.out.println("Number not Present");
		}
			
		} 
	
//	Using IntStream
	public void UsingIntStream() {
		boolean found = IntStream.of(array).anyMatch(element->element==numbertofind);
		if(found) 
			System.out.println("Number present");
			else
				System.out.println("Number not present");
		}
			
	
	

	public static void main(String[] args) {
		ArrayContainsElementOrNot presentornot = new ArrayContainsElementOrNot();
//		presentornot.presentornot();
		presentornot.UsingIntStream();
		

	}

}
