package codingninja1;
import java.util.*;

public class subsequence {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    String s2=s.substring(0,2);
    System.out.print(s2);
    
    /*String s1[]=seq(s);
    for(int i=0;i<s1.length;i++)
    {
    	System.out.print(s1[i]+" ");
    }*/
    
	} 
	
	public static String[] seq(String str)
	{
		if(str.length()==0)
		{
			String ans[]={""};
			return ans;
		}
		String smallans[]=seq(str.substring(1));
		String ans[]=new String[2*smallans.length];
		for(int i=0;i<smallans.length;i++)
		{
			ans[i]=smallans[i];
		}
		
		for(int i=smallans.length;i<ans.length;i++)
		{
			ans[i]=str.charAt(0)+smallans[i-smallans.length];
		}
		return ans;
	}

}
