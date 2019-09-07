public class Solution {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	
	public static void mirror(BinaryTreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
        if(root==null)
        {
            return;
        }
        //BinaryTreeNode<Integer> root1=root;
        mirror(root.left);
        mirror(root.right);
        BinaryTreeNode<Integer> temp=root.left;
        root.left=root.right;
        root.right=temp;
       
	}

        public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root=new BinaryTree<>(1);
		BinaryTree<Integer> node1=new BinaryTree<>(2);
		BinaryTree<Integer> node2=new BinaryTree<>(3);
		root.left=node1;
		root.right=node2;
		Scanner in=new Scanner(System.in);

		
		

	}
	
}