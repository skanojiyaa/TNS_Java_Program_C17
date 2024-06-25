package Day22_Generic;

public class Generic1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic1<String> name = new Generic1<String>();
		name.setData("Sakshi");
		System.out.println("Name : "+name);
		
		Generic1<Integer> rno = new Generic1<Integer>();
		rno.setData(17);
		System.out.println("Roll no : "+rno);
	
	}
}
