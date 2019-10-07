
public class MaxProdSubArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int Product(int a[],int n)
	{
		int max_prod=1;
		int min_prod=1;
		int max_so_far=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>0)
			{
				max_prod*=a[i];
				min_prod=Math.min(1, min_prod*a[i]);
			}
			else if(a[i]<0)
			{
				int temp=max_prod;
				max_prod=Math.max(1, min_prod*a[i]);
				min_prod=temp*a[i];
			}
			else
			{
				max_prod=1;
				min_prod=1;
			}
			max_so_far=Math.max(max_so_far, max_prod);
		}
		return max_so_far;
	}

}
