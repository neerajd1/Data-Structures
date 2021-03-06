package org.neeraj.dataStructures.linkedList;
import java.util.*;


public class SLL extends LinkedList implements Operations{

	@Override
	public void append() {
		// TODO Auto-generated method stub
		if(head!=null) {
			Node temp;
			temp=head;
			while(temp.next!=null) {

				temp.data.getdata();
				temp=temp.next;
				
			}
			temp.setnext(new Node());
			System.out.println("Node temp");
			
			temp.data.getdata();
		}
		else {
			head=new Node();
			//head.setnext(null);
			head.data.getdata();
		}
		System.out.println("Appended Successfully");
	}

	@Override
	public void insertbegin() {
		// TODO Auto-generated method stub
		if(head!=null) {
			Node temp=new Node();
			temp.next=head;
			head=temp;
		}
		else
			head=new Node();
		
		System.out.println("Inserted successfully");
	}

		@Override
	public void parseLinkedList() {
		// TODO Auto-generated method stub
		System.out.println("Entered Parse Method");
		if(head!=null) {
			Node temp;
			temp=head;
			while(temp!=null) {
				temp.data.getdata();
				temp=temp.next;
			}
		}
		else
			System.out.println("Empty Linked List");
		
	}

	@Override
	public void removelast() {
		// TODO Auto-generated method stub
		if(head!=null) {
			Node temp;
			Node temp1=head;
			temp=head;
			while(temp.next!=null) {
				//if(temp.next!=null)
				temp1=temp;
				temp=temp.next;
			}
			if(temp1.next==temp && temp.next==null) {
				temp1.next=null;
				temp.destroy();
			}
		}
		else
			System.out.println("Nothing to remove");
		
	}

	@Override
	public void removehead() {
		// TODO Auto-generated method stub
		if(head!=null) {
			Node temp;
			temp=head;
			head=head.next;
			temp.destroy();
		}
		else
			System.out.println("Nothing to remove");
		
	}

	
	@Override
	public void revert() {
		// TODO Auto-generated method stub
		
		if(head!=null) {

			Node temp=head;
			Stack<Node> stack=new Stack<>();
			parseLinkedList();
			while(temp!=null) {
				stack.push(temp);
				Node temp1=temp;
				temp=temp.next;
				temp1.next=null;
			}
			head=stack.pop();
			//head.setnext(stack.peek());
			temp=head;
			while(!stack.isEmpty()) {
				temp.next=stack.pop();
				if(head.next==null)
					head.next=temp;
				temp=temp.next;
			}
			parseLinkedList();
		}
		else
			System.out.println("Empty Linked List");
		
		
	}

}
