package ThreadExcercises;

public class SynchronizedExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new PrintStringsThread1("Hello ", "there.");
	     new PrintStringsThread1("How are ", "you?");
	     new PrintStringsThread1("Thank you ", "very much!");
	    
	}

}
