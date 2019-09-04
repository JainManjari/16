package codingninja1;
import java.util.*;
public class PrintSubseq {

	
	public static void seq(String s,String y)
	{
		if(s.length()==0)
		{
			System.out.println(y+" ");
			return;
		}
		seq(s.substring(1),y);
		seq(s.substring(1),y+s.charAt(0));
		
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//String s=in.nextLine();
		//String y="";
		//seq(s,y);
		int n1=in.nextInt();
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=in.nextInt();
		}
		int n2=in.nextInt();
		int arr2[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
			arr2[i]=in.nextInt();
		}
		
		 HashMap<Integer,Integer> map=new HashMap<>();
		 for(int i=0;i<arr1.length;i++)
	        {
	            if(map.containsKey(arr1[i]))
	            {
	                map.put(arr1[i],map.get(arr1[i])+1);
	            }
	            else
	            {
	            map.put(arr1[i],1);
	            }
	        }
	        for(int i=0;i<arr2.length;i++)
	        {
	            if(map.containsKey(arr2[i]))
	            {
	                System.out.println(arr2[i]);
	            }
	        }

	}

}
