package ThreadExcercises;

public class RunnableThreadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNameRunnable1 pnt1 = new PrintNameRunnable1("A");
        Thread t1 = new Thread(pnt1);
        t1.start();
       
        PrintNameRunnable1 pnt2 = new PrintNameRunnable1("B");
        Thread t2 = new Thread(pnt2);
        t2.start();
       
        PrintNameRunnable1 pnt3 = new PrintNameRunnable1("C");
        Thread t3 = new Thread(pnt3);
        t3.start();
	}

}
