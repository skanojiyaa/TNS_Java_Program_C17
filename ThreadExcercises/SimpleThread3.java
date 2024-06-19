package ThreadExcercises;

public class SimpleThread3 extends Thread {
	public SimpleThread3(String str) {
        super(str);
    }
   
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName()
                                 + " Priority = " + getPriority());
        }
        System.out.println("Done! " + getName());
    }
}
