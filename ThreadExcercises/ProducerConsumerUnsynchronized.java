package ThreadExcercises;

public class ProducerConsumerUnsynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CubbyHole c = new CubbyHole();
	       
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);

        p1.start();
        c1.start();
	}

}
