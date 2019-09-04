import java.util.*;
public class PrintAllCodesToString {
	public static void printAllPossibleCodes(String input) {
		String out="";
        print(input,out);

	}
    
    public static void print(String input,String output)
    {
        if(input.length()==0)
        {
            System.out.println(output);
            return;
        }
        int num=(input.charAt(0)-'0');
        char c=getchar(num);
        print(input.substring(1),output+c);
        if(input.length()>=2)
        {
            int num2=10*(input.charAt(0)-'0')+(input.charAt(1)-'0');
            if(num2>10 && num2<=26)
            {
                 char c1=getchar(num2);
                print(input.substring(2),output+c1);
            }
        }
        
        
    }
    
    public static char getchar(int n)
    {
        return (char)(n+96);
    }
    
    public static void main(String args[])
    {
    	Scanner in=new Scanner(System.in);
    	String str=in.nextLine();
    	printAllPossibleCodes(str);
    }
}
