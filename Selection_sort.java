package Assigned;
import java.util.Scanner;
public class Selection_sort 
{
	void sort(int arr[])
		{
			int n = arr.length;
			for (int i = 0; i < n-1; i++)
			{
				int min_idx = i;
				for (int j = i+1; j < n; j++)
				{
					if (arr[j] < arr[min_idx])
					{
						min_idx = j;
					}
			      }
int temp = arr[min_idx];
arr[min_idx] = arr[i];
arr[i] = temp;			
	}
}
void printArray(int arr[])
{
	int n = arr.length;
	for (int i=0;i<n;i++)
	{
	System.out.print(arr[i]+" ");
	}
}
public static void main(String args[])
{
Selection_sort ob = new Selection_sort();
Scanner s=new Scanner(System.in);
int arr[] =new int[100];
System.out.println("Enter total number of elements in the array");
int n=s.nextInt();
System.out.println("Enter the value of elements");
for(int i=0;i<n;i++)
{
System.out.println(arr[i]);	
}
ob.sort(arr);
System.out.println("Sorted array");
ob.printArray(arr);
}
}
