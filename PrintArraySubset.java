package codingninja1;
import java.util.*;

public class PrintArraySubset {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		
		int ans[][]=seq(a,0);
		for(int i=0;i<ans.length;i++)
		{
			for(int j=0;j<ans[i].length;j++)
			{
			System.out.print(ans[i][j]+",");
			}
		}
	}
	
	public static int[][] seq(int input[], int start)
	{
		if(start==input.length)
		{
			int a[][]=new int[1][0];
			return a;
		}
		int a1[][]=seq(input,start+1);
		int a2[][]=new int[2*a1.length][];
		int k=0;
		for(int i=0;i<a1.length;i++)
		{
			a2[k]=new int[a1[i].length];
			for(int j=0;j<a1[i].length;j++)
			{
				a2[k][j]=a1[i][j];
			}
			k++;
		}
		for(int i=0;i<a1.length;i++)
		{
			a2[k]=new int[a1[i].length+1];
			a2[k][0]=input[start];
			for(int j=1;j<=a1[i].length;j++)
			{
				a2[k][j]=a1[i][j-1];
			}
			k++;
		}
		return a2;
	}
	
	/*public static String[] seq(String input[], int start, int last)
	{
		if(start>last)
		{
			String a1[]={""};
			return a1;
		}
		String a2[]=seq(input,start+1,last);
		String a3[]=new String[2*a2.length];
		int k=0;
		for(int i=0;i<a2.length;i++)
		{
			a3[k]=a2[i];
			k++;
		}
		for(int i=0;i<a2.length;i++)
		{
			a3[k]=a2[i]+""+input[i];
			k++;
		}
		return a3;
	}*/

}
