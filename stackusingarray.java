
public class stackusingarray {

	private int data[];
	private int top;
	
	public stackusingarray()
	{
		data=new int[10];
		top=-1;
	}

	
	public stackusingarray(int capacity)
	{
		data=new int[capacity];
		top=-1;
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
		
	}
	
	public int size()
	{
		return (top+1);
	}
	
	public int top() throws StackEmptyException
	{
		if(isEmpty())
		{
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		return data[top];
	}
	
	public void push(int ele) 
	{
		if(size()==data.length)
		{
			restructure();
		}
		top++;
		data[top]=ele;
	}
	
	public int pop() throws StackEmptyException
	{
		if(isEmpty())
		{
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		
		int c=data[top];
		top--;
		return c;
	}
	
	private void restructure()
	{
		int temp[]=data;
		int a1[]=new int[2*temp.length];
		for(int i=0;i<=top;i++)
		{
			a1[i]=temp[i];
		}
		
	}

}
