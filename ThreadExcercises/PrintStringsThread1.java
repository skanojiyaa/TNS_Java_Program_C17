package ThreadExcercises;

public class PrintStringsThread1  implements Runnable {
	Thread thread;
    String str1, str2;
   
    PrintStringsThread1(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        thread = new Thread(this);
        thread.start();
    }
   
    public void run() {
        TwoStrings1.print(str1, str2);
    }
   
}
