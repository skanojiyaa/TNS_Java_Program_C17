package ThreadExcercises;

public class ProducerConsumerSynchronized {
	 public static void main(String[] args) {
	       
	        CubbyHole1 c = new CubbyHole1();
	       
	        Producer1 p1 = new Producer1(c, 1);
	        Consumer1 c1 = new Consumer1(c, 1);
	       
	        p1.start();
	        c1.start();
	    }
}
