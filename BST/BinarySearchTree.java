package org.neeraj.dataStructures.BST;


public class BinarySearchTree implements BSToperations{
	
	class TreeNode{
		
		int data;
		TreeNode left,right;
		
		void Treenode(){

			left=null;
			right=null;
		
		}
	}
	
	TreeNode root;
	
	class queue{
		
		class node{
			
			TreeNode tn;
			node next;
			
			node(){
				
				next=null;
			}
			
		}
		
		
		
		node front, rear;
		queue(){
			
			front=rear=null;
		}
		
		void enqueue(TreeNode tn) {
			
			node t=new node();
			t.tn=tn;
			
			if(rear==null) {
				
				rear=t;
				front=rear;
				
			}else {
				
				rear.next=t;
				rear=t;
			}
		}
		
		TreeNode dequeue() {
			TreeNode p;
			node q;
			q=front;
			p=q.tn;
			if(front == rear)
				front=rear=null;
			else
				front= front.next;
			q=null;
			return p;
		}
		
		private int isEmpty() {
			
			if(front == null && rear == null)
				return 1;
			return 0;
		}
		
	}
	
	void BinarySearchTree() {
		
		root=null;
	
	}
	
	void inorder(TreeNode tn) {
		if(tn!=null) {
			inorder(tn.left);
			System.out.println(tn.data);
			inorder(tn.right);
		}
		
	}
	
	void destroy(TreeNode tn) {
		
		if(tn!=null) {
			
			destroy(tn.left);
			destroy(tn.right);
			tn=null;
		
		}
		
	}
	

	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		if(isempty()==0) {
			
			inorder(root);
			
		}
		else 
			System.out.println("Tree empty can't display");
		
	}

	@Override
	public void deletenode(int data) {
		// TODO Auto-generated method stub
	
		int temp=search(data);
		TreeNode  tn,parent,t1;
		
		if(temp==0) {
			
			System.out.println("Data "+ data +" is not present, can't delete.");
			return;
		}
		else {
		
				TreeNode[] tna =searchdel(data);
				parent=tna[0];
				t1=tna[1];
				
				if(t1.left==null && t1.right==null) {
					
					if(t1==root)
						root=null;
					if(t1==parent.left)
						parent.left=null;
					else if(t1==parent.right)
						parent.right=null;
					t1=null;
					
				}
				else if (t1.left==null) {
					
					if(t1==root)
						root=t1.right;
					if(t1==parent.left)
						parent.left=t1.right;
					else if(t1==parent.right)
						parent.right=t1.right;
					t1=null;
					
				}
				else if(t1.right==null) {
					
					if(t1==root)
						root=t1.left;
					if(t1==parent.left)
						parent.left=t1.left;
					else if(t1==parent.right)
						parent.right=t1.left;
					t1=null;
					
				}
				else {
					//TreeNode parent;
					tn=t1.right;
					parent=tn;
					if (tn!=null) {
						
						while(tn.left!=null) {
							
							parent=tn;
							tn=tn.left;
						
						}
						
					}
					
					parent.left=null;
					int tempdata=tn.data;
					tn.data=t1.data;
					t1.data=tempdata;
					//deletenode(data);
					tn=null;
				}
		
		}
	
	}
	
	private TreeNode[] searchdel(int data) {
		
		TreeNode t1=root,parent=root;
		while(t1!=null) {
			
			if(t1.data==data)
				return new TreeNode[] {parent,t1};
			else if(t1.data>data) {
			
				parent=t1;
				t1=t1.left;
			
			}
			else {
		
				parent=t1;
				t1=t1.right;
			
			}
		
		}
		
		return null;
	}
	
	@Override
	public int search(int data) {
		// TODO Auto-generated method stub
		
		TreeNode t1=root;
		while(t1!=null) {
			
			if(t1.data==data)
				return 1;
			else if(t1.data>data)
				t1=t1.left;
			else 
				t1=t1.right;
			
		}
		
		return 0;
	}

	@Override
	public void insert(int data) {
		// TODO Auto-generated method stub
		
		int temp=search(data);
		TreeNode  tn,parent,t1;
		
		if(temp==0) {
			
			tn=new TreeNode();
			tn.data=data;
			t1=root;
			if(root == null) {
				
				root=tn;
				
			}
			else {
				
				parent=t1;
				while(t1!=null) {
					
					parent = t1;
					if(data<t1.data)
						t1=t1.left;
					else
						t1=t1.right;
					
				}
				
				if(data<parent.data)
					parent.left=tn;
				else
					parent.right=tn;
				
			}
			
		}
		else
			System.out.println("Data "+ data +" is present");
		
	}
	
	@Override
	public int isempty() {
		// TODO Auto-generated method stub
		
		if(root==null)
			return 1;
		return 0;
	
	}

	@Override
	public void mirror() {
		// TODO Auto-generated method stub
		
		queue q=new queue();
		TreeNode temp=root,temp1;
		if(temp!=null)
			q.enqueue(temp);
		while(q.isEmpty()!=1) {
			temp=q.dequeue();
			temp1=temp.left;
			temp.left=temp.right;
			temp.right=temp1;
			if(temp.left!=null) {
				q.enqueue(temp.left);
			}
			if(temp.right!=null) {
				q.enqueue(temp.right);
			}
		}
		inorder(root);
		
	}

	@Override
	public void BFT() {
		// TODO Auto-generated method stub
		
		TreeNode ptr;
		queue q=new queue();
		ptr=root;
		q.enqueue(ptr);
		while(q.isEmpty()!=1) {
			
			ptr=q.dequeue();
			System.out.println(ptr.data);
			if(ptr.left!=null) {
				q.enqueue(ptr.left);
			}
			if(ptr.right!=null) {
				q.enqueue(ptr.right);
			}
		}
		
	}

	@Override
	public void height() {
		// TODO Auto-generated method stub
		
		System.out.println(height(root));
		
	}
	
	public int height(TreeNode tn) {
		
		int h1=0,h2=0;
		if(tn==null) return 0;
		else if(tn.right==null && tn.left==null) return 1;
		else{
			h1=height(tn.left);
			h2=height(tn.right);
			return max(h1,h2);
		}
		
	}
	
	int max(int a ,int b) {
		
		if(a>b)
			return a;
		return b;
		
	}

	@Override
	public void leafnodes() {
		// TODO Auto-generated method stub
		
		leafnodes(root);
		
	}
	
	public void leafnodes(TreeNode tn) {
		// TODO Auto-generated method stub
		
		if(tn.left==null&& tn.right==null)
			System.out.println(tn.data);
		else{
			if(tn.left!=null) {
				leafnodes(tn.left);
			}
			if(tn.right!=null) {
				leafnodes(tn.right);
			}
		}
		
	} 

}
