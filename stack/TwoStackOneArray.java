package org.neeraj.dataStructures.stack;

import java.util.Scanner;

public class TwoStackOneArray implements StackOperations{
	
	Data array[]=new Data[20];
	Scanner sc;
	int length1,length2,max,choice;

	public TwoStackOneArray() {
		// TODO Auto-generated constructor stub
		max=19;
		length1=-1;
		length2=max+1;
		sc=new Scanner(System.in);
	}
	
	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		int caseint=0;
		Data data = new Data();
		System.out.println("Select Stack  1 or 2 :- ");
		caseint=sc.nextInt();
		switch(caseint) {
		case 1:
			if(length1==-1){
				return null;
			}
			
			data=array[length1];
			data.getdata();
			array[length1]=null;
			length1--;
			return data;
		case 2:
			if(length2==max+1){
				return null;
			}
			data=array[length2];
			data.getdata();
			array[length2]=null;
			length2++;
			return data;
		
		}
		return null;
	}

	@Override
	public void push() {
		int caseint=0;
		//Data data = new Data();
		System.out.println("Select Stack  1 or 2 :- ");
		caseint=sc.nextInt();
		if(length2==length1+1){
			return;
		}
		switch(caseint) {
		case 1:
			length1++;
			array[length1]=new Data();
			array[length1].putdata();
			
			break;
		case 2:
			length2--;
			array[length2]=new Data();
			array[length2].putdata();			
			break;
			
		default:
			System.out.println("Invalid case");
			break;
		}
	}

}
