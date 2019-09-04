import java.util.*;
public class SubsetSumToK {
	public static void printSubsetsSumTok(int input[], int k) {
		int out[]=new int[0];
        print(input,0,out,k);
		
	}
    
    public static void print(int input[],int start,int output[],int k)
    {
        if(start==input.length)
        {
            if(k==0)
            {
                for(int i=0;i<output.length;i++)
                {
                    System.out.print(output[i]+" ");
                }
                System.out.println();
                return;
            }
            else
            {
                return;
            }
        }
        
        print(input,start+1,output,k);
        int newout[]=new int[output.length+1];
        int k1=0;
        for(int i=0;i<output.length;i++)
        {
            newout[k1]=output[i];
            k1++;
        }
        newout[k1]=input[start];
        print(input,start+1,newout,k-input[start]);
    }
    
    public static void main(String args[])
    {
    	Scanner in=new Scanner(System.in);
    	int n=in.nextInt();
    	int a[]=new int[n];
    	for(int i=0;i<n;i++)
    	{
    		a[i]=in.nextInt();
    	}
    	int k=in.nextInt();
    	printSubsetsSumTok(a,k);
    }
}

