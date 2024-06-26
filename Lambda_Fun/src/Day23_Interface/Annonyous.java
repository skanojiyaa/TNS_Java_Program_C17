package Day23_Interface;

public class Annonyous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHello sh = new sayHello(){
			public void letUsGreet(){
				System.out.println("Have a nice day");
			}
			
		};
		sh.letUsGreet();
	}

}
