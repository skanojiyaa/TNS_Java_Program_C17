package Day23_Interface;

class Test implements sayHello{
	@Override
	public void letUsGreet(){
		System.out.println("Have a nice day");
	}
}

public class InterfaceDemo {
	
	public static void main(String[] args){
		sayHello sh = new Test();
		sh.letUsGreet();
	}
}
