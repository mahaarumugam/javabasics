package com.basic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
public static void main(String[] args) {
	//JDK 1.5
	List<String> listOne=new ArrayList<>();
	listOne.add("String one");
	listOne.add("String two");
	listOne.add("String three");
	String valOne=listOne.get(1);
	System.out.println(valOne);
	add(24.3,34.5);
	add("one","two");
	add(new Car(),new Taxi());
}
	public static <M,S> double add(M m,S s){
		System.out.println(m);
		System.out.println(s);
		return 20.0;
	}
		
}

