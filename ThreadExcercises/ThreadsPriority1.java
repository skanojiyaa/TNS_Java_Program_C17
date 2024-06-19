package ThreadExcercises;

public class ThreadsPriority1 {
	public static void main(String[] args) {
	       
        Thread t1 = new SimpleThread3("Boston");
        t1.start();
        // Set the thread priority to 10(highest)
        t1.setPriority(10);
       
        Thread t2 = new SimpleThread3("New York");
        t2.start();
        // Set the thread priority to 5
        t2.setPriority(5);
       
        Thread t3 = new SimpleThread3("Seoul");
        t3.start();
        // Set the thread priority to 1
        t3.setPriority(1);
       
    }
}
