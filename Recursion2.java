package codingninja1;
import java.util.*;
public class Recursion2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int no=in.nextInt();
		int sf=sum1(no);
		System.out.print(sf+" ");
		//int n=in.nextInt();
		//double r=sum(n);
		//String s1=in.nextLine();
		//char b1[]=s1.toCharArray();
		//int n=b1.length;
		//System.out.println(palindrome(b1,0,n-1));
		//System.out.print(r+" ");
		//String s=in.nextLine();
		//char b[]=s.toCharArray();
	    //countZeroes(b,0,0);
		//int a=in.nextInt();
		//int b=in.nextInt();
		//int c=multiply(a,b);
		//System.out.print(c+" ");
	}
	public static int sum1(int a)
	{
		if(a/10==0)
		{
			return a;
		}
		int x=a%10;
		return x+sum1(a/10);
	}
	public static boolean palindrome(char input[], int start, int last)
	{
		if(input[start]!=input[last])
		{
			return false;
		}
		if(start>=last)
		{
			return true;
		}
		 
		return palindrome(input,start+1, last-1);
		
	}
	
	public static double sum(int n)
	{
		if(n<0)
		{
			return 0;
		}
		double x=Math.pow(2,-n);
		return x+sum(n-1);	
	}
	
	public static void countZeroes(char input[],int start, int count)
	{
		if(start>input.length-1)
		{
			System.out.print(count+" ");
			return;
		}
		if(input[start]=='0')
		{
			count++;
			//System.out.println(count+" ");
		}
		countZeroes(input,start+1,count);	
	}
	
	public static int multiply(int a, int b)
	{
		if(b==1)
		{
			return a;
		}
		return a+multiply(a,b-1);
	}

}
