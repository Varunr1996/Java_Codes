package InterviewPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class FindingMissingAlphabetInAString {

	public static void main(String[] args) {
		
		String given = "b";
		given = given.toLowerCase();
		given = given.replaceAll(" ", "");
		String[] userarray = given.split("");
		System.out.println(given);
		String[] alphabets = "abcdefghijklmnopqrstuvwxyz".split("");
		HashSet<String> set1 = new HashSet<String>(Arrays.asList(userarray));
//		for (String s : userarray) {
//			set1.add(s);
//			
//		}
		HashSet<String> set2 = new HashSet<String>(Arrays.asList(alphabets));
		set2.removeAll(set1);
		System.out.println(set2);
		

	}

}
