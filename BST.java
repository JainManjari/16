
public class BST {
	
	private BinaryTree<Integer> root;
	
	public void insert(int data)
	{
		root=i(root,data);
	}
	
	public BinaryTree<Integer> i(BinaryTree<Integer> root,int data)
	{
		if(root==null)
		{
			BinaryTree<Integer> r=new BinaryTree<Integer>(data);
			return r;
		}
		if(data<root.data)
		{
			root.left=i(root.left,data);
		}
		
		else
		{
			root.right=i(root.right,data);
		}
		return root;
	}
	public void delete(int data)
	{
		root=d(root,data);
	}
	
	public BinaryTree<Integer> d(BinaryTree<Integer> root,int data)
	{
		if(root==null)
		{
			return root;
		}
		if(root.data==data)
		{
			if(root.left==null && root.right==null)
			{
				return null;
			}
			if(root.left==null)
			{
				return root.right;
			}
			if(root.right==null)
			{
				return root.left;
			}
			else
			{
				int c=min(root.right);
				BinaryTree<Integer> r=new BinaryTree<>(c);
				r.right=d(root.right,c);
				r.left=root.left;
				return r;
				
			}
		}
		if(root.data<data)
		{
			root.right=d(root.right,data);
		}
		else
		{
		root.left=d(root.left,data);
		}
		return root;
		
		
	}
	
	public int min(BinaryTree<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		return Math.min(root.data, Math.min(min(root.left), min(root.right)));
		
	}
	public boolean check(int data)
	{
		return c(root,data);
	}
	
	private boolean c(BinaryTree<Integer> root,int data)
	{
		if(root==null)
		{
			return false;
		}
		if(root.data==data)
		{
			return true;
		}
		if(data<root.data)
		{
			return c(root.left,data);
		}
		return c(root.right,data);
	}

}
