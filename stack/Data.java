package org.neeraj.dataStructures.stack;

import java.util.Scanner;

public class Data {
	
	String name ;
	int id,sal;
	Scanner sc;
	
	public void putdata() {
		sc=new Scanner(System.in);
		System.out.println("Enter data :- ");
		System.out.println("Enter id :- ");
		this.id=sc.nextInt();
		System.out.println("Enter name :- ");
		this.name=sc.next();
		System.out.println("Enter salary :- ");
		this.sal=sc.nextInt();
		
		return;
	}
	
	public void getdata() {
		
		System.out.println("data :- ");
		System.out.println("Enter id :- " + this.id);
		System.out.println("Enter name :- " + this.name);
		System.out.println("Enter salary :- " + this.sal);
		
		return;
	}
	
	
}