package com.SamplePackage;

import java.util.ArrayList;
import java.util.List;

public class CollectionModel {
	
	public static void main (String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		System.out.println(1);
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(10);
		l.add(20);
		
		System.out.println( l );
		int size = l.size();
		System.out.println(size);
		
		Integer get = l.get(2);
		System.out.println(get);
		
		boolean contains = l.contains(30);
		System.out.println(contains);
		
		Integer remove = l.remove(2);
		System.out.println(remove);
		
		System.out.println(l);
		
		l.clear();
		System.out.println(l);
		
		
		
	}

}
