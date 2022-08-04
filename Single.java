package inheritance;
import java.util.Scanner;
class Base{
	public void methoda()
	{
	int a,b,c;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	c=a+b;
	System.out.println(c);
	}
}
class Derived extends Base
{
	public void methodb()
	{
	System.out.println("child is called");
}}
public class Single {	
	public static void main(String[] args) {
	 Derived obj=new Derived();
	 obj.methoda();
	 obj.methodb();
	 
	}

}
