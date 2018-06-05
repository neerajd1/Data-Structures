package org.neeraj.dataStructures.linkedList;

public class DLL extends LinkedList implements Operations{

	@Override
	public void append() {
		// TODO Auto-generated method stub
		if(head!=null) {
			Node temp,temp1;
			temp=head;
			temp1=head;
			while(temp.next!=null) {

				temp.data.getdata();
				temp1=temp;
				temp=temp.next;
				
				
			}
			temp.setnext(new Node());
			temp1=temp;
			temp=temp.next;
			temp.setprev(temp1);
			System.out.println("Node temp");
			
			temp.data.getdata();
		}
		else {
			head=new Node();
			/*head.setnext(null);
			head.setprev(null);*/
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
			head.prev=temp;
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
			Node temp=head;
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
			head.prev=null;
			temp.destroy();
		}
		else
			System.out.println("Nothing to remove");
	}


	@Override
	public void revert() {
		// TODO Auto-generated method stub
		
		System.out.println("There is actually no need to revert ");
		System.out.println("You can parse the linked list in reverse");
		System.out.println("This is beauty of Doubly Linked List");
		if(head!=null) {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			while(temp!=null) {
				temp.data.getdata();
				temp=temp.prev;
			}
		}
		else
			System.out.println("Empty Linked List");
		
	}
}
