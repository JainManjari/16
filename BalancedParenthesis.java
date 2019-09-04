import java.util.*;
public class BalancedParenthesis {
	
	public static boolean checkBalanced(String exp) {
		// Write your code here
        Stack<Character> stack=new Stack<Character>();
        char b[]=exp.toCharArray();
        for(int i=0;i<b.length;i++)
        {
            if(b[i]=='(' || b[i]=='{' || b[i]=='[')
            {
                stack.push(b[i]);
            }
            
            else if(b[i]==')' || b[i]=='}' || b[i]==']')
            {
                if(!stack.isEmpty())
                {
                char b1=map(b[i]);
                if(b1==stack.peek())
                {
                    stack.pop();
                }
                }
                else
                {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        return false;  
	}
    
    public static char map(char c)
    {
        if(c==')')
        {
            return '(';
        }
        
        if(c=='}')
        {
            return '{';
        }
        
        return '[';
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.print(checkBalanced(s));
	}

}
