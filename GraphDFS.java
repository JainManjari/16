import java.util.*;
import java.util.LinkedList;
public class GraphDFS {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int e=in.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<e;i++)
		{
			int fv=in.nextInt();
			int sv=in.nextInt();
			a[fv][sv]=1;
			a[sv][fv]=1;
		}
		BFS(a);

	}
	
	public static void print(int a[][])
	{
		boolean visit[]=new boolean[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(!visit[i])
			{
				printH(a,i,visit);
			}
		}
	}

	private static void printH(int[][] a, int c, boolean[] visit) {
		// TODO Auto-generated method stub
		System.out.print(c+" ");
		visit[c]=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[c][i]==1 && !visit[i])
			{
				printH(a,i,visit);
			}
				
		}
	}
	
	public static void BFS(int a[][])
	{
		boolean visit[]=new boolean[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(!visit[i])
			{
				BFSH(a,i,visit);
			}
		}
	}
	
	public static void BFSH(int a[][],int c,boolean visit[])
	{
		Queue<Integer> q=new LinkedList<>();
		q.add(c);
		visit[c]=true;
		while(!q.isEmpty())
		{
			int t=q.remove();
			System.out.print(t+" ");
			for(int i=0;i<a.length;i++)
			{
				if(a[c][i]==1 && !visit[i])
				{
					q.add(i);
					visit[i]=true;
				}
			}
		}
		
	}

}
