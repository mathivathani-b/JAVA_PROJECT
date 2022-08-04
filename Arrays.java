package myself;
import java.util.*;
class Array_display
{
	void display(int a[][],int m,int n)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
	
		System.out.print(a[i][j]);
	}
			System.out.println("\n");
}
	}
}
public class Arrays {
	public static void main(String[] args) {
		int row,col;
		Scanner s=new Scanner(System.in);
		row=s.nextInt();
		col=s.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter the element at"+i+j);
				arr[i][j]=s.nextInt();
			}
		}
	Array_display obj=new Array_display();
	obj.display(arr,row,col);
	}
}
