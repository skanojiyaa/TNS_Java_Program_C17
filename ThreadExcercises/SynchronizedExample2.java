package ThreadExcercises;

public class SynchronizedExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   TwoStrings2 ts = new TwoStrings2();
	       
	        new PrintStringsThread2("Hello ", "there.", ts);
	        new PrintStringsThread2("How are ", "you?", ts);
	        new PrintStringsThread2("Thank you ", "very much!", ts);
	}

}
