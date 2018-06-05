package org.neeraj.dataStructures.queue;

public class CircularQueue {
	
	Data data[];
	int front, rear, max;
	
	CircularQueue(){
	
		max=20;
		data=new Data[20];
		front=0;
		rear=0;
	
	}
	
	void enqueue() {
		
		if(front==(rear+1)%max) {
		
			System.out.println("Queue Full");
			return;
		
		}
	
		else {
		
			rear=(rear+1)%max;
			data[rear]=new Data();
			data[rear].putdata();
		
		}
	
	}
	
	void dequeue() {
		
		if(front==rear) {
	
			System.out.println("Queue Empty");
		
		}
		
		else {
		
			front=(front+1)%max;
			data[front].getdata();
			data[front]=null;
			
		}
	
	}

}
