package codingninja1;
import java.util.*;

public class Recursion3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine(); 
		int n=s.length();
		//String s3=rep(s);
		//System.out.print(s3);
		//remove(s,0);
		//String y1="";
		String y2=pair(s,0);
		System.out.print(y2);
		//String y="";
		//String s5=removex(s,0,y);
		//System.out.print(s4);
		//System.out.print(s5);
		

	}
	
	public static String removeConsecutiveDuplicates(String input) {
		if(input.length()==0)
        {
            return input;
        }
        String temp=removeConsecutiveDuplicates(input.substring(1));
        if(temp.charAt(0)==input.charAt(0))
        {
            return temp;
        }
        else
        {
            return ""+input.charAt(0)+temp;
        }
	}
        
	
	
	public static String pair(String s,int start)
	{
		if(s.length()==1)
		{
			return s;
		}
		String temp=pair(s.substring(1), start+1);
		
		if(s.charAt(0)==temp.charAt(0))
		{
			return ""+s.charAt(0)+"*"+temp;
		}
		else
		{
			return s.charAt(0)+temp;
		}
	}
	
	
	public static String removex(String s, int start, String d)
	{
		if(start==s.length())
		{
			return d;
		}
		if(s.charAt(start)=='x')
		{
			return removex(s,start+1,d);
		}
		else
		{
			return removex(s,start+1,d+s.charAt(start));
		}
	}
	
	
	
	public static void remove(String s, int start)
	{
	    if(start>s.length()-1)
	    {
	    	return;
	    }
		if(s.charAt(start)!='x')
		{
			System.out.print(s.charAt(start));
		}
		remove(s, start+1);
	}
	
	
	public static String rep(String input)
	{
		if(input.length()==1){
            //
            return input;
        }
        String temp = rep(input.substring(1));
       // System.out.println(temp + " " + input);
        if(temp.charAt(0)=='i' && input.charAt(0)=='p'){
            return "3.14" + temp.substring(1);
        }else{
            return input.charAt(0) + temp;
        }
	}

}
