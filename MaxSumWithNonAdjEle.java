import java.util.*;
public class MaxSumWithNonAdjEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		int incl=a[0];
		int excl=0;
		for(int i=1;i<n;i++)
		{
			int temp=incl;
			int temp1=excl;
			incl=excl+a[i];
			excl=Math.max(temp, temp1);
		}
		excl=Math.max(incl, excl);
		System.out.print(excl);

	}

}
