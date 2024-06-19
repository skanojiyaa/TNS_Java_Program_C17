package ThreadExcercises;

public class PrintStringsThread2  implements Runnable {
	  Thread thread;
	    String str1, str2;
	    TwoStrings2 ts;
	   
	    PrintStringsThread2(String str1, String str2,
	                       TwoStrings2 ts) {
	        this.str1 = str1;
	        this.str2 = str2;
	        this.ts = ts;
	        thread = new Thread(this);
	        thread.start();
	    }
	   
	    public void run() {
	        // Synchronize over TwoString object
	        synchronized (ts) {
	            ts.print(str1, str2);
	        }
	    }
}
