package org.neeraj.dataStructures.queue;

public class PriorityQueue {
	
	int priority;
	Node front[],rear[],temp;
	
	public PriorityQueue() {
	
		// TODO Auto-generated constructor stub
		front=rear=new Node[3];
		
	}
	
	void enqueue() {
		
		temp=new Node();
		temp.data.putdata();
		
		if(temp.data.sal>50000) {
			
			priority=1;
			
		}
		
		else if(temp.data.sal>20000) {
			
			priority=2;
			
		}
		
		else {
			
			priority=3;
			
		}
		
		if(rear[priority-1]==null  && front[priority-1]==null) {
			
			rear[priority-1]=new Node();
			front[priority-1]=new Node();
			rear[priority-1]=temp;
			front[priority-1]=temp;
		
		}
		
		else {
			
			rear[priority-1].next=temp;
			rear[priority-1]=rear[priority-1].next;
			
		}
	}
	
	void dequeue() {
		
		int notempty=0,index=0;
		
		for (int i=0;i<3;i++) {
			
			if(front[i]!=null) {
				
				notempty=1;
				index=i;
				break;
			
			}
			
		}
		
		if(notempty==1) {
			
			temp=front[index];
			temp.data.getdata();
			temp.destroy();
			front[index]=front[index].next;
		
		}
	
	}

	
	private class Node {
		
		Data data;
		Node next;
		
		Node(){
			
			data=new Data();
			next=null;
			
		}

		public void destroy() {
					
			Runtime.getRuntime().gc();
					
		}
		
	}

}