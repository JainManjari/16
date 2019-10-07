import java.util.*;
import java.util.LinkedList;
public class HussainCodeChef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		    int n=in.nextInt();
		    String s=in.nextLine();
	        HashMap<Character,Integer> map=new HashMap<>();
	        for(int i=0;i<s.length();i++)
	        {
	        	if(map.containsKey(s.charAt(i)))
	        	{
	        		map.put(s.charAt(i),map.get(s.charAt(i))+1);
	        	}
	        	else
	        	{
	        		map.put(s.charAt(i), 1);
	        	}
	        }
	        if(map.containsKey('a'))
	        	{
	        		System.out.print(map.get('a')+" ");
	         }
	        
	        //System.out.print(ca+" "+cs+" "+cp);
			
		/*int n=in.nextInt();
		int m=in.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextLong();
		}
		Queue<Long> q=new LinkedList<>();
	
		int end=n-1;
		int count=0;
		while(m-->0)
		{
			int curr_m=in.nextInt();
			long ans=0;
			for(;count<curr_m;count++)
			{
				if(end>=0 && ( (q.isEmpty()) || (a[end]>q.peek())))
				{
					ans=a[end];
					end--;
				}
				else
				{
					ans=q.remove();
				}
				q.add(ans/2);
			}
			System.out.println(ans+" ");
		}*/

	}

}
