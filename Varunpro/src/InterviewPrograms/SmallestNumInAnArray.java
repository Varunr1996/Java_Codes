package InterviewPrograms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SmallestNumInAnArray {
	
		Integer givenArray[] = {2,1,3,5,4};
		
		public void findsmallest() {
			
		int smallest = Integer.MAX_VALUE;
		for(int i=0; i<givenArray.length; i++) {
			if(givenArray[i]<smallest) {
				smallest=givenArray[i];
			}
		}
			System.out.println("The smallest number is:" +smallest);
		
		}
		
//		Using Arrays 
		public void UsingArrays() {
			Arrays.sort(givenArray);
			System.out.println(givenArray[0]);
		}
		
//	    Using Collections
		public void UsingCollections() {
			List<Integer> list = Arrays.asList(givenArray);
			Collections.sort(list);
			int smallest = list.get(0);
			System.out.println(smallest);
			
		}
	public static void main(String[] args) {
		SmallestNumInAnArray array = new SmallestNumInAnArray();
//		array.findsmallest();
//		array.UsingArrays();
		array.UsingCollections();

	}

}
