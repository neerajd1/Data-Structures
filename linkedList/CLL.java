package org.neeraj.dataStructures.linkedList;

import java.util.Stack;

import org.neeraj.dataStructures.linkedList.LinkedList.Node;

public class CLL extends LinkedList implements Operations{

	@Override
	public void append() {
		// TODO Auto-generated method stub
		if(head!=null) {
			Node temp;
			temp=head;
			while(temp.next!=head) {

				temp.data.getdata();
				temp=temp.next;
				
			}
			temp.setnext(new Node());
			temp=temp.next;
			temp.setnext(head);
			System.out.println("Node temp");
			
			temp.data.getdata();
		}
		else {
			head=new Node();
			head.setnext(head);
			head.data.getdata();
		}
		System.out.println("Appended Successfully");
	}

	@Override
	public void insertbegin() {
		// TODO Auto-generated method stub
		if(head!=null) {
			Node temp=new Node(),temp1=head;
			temp.next=head;
			while(temp1.next!=head)
				temp1=temp1.next;
			head=temp;
			temp1.next=head;
		}
		else {
			head=new Node();
			head.setnext(head);
		}
		System.out.println("Inserted successfully");
	}

		@Override
	public void parseLinkedList() {
		// TODO Auto-generated method stub
		System.out.println("Entered Parse Method");
		if(head!=null) {
			Node temp;
			temp=head;
			 do{
				temp.data.getdata();
				temp=temp.next;
			}while(temp!=head);
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
			while(temp.next!=head) {
				//if(temp.next!=null)
				temp1=temp;
				temp=temp.next;
			}
			if(temp1.next==temp && temp.next==head) {
				temp1.next=head;
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
			Node temp,temp1;
			temp=head;
			temp1=head;
			while(temp1.next!=head)
				temp1=temp1.next;
			head=head.next;			
			temp1.next=head;
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
			do {
				stack.push(temp);
				Node temp1=temp;
				temp=temp.next;
				temp1.next=null;
			}while(temp!=head);
			head=stack.pop();
			//head.setnext(stack.peek());
			temp=head;
			while(!stack.isEmpty()) {
				temp.next=stack.pop();
				if(head.next==null)
					head.next=temp;
				temp=temp.next;
			}
			temp.next=head;
			parseLinkedList();
		}
		else
			System.out.println("Empty Linked List");
		
		
	}

}
