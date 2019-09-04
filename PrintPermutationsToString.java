import java.util.*;
public class PrintPermutationsToString {
	public static void permutations(String input){
		// Write your code here
        String out="";
        print(input,out);
	}
    
    public static void print(String s, String o)
    {
        if(s.length()==0)
        {
            System.out.println(o);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            print(s.substring(0,i)+s.substring(i+1),o+s.charAt(i));
        }
    }
    
    public static void main(String args[])
    {
    	Scanner in=new Scanner(System.in);
    	String str=in.nextLine();
    	permutations(str);
    }
}
