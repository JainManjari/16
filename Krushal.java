import java.util.*;

class edge implements Comparable<edge>
{
	int source;
	int destination;
	int weight;
	
	public int compareTo(edge i)
	{
		return this.weight-i.weight;
	}
}
public class Krushal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int e=in.nextInt();
		edge a[]=new edge[e];
		for(int i=0;i<e;i++)
		{
			a[i]=new edge();
			a[i].source=in.nextInt();
			a[i].destination=in.nextInt();
			a[i].weight=in.nextInt();
		}
		Krushal(a,n);

	}
	
	public static void Krushal(edge input[],int n)
	{
		Arrays.sort(input);
		int parent[] =new int[n];
		for(int i=0;i<n;i++)
		{
			parent[i]=i;
		}
		edge out[]=new edge[n-1];
		int count=0;
		int i=0;
		while(count!=n-1)
		{
			edge current=input[i];
			int sourceparent=findparent(current.source,parent);
			int destinationparent=findparent(current.destination,parent);
			if(sourceparent!=destinationparent)
			{
				out[count]=current;
				count++;
				parent[sourceparent]=destinationparent;
			}
			i++;
		}
		for(int j=0;j<n-1;j++)
		{
			System.out.println(out[j].source+" "+out[j].destination+" "+out[j].weight);
		}
	}

	public static int findparent(int v, int[] parent) {
		// TODO Auto-generated method stub
		if(parent[v]==v)
		{
			return v;
		}
		return findparent(parent[v],parent);
	}
	
	

}


