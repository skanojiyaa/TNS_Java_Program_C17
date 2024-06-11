package Day14_UserException;

import java.util.*;

public class colorMain {
	public static void main(String args[]){
		Color ob = new Color();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Color : ");
		String cName = sc.nextLine();
		ob.setColorName(cName);
		System.out.println("Color : "+ob.getColorName());
	}
}
