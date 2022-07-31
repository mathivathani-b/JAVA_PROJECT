
public class Try_catch {
	public static void main(String[] args) {
		System.out.println("Try catch is going to be executed");
			try {
				int a=50/0;
				//division by zero throws error
			}
			catch(Exception e) {
				System.out.println(e);	
			}
			System.out.println("Job done");
	}
}
