package org.neeraj.dataStructures.queue;

public class Queue {
	
	Data data[];
	int front, rear, max;
	
	Queue(){
	
		max=20;
		data=new Data[20];
		front=0;
		rear=0;
	
	}
	
	void enqueue() {
	
		if(rear==max-1) {
		
			System.out.println("Queue Full");
			return;
		
		}
		
		else {
		
			data[rear]=new Data();
			data[rear].putdata();
			rear++;
		
		}
	
	}
	
	void dequeue() {
	
		if(front>rear) {
		
			System.out.println("Queue Empty");
		
		}
		
		else {
		
			data[front].getdata();
			data[front]=null;
			front++;
		
		}
		
	}
	
}
