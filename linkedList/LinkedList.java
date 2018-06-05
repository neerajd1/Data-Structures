package org.neeraj.dataStructures.linkedList;

public class LinkedList {
	Node head;
	int count;
	LinkedList(){
		head=null;
		count=0;
	}
	static class Node{
		Data data;
		Node next,prev;
		Node(){
			data=new Data();
			next=null;
			prev=null;
		}
		public void setnext (Node node) {
			next=node;
		}
		public void setprev(Node node) {
			prev=node;
		}
		
		public void destroy() {
			
			Runtime.getRuntime().gc();
			
			System.out.println("----------------------\nData Deleted :- \n----------------------");
			System.out.println("Data Info :- \n----------------------");
			this.data.getdata();
			System.out.println("----------------------");
			
		}
		
	}

	public int getcount() {
		Node temp;
		temp=head;
		while(temp.next!=null) {
			count++;
		}
		return count;
	}
}
