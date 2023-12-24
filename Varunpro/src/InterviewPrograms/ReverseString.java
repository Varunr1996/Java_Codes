package InterviewPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {
	
	public void usingBuffer() {
//		Using StringBuffer
		 String given = "Agni";
		 StringBuffer buffer = new StringBuffer();
		 buffer.append(given);
		 System.out.println(buffer.reverse());
		
	}
	
	public void usingOurOwn() {
//		Using Our Own Way
		String given = "Agni";
		char[] characterarray = given.toCharArray();
		String reversed = "";
		for(int i = characterarray.length-1; i>=0; i--) {
			reversed=reversed+characterarray[i];
		}
		System.out.println(reversed);
	}
		public void usingCollections() {
//			Using Collections
			String given = "Agni";
			char[] array = given.toCharArray();
			List<Character> list = new ArrayList<Character>();
			for (Character character : array) {
				list.add(character);
				
			}
			Collections.reverse(list);
			ListIterator iterator = list.listIterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}

	public static void main(String[] args) {
		ReverseString as = new ReverseString();
		as.usingCollections();
		

	}		
}
