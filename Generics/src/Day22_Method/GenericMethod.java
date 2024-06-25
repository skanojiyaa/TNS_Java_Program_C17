package Day22_Method;
import java.util.*;

public class GenericMethod {
	public <T,K> void display(T msg,K msg1){
		System.out.println(msg);
		System.out.println(msg1);
	}
	
	public void getList(ArrayList<?> arr){
		for(Object ob:arr){
			System.out.println(ob);
		}
	}
// ? extends == upperbound (Class and it children)
	public void getNumber(ArrayList<? extends Number> ar){
		for(Object ob1:ar){
			System.out.println(ob1);
		}
	}
	
	public void getString(ArrayList<? extends String> ar){
		for(Object ob1:ar){
			System.out.println(ob1);
		}
	}
// ? super == Lower bounded (class that we passed and its parent)
	public void getInteger(ArrayList<? super Integer> ar){
		for(Object ob1:ar){
			System.out.println(ob1);
		}
	}
}
