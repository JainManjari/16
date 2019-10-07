
public class EditDistance {
	
	public static int d(String s, String t)
	{
		int m=s.length();
		int n=t.length();
		if(m==0 || n==0)
		{
			return 0;
		}
		if(s.charAt(0)==t.charAt(0))
		{
			return d(s.substring(1),t.substring(1));
		}
		//insert
		int op1=d(s,t.substring(1));
		//delete
		int op2=d(s.substring(1),t);
		//substitute
		int op3=d(s.substring(1),t.substring(1));
		return 1+Math.min(op1, Math.min(op2, op3));
	}
	
	public static int dM(String s, String t)
	{
		int m=s.length();
		int n=t.length();
		int a[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				a[i][j]=-1;
			}
		}
		return d1M(s,t,a);
	}

	private static int d1M(String s, String t, int[][] a) {
		int m=s.length();
		int n=t.length();
		if(m==0)
		{
			
				a[m][n]=n;
				return a[m][n];
			
		}
		if(n==0)
		{
			
				a[m][n]=m;
				return a[m][n];
			
		}
		if(a[m][n]!=-1)
		{
			return a[m][n];
		}
		if(s.charAt(0)==t.charAt(0))
		{
			a[m][n]=d1M(s.substring(1), t.substring(1), a);
		}
		else
		{
			int op1=d1M(s, t.substring(1), a);
			int op2=d1M(s.substring(1), t, a);
			int op=d1M(s.substring(1), t.substring(1), a);
			a[m][n]=1+Math.min(op1, Math.min(op2, op));
		}
		return a[m][n];
	}
	
	public static int edDP(String s,String t)
	{
		int m=s.length();
		int n=t.length();
		int a[][]=new int[m+1][n+1];
		
			for(int j=0;j<=n;j++)
			{
				a[0][j]=j;
			}
		
		
			for(int i=0;i<=m;i++)
			{
				a[i][0]=i;
			}
			
			for(int i=1;i<=m;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(s.charAt(m-i)==t.charAt(n-j))
					{
						a[i][j]=a[i-1][j-1];
					}
					else
					{
						a[i][j]=1+Math.min(a[i-1][j], Math.min(a[i-1][j-1], a[i][j-1]));
					}
				}
			}
			return a[m][n];
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
