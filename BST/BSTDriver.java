package org.neeraj.dataStructures.BST;

import java.util.Scanner;

public class BSTDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		BinarySearchTree bst=new BinarySearchTree();
		
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("Driver Menu:-");
			System.out.println("1. Insert");
			System.out.println("2. Display");
			System.out.println("3. Search");
			System.out.println("4. Delete");
			System.out.println("5. Mirror Image");
			System.out.println("6. Breadth-First Traversal");
			System.out.println("7. Height of Tree");
			System.out.println("8. Display Leaf Nodes");
			System.out.println("-----------------------------");
			System.out.println("Enter Choice :- ");
			switch(sc.nextInt()) {
				case 1:
						System.out.println("Enter element to insert :- ");
						bst.insert(sc.nextInt());
					break;
				case 2:
						bst.display();
					break;
				case 3:
						System.out.println("Enter element to search :- ");
						System.out.println(bst.search(sc.nextInt()));
					break;
				case 4:
						System.out.println("Enter element to delete :- ");
						bst.deletenode(sc.nextInt());
					break;
				case 5:					
						bst.mirror();
					break;
				case 6:
						bst.BFT();
					break;
				case 7:
						bst.height();
					break;
				case 8:
						bst.leafnodes();
					break;	
				default:
					System.out.println("invalid case");
					break;
				
			}	
			System.out.println("Press 0 to exit");
			if(sc.nextInt()==0)
				System.exit(1);
		}
	
	}

}
