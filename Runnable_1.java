
public class Runnable_1 implements Runnable {
	public static int myCount = 0;
    public Runnable_1(){}
    public void run() {
        while(Runnable_1.myCount <= 5){
            try{
                System.out.println("Expl Thread: "+(++Runnable_1.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread");
        Runnable_1 mt = new Runnable_1();
        Thread t = new Thread(mt);
        t.start();
        while(Runnable_1.myCount <= 5){
            try{
                System.out.println("Main Thread: "+(++Runnable_1.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread");
    }


}
