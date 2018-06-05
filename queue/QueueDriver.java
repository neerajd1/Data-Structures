package org.neeraj.dataStructures.queue;

import java.util.Scanner;

public class QueueDriver {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Queue q1=new Queue();
		CircularQueue q2=new CircularQueue();
		PriorityQueue q3=new PriorityQueue();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("Driver Menu:-");
			System.out.println("1. Normal Queue");
			System.out.println("2. Circular Queue");
			System.out.println("3. Priority Queue");
			System.out.println("-----------------------------");
			System.out.println("Enter Choice :- ");
			switch(sc.nextInt()) {
				case 1:
					while(true) {
						System.out.println("-----------------------------");
						System.out.println("Normal Queue Menu:-");
						System.out.println("1.Enqueue");
						System.out.println("2.Dequeue");
						System.out.println("-----------------------------");
						System.out.println("Enter Choice :- ");
						switch(sc.nextInt()) {
							case 1:
								q1.enqueue();
								break;
							case 2:
								q1.dequeue();
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
						System.out.println("Circular Queue Menu:-");
						System.out.println("1.Enqueue");
						System.out.println("2.Dequeue");
						System.out.println("-----------------------------");
						System.out.println("Enter Choice :- ");
						switch(sc.nextInt()) {
							case 1:
								q2.enqueue();
								break;
							case 2:
								q2.dequeue();
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
						System.out.println("Priority Queue Menu:-");
						System.out.println("1.Enqueue");
						System.out.println("2.Dequeue");
						System.out.println("-----------------------------");
						System.out.println("Enter Choice :- ");
						switch(sc.nextInt()) {
							case 1:
								q3.enqueue();
								break;
							case 2:
								q3.dequeue();
								break;
							
							default:
								break;
						
						}
						System.out.println("Press 0 to exit");
						if(sc.nextInt()==0)
							break;
					}
					break;
					
					default:
						System.out.println("Invalid");
						break;
				
			}	
			System.out.println("Press 0 to exit");
			if(sc.nextInt()==0)
				System.exit(1);
		}

	}

}
