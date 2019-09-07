import java.util.*;
import java.util.LinkedList;
public class TreeUse {
	
	public static TreeNode<Integer> takeinput(Scanner in)
	{
		
		int n;
		System.out.println("Enter next node data: ");
		n=in.nextInt();
		TreeNode<Integer> root=new TreeNode<Integer>(n);
		System.out.println("Enter the children of " +n+" : ");
		int child=in.nextInt();
		for(int i=0;i<child;i++)
		{
			TreeNode<Integer> children=takeinput(in);
			root.children.add(children);
		}
		return root;
		
	}
	
	public static void print(TreeNode<Integer> root)
	{
		String s=root.data+":";
		for(int i=0;i<root.children.size();i++)
		{
			s=s+root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++)
		{
			print(root.children.get(i));
		}
	}
	
	public static int numNode(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int count=1;
		for(int i=0;i<root.children.size();i++)
		{
			count+=numNode(root.children.get(i));
		}
		return count;
	}
	
	public static int max(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int l1=root.data;
		//int a[]=new int[root.children.size()];
		for(int i=0;i<root.children.size();i++)
		{
			int childLargest=max(root.children.get(i));
			if(childLargest>l1)
			{
				l1=childLargest;
			}
			
		}
		/*int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		int max1=Math.max(l1, max);*/
		return l1;
		
	}
	
	public static int height(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.children.size()==0)
		{
			return 1;
		}
		
		int max=0;
		for(int i=0;i<root.children.size();i++)
		{
			int small=height(root.children.get(i));
			if(max<small)
			{
				max=small;
			}
		}
		
		return max+1;
	}
	
	public static void depthNodes(TreeNode<Integer> root, int k)
	{
		if(k<0)
		{
			return;
		}
		if(k==0)
		{
			System.out.print(root.data+" ");
			return;
		}
		//String s="";
		for(int i=0;i<root.children.size();i++)
		{
			depthNodes(root.children.get(i), k-1);
		}
		
	}
	
	public static void printpreorder(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		
			System.out.print(root.data+" ");
		
		
		for(int i=0;i<root.children.size();i++)
		{
			printpreorder(root.children.get(i));
		}
	}
	public static TreeNode<Integer> takeinputlevelwise()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter root data: ");
        int rootdata=in.nextInt();
        QueueUsingLL<TreeNode<Integer>> pendingnodes=new QueueUsingLL<>();
        TreeNode<Integer> root=new TreeNode<Integer>(rootdata);
        pendingnodes.enqueue(root);
        while(!pendingnodes.isEmpty())
        {
        	try {
				TreeNode<Integer> frontNode=pendingnodes.dequeue();
				System.out.println("Enter num of children"+ frontNode.data);
				int childCount=in.nextInt();
				for(int i=0;i<childCount;i++)
				{
					System.out.println("Enter "+(i+1)+"children of"+frontNode.data);
					int child=in.nextInt();
					TreeNode<Integer> childNode=new TreeNode<Integer>(child);
					frontNode.children.add(childNode);
					pendingnodes.enqueue(childNode);
				}
			} catch (QueueEmptyException e) {
				return null;
			}
            
        }
        return root;
		
	}
	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		TreeNode<Integer> root=takeinput(in);
		//print(root);
		printpreorder(root);
		//Queue<TreeNode<Integer>> q=new LinkedList<>();
		
	}

}
