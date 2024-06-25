package Day22_Method;

import java.util.ArrayList;

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethod ob = new GenericMethod();
		ob.display(17, "Sakshi");
		System.out.println();
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(	10);
		ar.add(20);
		ar.add(30);
		ob.getList(ar);
		System.out.println();
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Sakshi");
		ar1.add("Ishita");
		ar1.add("Noor");
		ob.getList(ar1);
		
		System.out.println();
		ob.getNumber(ar);
		
		System.out.println();
		ob.getString(ar1);
		
		System.out.println();
		ob.getInteger(ar);
	}

}
