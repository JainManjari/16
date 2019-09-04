package codingninja1;

public class dynamicarray {

	int data[];
	int nextindex;
	
	dynamicarray()
	{
		data=new int[5];
		nextindex=0;
	}
	
	public int size()
	{
		return nextindex;
	}
	
	public void add(int d)
	{
		if(nextindex==data.length)
		{
		    reconstructure();	
		}
		data[nextindex]=d;
		nextindex++;
	}
	
	private void reconstructure()
	{
		int temp[]=data;
		data=new int[data.length*2];
		for(int i=0;i<temp.length;i++)
		{
			data[i]=temp[i];
		}
	}
	
	public void set(int p, int d)
	{
		if(p>nextindex)
		{
			return;
		}
		else if(p<nextindex)
		{
			data[p]=d;
		}
		else
		{
			add(d);
		}
	}
	
	public int get(int g)
	{
		if(g>=nextindex)
		{
		      return -1;
		}
		else
		{
			return data[g];
		}
	}
	
	public boolean isEmpty()
	{
		if(size()==0)
			return true;
		else
			return false;
	}
	
	public int removelast()
	{
		if(isEmpty())
		{
			return -1;
		}
		int value= data[nextindex-1];
		data[nextindex-1]=0;
		nextindex--;
		return value;
		
	}
}
