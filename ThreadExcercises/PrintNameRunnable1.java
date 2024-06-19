package ThreadExcercises;

public class PrintNameRunnable1 implements Runnable {
	String name;
	   
    PrintNameRunnable1(String name) {
        this.name = name;
    }
   
    // Implementation of the run() defined in the
    // Runnable interface.
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(name);
        }
    }
}
