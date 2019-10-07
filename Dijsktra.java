import java.util.*;
public class Dijsktra {

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
			int wt=in.nextInt();
			a[fv][sv]=wt;
			a[sv][fv]=wt;
		}
		D(a);

	}
	public static void D(int a[][])
	{
		int n=a.length;
		int dis[]=new int[n];
		dis[0]=0;
		for(int i=1;i<n;i++)
		{
			dis[i]=Integer.MAX_VALUE;
		}
		boolean visit[]=new boolean[n];
		for(int i=0;i<n-1;i++)
		{
			int vertex=minD(dis,visit);
			visit[vertex]=true;
			for(int j=0;j<n;j++)
			{
				if(a[vertex][j]!=0 && !visit[j])
				{
					int curr=dis[vertex]+a[i][j];
					if(dis[j]>curr)
					{
						dis[j]=curr;
					}
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(i+" "+dis[i]);
		}
	}
	
	public static int minD(int dis[],boolean visit[])
	{
		int vertex=-1;
		for(int i=0;i<dis.length;i++)
		{
			if(!visit[i] && (vertex==-1 || dis[i]<dis[vertex]))
			{
				vertex=i;
			}
		}
		return vertex;
	}

}
