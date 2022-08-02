import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Fourth_smallest {
	public static void main(String[] args) {
List<Integer> l =new ArrayList<>();
l.add(9);
l.add(7);
l.add(8);
l.add(6);
l.add(5);
l.add(4);
System.out.println("Arraylist before sorting");
System.out.println(l);
Collections.sort(l);
System.out.println("Arraylist after sorting");
System.out.println(l);
System.out.println("Fourth smallest element is");
System.out.println(l.get(3));
}
}
