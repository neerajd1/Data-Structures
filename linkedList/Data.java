package org.neeraj.dataStructures.linkedList;

import java.util.*;

public class Data {
	
	String name;
	int number;
	Scanner sc=new Scanner(System.in);
	
	Data(){

		this.putdata();
	
	}
	
	public void getdata() {
		
		System.out.println("Name :- "+ this.name);
		System.out.println("Contact :- "+ this.number);

	}
	
	public void putdata() {
	
		System.out.println("Enter name :- ");
		this.name=sc.nextLine();
		System.out.println("Enter number :- ");
		this.number=sc.nextInt();
	
	}

}
