package codingninja1;
import java.util.*;

public class Keypad {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();	
		String y="";
		//String a5[]=key(n);
		key1(n,y);
		/*for(int i=0;i<a5.length;i++)
		{
			System.out.print(a5[i]+" ");
		}*/
	}
	
	public static void key1(int n,String y)
	{
		if(n==0)
		{
			System.out.print(y+" ");
			return;
		}
		String a1[]=helper(n%10);
		for(int i=0;i<a1.length;i++)
		{
			key1((n/10),a1[i]+y);
		}
	}
	
	public static String[] helper(int a)
	{
		if(a==1)
		{
			String ans[]={"a","b","c"};
			return ans;
		}
		if(a==2)
		{
			String ans[]={"d","e","f"};
			return ans;
		}
		if(a==3)
		{
			String ans[]={"g","h","i"};
			return ans;
		}
		if(a==4)
		{
			String ans[]={"j","k","l"};
			return ans;
		}
		if(a==5)
		{
			String ans[]={"m","n","o"};
			return ans;
		}
		if(a==6)
		{
			String ans[]={"p","q","r","s"};
			return ans;
		}
		if(a==7)
		{
			String ans[]={"t","u","v"};
			return ans;
		}
		String ans[]={"w","x","y","z"};
		return ans;
	}
	
	public static String[] key(int n)
	{
		if(n==0)
		{
			String a1[]={""};
			return a1;
		}
		String a2[]=key(n/10);
		String a3[]=helper(n%10);
		String a4[]=new String[a2.length*a3.length];
		int k=0;
		for(int j=0;j<a3.length;j++)
		{
		for(int i=0;i<a2.length;i++)
		{
			a4[k]=a2[i]+a3[j];
			k++;
		}
		}
		return a4;
	}

}
