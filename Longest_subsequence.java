import java.util.Scanner;
public class Longest_subsequence {
	public static void LIS(int X[])
	{
		int parent[] = new int[X.length];
	//Track the predecessors/parents of elements of each subsequence.
		int increasingSub[] = new int[X.length + 1];
	//Track ends of each increasing subsequence.
		int length = 0;
	//Length of longest subsequence
	for(int i= 0; i<X.length; i++)
	{
		//Binary Search
		int low =1;
		int high = length;
		while(low <= high)
	{
		int mid = (int) Math.ceil((low + high)/2);
		if(X[increasingSub[mid]] < X[i]){
		   low = mid + 1;
		}	
		else{
		   high = mid - 1;
		}
	}

	int pos = low;
	//update parent/previous element for LIS
	parent[i] = increasingSub[pos-1];
	//Replace or append
	increasingSub[pos] = i;
	//update the length of the longest subsequence
	if(pos > length)
		length = pos;
	}
	//Generate LIS by traversing parent array
	int LIS[] = new int[length];
	int k = increasingSub[length];
	for(int j = length-1;j>=0; j--)
	{
		LIS[j] = X[k];
		k = parent[k];
	}
    System.out.println("The length of the longest increasing subsequence is"+" "+length);
    System.out.println("The sequence is");
	for(int i = 0;i<length; i++)
	{
		System.out.print(LIS[i]+" ");
	}
	}
	public static void main(String args[])
	{
	int n,i;
	Scanner s=new Scanner(System.in);
	int X[] =new int[100];
	System.out.println("Enter the length of the array");
	n=s.nextInt();
	System.out.println("Enter the array");
	for(i=0;i<n;i++)
	{
		X[i]=s.nextInt();
	}
	LIS(X);
	}
	}