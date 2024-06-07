package Day13_Exception;

import java.util.*;
import java.io.*;

public class Exception1_simple {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {2,3,0,5,6,7};
		
		int a,b,result,ans;
		System.out.print("Enter A : ");
		a = sc.nextInt();
		System.out.print("Enter B : ");
		b = sc.nextInt();
		
		try{
			result = a/b;
			System.out.println("Division : "+result);
			
			for(int i : arr){
				ans = a/arr[6];
			}
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println("Exception "+e);
		}
		catch(Exception ex){
			System.out.println("Can't divide by 0 "+ex);
		}
		finally{
			System.out.println("Progarm Execute");
		}
	}
}
