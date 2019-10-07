import java.util.Arrays;

public class MinCostPath {
	
	public static int cost(int a[][],int i,int j)
	{
		int m=a.length;
		int n=a[0].length;
		if(i==m-1 && j==n-1)
		{
			return a[i][j];
		}
		if(i>=m || j>=n)
		{
			return Integer.MAX_VALUE;
		}
		int op1=cost(a,i+1,j+1);
		int op2=cost(a,i+1,j);
		int op3=cost(a,i,j+1);
		return Math.min(op1, Math.min(op2, op3))+a[i][j];
	}
	
	public static int mincostM(int a[][],int i,int j)
	{
		int m=a.length;
		int n=a[0].length;
		int a1[][]=new int[m][n];
		for(int i1=0;i1<m;i1++)
		{
			for(int j1=0;j1<n;j1++)
			{
				a1[i][j]=-1;
			}
		}
		return min1(a,i,j,a1);
	}

	private static int min1(int[][] a, int i, int j, int[][] a1) {
		int m=a.length;
		int n=a[0].length;
		if(i>=m || j>=n)
		{
			return Integer.MAX_VALUE;
		}
		if(i==m-1 && j==n-1)
		{
			a1[i][j]=a[i][j];
			return a1[i][j];
		}
		if(a1[i][j]!=-1)
		{
			return a1[i][j];
		}
		a1[i][j]=a[i][j]+Math.min(min1(a, i+1, j, a1), Math.min(min1(a, i+1, j+1, a1), min1(a, i, j+1, a1)));
		return a1[i][j];
	}
	
	public static int minDP(int a[][])
	{
		int m=a.length;
		int n=a[0].length;
		int a1[][]=new int[m][n];
		a1[m-1][n-1]=a[m-1][n-1];
		for(int i=m-2;i>=0;i--)
		{
			a1[i][n-1]=a[i][n-1]+a1[i+1][n-1];
		}
		for(int j=n-2;j>=0;j--)
		{
			a1[m-1][j]=a[m-1][j]+a1[m-1][j+1];
		}
		
		for(int i=m-2;i>=0;i--)
		{
			for(int j=n-2;j>=0;j--)
			{
				a1[i][j]=a[i][j]+Math.min(a1[i+1][j], Math.min(a1[i+1][j+1], a1[i][j+1]));
			}
		}
		return a1[0][0];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
