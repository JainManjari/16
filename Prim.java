import java.util.*;
public class Prim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int e=in.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<e;i++)
		{
			int v1=in.nextInt();
			int v2=in.nextInt();
			int wt=in.nextInt();
			a[v1][v2]=wt;
			a[v2][v1]=wt;
		}
		
		
		
		
	
		

	}
	
	public static void prim(int a[][])
	{
		int n=a.length;
		boolean visit[]=new boolean[n];
		int wt[]=new int[n];
		wt[0]=0;
		for(int i=1;i<n;i++)
		{
			wt[i]=Integer.MAX_VALUE;
		}
		int parent[]=new int[n];
		parent[0]=-1;
		for(int i=0;i<n;i++)
		{
			int vertex=findMin(wt,visit);
			visit[vertex]=true;
			for(int j=0;j<n;j++)
			{
				if(a[vertex][j]!=0 && !visit[j])
				{
					if(a[vertex][j]<wt[j])
					{
						wt[j]=a[vertex][j];
						parent[j]=vertex;
					}
				}
			}
		}
		for(int i=1;i<n;i++)
		{
			if(parent[i]<i)
			{
				System.out.println(parent[i]+" "+i+" "+wt[i]);
			}
			else
			{
				System.out.println(i+" "+parent[i]+" "+wt[i]);
			}
		}
		
		
	}

	private static int findMin(int[] wt,boolean visit[]) {
		// TODO Auto-generated method stub
		int vertex=-1;
		for(int i=0;i<wt.length;i++)
		{
			if(!visit[i] && (vertex==-1 || wt[i]<wt[vertex]))
			{
				vertex=i;
			}
		}
		return vertex;
	}

}
