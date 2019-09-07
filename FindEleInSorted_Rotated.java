import java.util.*;
public class FindEleInSorted_Rotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		

	}
	
	public static int pivot(int a[],int start,int last)
	{
		if(start>last)
		{
			return -1;
		}
		if(start==last)
		{
			return start;
		}
		int mid=(start+last)/2;
		if(a[mid]<last && a[mid]>a[mid+1])
		{
			return mid;
		}
		if(a[mid]>start && a[mid]<a[mid-1])
		{
			return mid-1;
		}
		if(a[mid]>a[start]){
			return pivot(a,mid+1,last);
		}
		return pivot(a,start,mid);
	}
	
	public static int pivotBS(int a[], int start,int last,int key)
	{
		int p=pivot(a,0,a.length-1);
		if(p==-1)
		{
			return binarySearch(a,0,a.length-1,key);
		}
		if(a[p]==key)
		{
			return key;
		}
		if(a[0]<=key)
		{
			return pivotBS(a,0,p,key);
		}
		return pivotBS(a,p+1,a.length-1,key);
	}
	
	public static int binarySearch(int a[],int start,int last,int key)
	{
		if(start>last)
		{
			return -1;
		}
		int mid=(start+last)/2;
		if(a[mid]==key)
		{
			return mid;
		}
		if(key<a[mid])
		{
			return binarySearch(a,start,mid,key);
		}
		return binarySearch(a,mid+1,last,key);
	}

}
