
 class Node 
	{
		//creating a node
		   Node leftpointer;
		   Node rightpointer;
		   int data;
		   //constructor
		   Node(int data)
		   {
		      this.data=data;
		      this.leftpointer=null;
		      this.rightpointer=null;
		   }
	}
		class BST
		{
		   Node root=null;
		   void insertNode(int data)
		   {
		      if(root == null)
		      {
		         root = new Node(data);
		         return;
		      }
		      Node tempRoot = root;
		      Node prev = null;
		      
		      while(tempRoot != null)
		      {
		         if(data == tempRoot.data)
		         {
		            return;
		         }
		         else if(data < tempRoot.data)
		         {
		           //traverse in the right side
		        	 prev = tempRoot;
		            tempRoot = tempRoot.leftpointer;
		         }
		         else if(data> tempRoot.data)
		         {
		            prev = tempRoot;
		            tempRoot=tempRoot.rightpointer;
		         }
		      }
		      if(data < prev.data)
		    	  prev.leftpointer = new Node(data);
		      else
		    	  prev.rightpointer = new Node(data);
		   }
		}
		
		public class BinarySearch
		 {         
		   public static void main(String[] args) 
		   {
		      BST t1=new BST();
		      t1.insertNode(10);
		       t1.insertNode(20);      
		   }
		}
