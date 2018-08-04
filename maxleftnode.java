class Node{
		int data;
		Node left,right;
		Node(int d)
		{
			data=d;
			left=right=null;
		}
	}

public class maxleftnode {
	Node root;	

	public int maxleft(Node root)
	{
		int res=Integer.MIN_VALUE;
		if(root==null)
			return res;
		
		if(root.left!=null)
			return root.left.data;
		
		return Math.max(root.left.data, root.right.data);
	}
	
	public static void main(String[] args) {
		maxleftnode ml=new maxleftnode();
		ml.root=new Node(7);
		ml.root.left=new Node(6);
		ml.root.right=new Node(5);
		ml.root.left.left=new Node(4);
		ml.root.left.right=new Node(3);
		ml.root.right.left=new Node(2);
		ml.root.right.right=new Node(1);
		
		System.out.println(ml.maxleft(ml.root));
	}

}
