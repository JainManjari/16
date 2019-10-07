import java.util.*;
public class PalindromIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		HashMap<Character,ArrayList<Integer>> map=new HashMap<>();
	//	
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.get(s.charAt(i)).add(i+1);
				map.put(s.charAt(i), map.get(s.charAt(i)));
			}
			else
			{
				ArrayList<Integer> a=new ArrayList<>();
				a.add(i+1);
				map.put(s.charAt(i), a);
			}
		}
		int count=0;
		for(Character c:map.keySet())
		{
			ArrayList<Integer> b=map.get(c);
			if(b.size()%2!=0)
			{
				count++;
			}
		}
		if(count>=2)
		{
			System.out.print("-1");
		}
		else
		{
			int a1[]=new int[s.length()];
			int start=0;
			int end=a1.length-1;
			for(Character c:map.keySet())
			{
				ArrayList<Integer> b=map.get(c);
				if(b.size()%2==0)
				{
					for(int i=0;i<b.size();i+=2)
					{
						if(start<end)
						{
						a1[start++]=b.get(i);
						a1[end--]=b.get(i+1);
						}
					}
				}
				else
				{
					for(int i=0;i<b.size()/2;i+=2)
					{
						if(start<end)
						{
						a1[start++]=b.get(i);
						a1[end--]=b.get(i+1);
						}
					}
					a1[a1.length/2]=b.get(b.size()-1);
				}
			}
			for(int i=0;i<a1.length;i++)
			{
				System.out.print(a1[i]+" ");
			}
			
		}

	}

}
