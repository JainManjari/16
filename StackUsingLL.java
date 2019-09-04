
public class StackUsingLL<T> {

	private Node<T> head;
	private int size;
	//Node<Integer> tail=null;
	
	public StackUsingLL(){
		head=null;
		size=0;
	}
	
	public boolean isEmpty()
	{
		return (head==null);
	}
	
	public int size()
	{
		return size;
	}
	
	public T top() throws StackEmptyException
	{
		if(isEmpty())
		{
			//StackEmptyException e=new StackEmptyException();
			//throw e;
			throw new StackEmptyException();
		}
		else
		{
		return head.data;
		}
	}
	
	public void push(T ele)
	{
		Node<T> newnode=new Node<T>(ele);
		if(isEmpty())
		{
			head=newnode;
		}
		else
		{
		newnode.next=head;
		head=newnode;
		}
		size++;
	}
	
	public T pop() throws StackEmptyException
	{
		if(isEmpty())
		{
			//StackEmptyException e=new StackEmptyException();
			//throw e;
			throw new StackEmptyException();
		}
		//Node<Integer> temp=head;
		else
		{	
		T c=head.data;
		head=head.next;
		size--;
		return c;
		}
	}
}
