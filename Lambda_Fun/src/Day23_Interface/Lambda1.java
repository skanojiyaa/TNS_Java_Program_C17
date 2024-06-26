package Day23_Interface;

interface msg{
	void message();
}

interface Cal1{
	void getTotal();
}

interface Cal2{
	int getSquare(int no);
}

interface Bank{
	void getDeposit(String name,int bal);
}
public class Lambda1 {
	public static void main(String[] args){
		msg ob = () -> System.out.println("Good Morning");
		ob.message();
		
		Cal1 c1 = () -> System.out.println(17+4);
		c1.getTotal();
		
		Cal2 c2 = (int no) -> no*no;
		System.out.println("Square : "+c2.getSquare(17));
		
		Bank b1 = (String name,int bal)->{
			System.out.println("Hello "+name);
			bal += 5000;
			System.out.println("Balance : "+bal);
		};
		b1.getDeposit("Sakshi", 10000);
	}
}
