package Day22_Generic;

/*
 * <> -> it is generic type
 * T -> data type
 * 
 */
public class Generic1 <T>{

	//String
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Generic1 [data=" + data + "]";
	}	
}
