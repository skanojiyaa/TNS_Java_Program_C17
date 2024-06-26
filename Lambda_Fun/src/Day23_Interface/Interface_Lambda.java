package Day23_Interface;

interface Calculator1{
	void getTotal();
}

interface Calculator2{
	int getSquare(int no);
}

public class Interface_Lambda {
	public static void main(String[] args){
		sayHello sh = ()-> System.out.println("Have A nice day");
		sh.letUsGreet();
		
		Calculator1 c1 = () -> System.out.println(17+4);
		c1.getTotal();
		
		Calculator2 c2 = (int no) -> no*no;
		System.out.println("Square : "+c2.getSquare(17));
		
	}
}
