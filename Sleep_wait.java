
public class Sleep_wait {
	    private static Object LOCK = new Object();
	    public static void main(String args[]) throws InterruptedException
	    {
	        Thread.sleep(2000);
	        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after 2 second");
	        synchronized (LOCK) 
	        {
	            LOCK.wait(1000);
	            System.out.println("Object '" + LOCK + "' is woken after" + " 1 second");
	        }
	    }

}
