package com.SamplePackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetModel {
	
	public static void main (String[] args) {
		
		Set<String> Set = new HashSet<>();
		
		System.out.println(Set);
		
		Set.add("varun");
		Set.add("adam");
		Set.add("ankit");
		Set.add("rahul");
		Set.add("vikas");
		Set.add("luke");
		
		System.out.println(Set);
		boolean remove = Set.remove("varun");
		System.out.println(remove);
		System.out.println(Set);
		
		System.out.println("****************");
		
		List<String> list = new ArrayList();
		list.add("praveen");
		System.out.println("List : "+list);
		list.addAll(Set);
		System.out.println("List Addall : "+list);
		Set.add("Gowtham");
		System.out.println("Set All : " +Set);
		System.out.println("*******************");
		
		list.removeAll(Set);
		System.out.println("Remove All : " +list);
		System.out.println(Set);
		System.out.println("**********************");
		Iterator<String> i = Set.iterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		
		
	}

}
