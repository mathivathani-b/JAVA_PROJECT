package Assigned;
import java.util.*;
public class Exponential_search {
static int exponentialSearch(int arr[],int n, int x)
{
if (arr[0] == x)
return 0;
int i = 1;
while (i < n && arr[i] <= x)
i = i*2;
// Call binary search for the found range.
return Arrays.binarySearch(arr, i/2, Math.min(i, n-1), x);
}
public static void main(String args[])
{
int arr[] = {2,3,4,10,40,50,89};
int key;
Scanner s=new Scanner(System.in);
System.out.println("Enter the element to be searched");
key=s.nextInt();
int result = exponentialSearch(arr, arr.length, key);
System.out.println((result < 0) ? "Element is not present in array" :"Element is present at index " + result);
}
}
