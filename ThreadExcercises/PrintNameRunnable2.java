package ThreadExcercises;

public class PrintNameRunnable2 implements Runnable{
	Thread thread;
	   
    public PrintNameRunnable2(String name) {
        thread = new Thread(this, name);
        thread.start();
    }
   
	// Implementation of the run() defined in the
    // Runnable interface.
    public void run() {
        String name = thread.getName();
        for (int i = 0; i < 10; i++) {
            System.out.print(name);
        }
    }
}
