package ThreadExcercises;

public class ExtendThreadClassTest1 {
	public static void main(String args[]){
		 // Create object instance of a class that is subclass of Thread class
        System.out.println("Creating PrintNameThread object instance..");
        PrintNameThread1 pnt1 =new PrintNameThread1("A");
       
        // Start the thread by invoking start() method
        System.out.println("Calling start() method of " + pnt1.getName() + " thread");
        pnt1.start();
        
        System.out.println("Creating PrintNameThread object instance..");
        PrintNameThread1 pnt2 = new PrintNameThread1("B");
        System.out.println("Calling start() method of " + pnt2.getName() + " thread");
        pnt2.start();
       
        System.out.println("Creating PrintNameThread object instance..");
        PrintNameThread1 pnt3 = new PrintNameThread1("C");
        System.out.println("Calling start() method of " + pnt3.getName() + " thread");
        pnt3.start();
       
	}
}
