/**
 * 
 */
package org.neeraj.dataStructures.linkedList;

/**
 * @author neeraj
 *
 */
public interface Operations {
	
	public void append();//add at end.
	public void insertbegin();//add after loc.
	public void parseLinkedList();//it will display complete linked list.
	public void removelast();//it will remove data.
	public void removehead();//remove the data after loc.
	public void revert();
	
	//Here loc stands for no of elements but not the location of the element
}
