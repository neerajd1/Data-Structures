package org.neeraj.dataStructures.stack;

public class Stack implements StackOperations{
	
	Data array[]=new Data[10];
	int index,length,max;
	
	Stack(){		
		length=-1;
		max=20;
	}

	@Override
	public void push() {
		// TODO Auto-generated method stub
		
		if(length==max) {
			System.out.println("Can't push");
		}
		else {
			length++;
			array[length]=new Data();
			array[length].putdata();
			
		}		
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if(length==-1){
			return null;
		}
		Data data = new Data();
		data=array[length];
		data.getdata();
		array[length]=null;
		length--;
		return data;
	}	
}
