package org.neeraj.dataStructures.stack;

import java.util.Scanner;

public class StackDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack ss=new Stack();	
		TwoStackOneArray ts=new TwoStackOneArray();
	

		
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("Driver Menu:-");
			System.out.println("1. Normal Stack");
			System.out.println("2. Two Stack one array");
			System.out.println("-----------------------------");
			System.out.println("Enter Choice :- ");
			switch(sc.nextInt()) {
				case 1:
					while(true) {
						System.out.println("-----------------------------");
						System.out.println("Normal Stack Menu:-");
						System.out.println("1.Push");
						System.out.println("2.Pop");
						System.out.println("-----------------------------");
						System.out.println("Enter Choice :- ");
						switch(sc.nextInt()) {
							case 1:
								ss.push();
								break;
							case 2:
								ss.pop();
								break;
							default:
								break;
						
						}
						System.out.println("Press 0 to exit");
						if(sc.nextInt()==0)
							break;
					}
					break;
				case 2:
					while(true) {
						System.out.println("-----------------------------");
						System.out.println("Two Stack one array Menu:-");
						System.out.println("1.Push");
						System.out.println("2.Pop");
						System.out.println("-----------------------------");
						System.out.println("Enter Choice :- ");
						switch(sc.nextInt()) {
							case 1:
								ts.push();
								break;
							case 2:
								ts.pop();
								break;
							
							default:
								break;
						
						}
						System.out.println("Press 0 to exit");
						if(sc.nextInt()==0)
							break;
					}
					break;
				
			}	
			System.out.println("Press 0 to exit");
			if(sc.nextInt()==0)
				System.exit(1);
		}
	
		}
}