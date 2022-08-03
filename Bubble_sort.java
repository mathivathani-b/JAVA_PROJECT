package Assigned;

import java.util.Scanner;

public class Bubble_sort 
{
	static void bubbleSort(int[] arr)
	{  
int n = arr.length;  
int temp = 0;  
for(int i=0; i < n; i++)
{  
	for(int j=1; j < (n-i); j++)
	{  
	     if(arr[j-1] > arr[j])
	     {  
	     temp = arr[j-1];  
	     arr[j-1] = arr[j];  
	     arr[j] = temp;  
	                         
	     }  
	                          
	    }  
	}  
	  
}  
public static void main(String[] args) 
{  
	                int n;
	                Scanner s=new Scanner(System.in);
	                System.out.println("Enter the total number of elements");
	                n=s.nextInt();
	                int arr[] =new int[n];
	                System.out.println("Enter the elements");
	                for(int i=0;i<n;i++)
	                {
	                arr[i]=s.nextInt();
	                }
	                System.out.println("Array Before Bubble Sort");  
	                for(int i=0;i<arr.length;i++)
	                {  
	                 System.out.print(arr[i] + " ");  
	                }  
	                System.out.println();  
	                bubbleSort(arr);  
	                System.out.println("Array After Bubble Sort");  
	                for(int i=0; i < arr.length; i++){  
	                        System.out.print(arr[i] + " ");  
	                }  
	   
	        }  
	}  

