/* write a java program using multiple catch blocks.
Create a class CatchExcercise inside the try block CatchExercise
inside the try block declare an array a[] and initialize with
value a[5] = 30/5;. in each catch block show Arithmetic exception
and ArrayIndexOutOfBoundsException */

package Day13_Exception;

public class ExceptionExcercise {
	public static void main(String[] args){
	
		try{
			int[] arr = new int[5];
			for(int i : arr){
				arr[5] = 30/5;
			}
			System.out.println("Ans : "+arr[5]);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println("Exception "+e);
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		finally{
			System.out.println("Program Run successfully");
		}
	}
}
