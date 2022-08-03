package Assigned;

import java.util.Scanner;

public class Quick_sort 
{
		int partition(int arr[], int low, int high)
		{
			int pivot = arr[high];
			int i = (low-1); // index of smaller element
			for (int j=low; j<high; j++)
			{
				// If current element is smaller than or
				// equal to pivot
				if (arr[j] <= pivot)
				{
					i++;

					// swap arr[i] and arr[j]
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

			// swap arr[i+1] and arr[high] (or pivot)
			int temp = arr[i+1];
			arr[i+1] = arr[high];
			arr[high] = temp;

			return i+1;
		}
		void sort(int arr[], int low, int high)
		{
			if (low < high)
			{
				int pi = partition(arr, low, high);
				sort(arr, low, pi-1);
				sort(arr, pi+1, high);
			}
		}

		/* A utility function to print array of size n */
		static void printArray(int arr[])
		{
			int n = arr.length;
			for (int i=0; i<n; ++i)
				System.out.print(arr[i]+" ");
			System.out.println();
		}
		public static void main(String args[])
		{
			int n;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the total number of elements");
			n=s.nextInt();
			int arr[] =new int[n];
			System.out.println("Enter the array elements");
			for(int i=0;i<n;i++)
			{
			    arr[i]=s.nextInt();
			}
			n = arr.length;
			Quick_sort ob = new Quick_sort();
			ob.sort(arr, 0, n-1);
			System.out.println("sorted array");
			printArray(arr);
		}
	}
