package Day19_Dequeue;

import java.util.*;

public class Dequeue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq1 = new ArrayDeque<String>();
		
		dq1.add("Rose");
		dq1.add("Lotus");
		dq1.add("Habiscus");
		
		System.out.println(dq1);
		
		dq1.addFirst("Tulip");
		System.out.println(dq1);
		
		dq1.pollLast();
		System.out.println(dq1);
	}

}
