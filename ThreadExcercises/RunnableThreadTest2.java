package ThreadExcercises;

public class RunnableThreadTest2 {
	 public static void main(String args[]) {
	       
	        // Since the constructor of the PrintNameRunnable
	        // object creates a Thread object and starts it,
	        // there is no need to do it here.
	        new PrintNameRunnable2("A");
	        new PrintNameRunnable2("B");
	        new PrintNameRunnable2("C");
	    }
}
