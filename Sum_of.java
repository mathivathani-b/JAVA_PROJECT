import java.util.Scanner;

public class Sum_of {
public static void main(String[] args) {
	int n,r,l,sum=0;
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the total numbers in the set");
    n=s.nextInt();
    int[] arr=new int[n];
	System.out.println("Enter the set of numbers");
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	System.out.println("Enter the values of l and r");
	l=s.nextInt();
	r=s.nextInt();
	for(int i=l-1;i<=r-1;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println("The sum of elements in the range of"+" "+l+" "+ "and"+" " +r +" "+"is:"+sum);
}
}
