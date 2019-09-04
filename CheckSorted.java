package codingninja1;
import java.util.*;
public class CheckSorted {
	
	public static boolean CheckSort(int b[])
	{
		if(b.length<=1)
		{
			return true;
		}
		
		int b1[]=new int[b.length-1];
		for(int i=0;i<b.length-1;i++)
		{
			b1[i]=b[i+1];
			//System.out.println(b1[i]+" ");
		}
		boolean c=CheckSort(b1);
		if(!c)
		{
		return false;
		}
	    if(b[0]<=b[1])
	    {
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
	}
	
	public static boolean CheckSort2(int b[])
	{
		if(b.length<=1)
		{
			return true;
		}
		if(b[0]>b[1])
		{
			return false;
		}
		
		int b1[]=new int[b.length-1];
		for(int i=0;i<b.length-1;i++)
		{
			b1[i]=b[i+1];
			//System.out.println(b1[i]+" ");
		}
		
		boolean d=CheckSort2(b1);
		return d;
	}	
	
	public static int sum(int g[])
	{
		int x=g.length;
		if(x<0)
		{
			return 0;
		}
		if(x==1)
		{
			return g[0];
		}
		
		int g1[]=new int[g.length-1];
		for(int i=0;i<g.length-1;i++)
		{
			g1[i]=g[i+1];
			//System.out.println(b1[i]+" ");
		}
		return g[0]+sum(g1);
	}
	
	public static boolean CheckNumber(int h[], int f)
	{
		if(h.length==0)
		{
			return false;
		}
		if(f==h[0])
		{
			return true;
		}
		int h1[]=new int[h.length-1];
		for(int k=0;k<h.length-1;k++)
		{
			h1[k]=h[k+1];
		}
		return CheckNumber(h1,f);
		
	}
	
	public static boolean CheckSort3(int z[], int start)
	{
		if(start==z.length-1)
		{
			return true;
		}
		if(z[start]>z[start+1])
		{
			return false;
		}
		boolean p=CheckSort3(z, start+1);
		return p;
	}
	
	public static int LastIndex(int a[], int last, int f)
	{
		if(last<0)
		{
			return -1;
		}
		if(a[last]==f)
		{
			return last;
		}
		int p=LastIndex(a, last-1, f);
		return p;
	}
	
	public static int FirstIndex(int a[], int start, int f)
	{
		if(start>a.length-1)
		{
			return -1;
		}
		if(a[start]==f)
		{
			return start;
		}
		int p=FirstIndex(a, start+1, f);
		return p;
	}
	static int count=0;
	public static void AllIndexes(int a[], int start, int f)
	{
		if(start>a.length-1)
		{
			//System.out.print(-1+" ");
			return;
		}
		if(a[start]==f)
		{
			//count++;
			System.out.print(start+" ");
		}
		AllIndexes(a, start+1, f);
		//return p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int j=0;j<n;j++)
		{
			a[j]=in.nextInt();
		}
		int k=in.nextInt();
		AllIndexes(a,0,k);
		//int c=FirstIndex(a,0,k);
		//System.out.print(c+" ");
		//int q=LastIndex(a,n-1,k);
		//System.out.print(q+" ");
		//System.out.println(CheckSort2(a));
		//int u=sum(a);
		//int v=in.nextInt();
		//System.out.print(u);
		//System.out.println(CheckNumber(a,v));
		//System.out.println(CheckSort3(a,0));
		

	}

}
