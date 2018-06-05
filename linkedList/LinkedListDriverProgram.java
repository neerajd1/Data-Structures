package org.neeraj.dataStructures.linkedList;

import java.util.*;

public class LinkedListDriverProgram {
	static Scanner sc=new Scanner(System.in);
	//static int revertflag=0;
	static char ch;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL sll=new SLL();
		DLL dll = new DLL();
		CLL cll = new CLL();
		
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("Driver Menu:-");
			System.out.println("1.Singly Linked List");
			System.out.println("2.Doubly Linked List");
			System.out.println("3.Circular Linked List");
			System.out.println("-----------------------------");
			System.out.println("Enter Choice :- ");
			switch(sc.nextInt()) {
				case 1:
					while(true) {
						System.out.println("-----------------------------");
						System.out.println("Singly Linked List Menu:-");
						System.out.println("1.Append");
						System.out.println("2.Insert at first");
						System.out.println("3.Remove last");
						System.out.println("4.Remove First");
						System.out.println("5.Display");
						System.out.println("6.Revert Linked List");
						System.out.println("-----------------------------");
						System.out.println("Enter Choice :- ");
						switch(sc.nextInt()) {
							case 1:
								sll.append();
								break;
							case 2:
								sll.insertbegin();
								break;
							case 3:
								sll.removelast();
								break;
							case 4:
								sll.removehead();
								break;
							case 5:
								sll.parseLinkedList();
								break;
							case 6:
								sll.revert();
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
						System.out.println("Doubly Linked List Menu:-");
						System.out.println("1.Append");
						System.out.println("2.Insert at first");
						System.out.println("3.Remove last");
						System.out.println("4.Remove First");
						System.out.println("5.Display");
						System.out.println("6.Revert Linked List");
						System.out.println("-----------------------------");
						System.out.println("Enter Choice :- ");
						switch(sc.nextInt()) {
							case 1:
								dll.append();
								break;
							case 2:
								dll.insertbegin();
								break;
							case 3:
								dll.removelast();
								break;
							case 4:
								dll.removehead();
								break;
							case 5:
								dll.parseLinkedList();
								break;
							case 6:
								dll.revert();
								break;
							default:
								break;
						
						}
						System.out.println("Press 0 to exit");
						if(sc.nextInt()==0)
							break;
					}
					break;
				case 3:
					while(true) {
						System.out.println("-----------------------------");
						System.out.println("Clicular Linked List Menu:-");
						System.out.println("1.Append");
						System.out.println("2.Insert at first");
						System.out.println("3.Remove last");
						System.out.println("4.Remove First");
						System.out.println("5.Display");
						System.out.println("6.Revert Linked List");
						System.out.println("-----------------------------");
						System.out.println("Enter Choice :- ");
						switch(sc.nextInt()) {
							case 1:
								cll.append();
								break;
							case 2:
								cll.insertbegin();
								break;
							case 3:
								cll.removelast();
								break;
							case 4:
								cll.removehead();
								break;
							case 5:
								cll.parseLinkedList();
								break;
							case 6:
								cll.revert();
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
