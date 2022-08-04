package myself;
//Abstraction
	interface Calculator1{
		public abstract void sum(int a, int b);
		public abstract void sub(int a, int b);	
	}
	interface Calculator2{
		public abstract void mul(int a, int b);
	}
	interface Calculator3 extends Calculator1{
		public abstract void div(int a, int b);
	}
	class CalImp implements Calculator3{

		@Override
		public void sum(int a, int b) {
			System.out.println(a+b);
		}
		@Override
		public void sub(int a, int b) {
			System.out.println(a-b);
		}
		@Override
		public void div(int a, int b) {
			System.out.println(a/b);
		}	
	}
	public class Abstra {
	public static void main(String[] args) {
		CalImp imp=new CalImp();
		imp.div(3, 2);	
	}
	}

