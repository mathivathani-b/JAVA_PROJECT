package Assigned;

import java.util.Scanner;

public class Linear_search{    
		public static int linear(int[] arr, int key){    
		        for(int i=0;i<arr.length;i++){    
		            if(arr[i] == key){    
		                return i;    
		            }    
		        }    
		        return -1;    
		    }    
		    public static void main(String a[]){    
		    	int key,n;  
		        Scanner s =new Scanner(System.in);
		        System.out.println("Enter the key element");
		        key=s.nextInt();
		        System.out.println("Enter the total number of elements in the array");
		        n=s.nextInt();
		        int[] a1=new int[n];  
		        System.out.println("enter the array elements");
		        for(int i=0;i<n;i++)
		        {
		        	a1[i]=s.nextInt();
		        }
		        System.out.println(key+" is found at index: "+linear(a1, key));    
		    }    
		}    
