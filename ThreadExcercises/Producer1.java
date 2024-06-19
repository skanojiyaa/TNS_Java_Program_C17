package ThreadExcercises;

public class Producer1 extends Thread {

    private CubbyHole1 cubbyhole1;
    private int number;

    public Producer1(CubbyHole1 c, int number) {
        cubbyhole1 = c;
        this.number = number;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            cubbyhole1.put(number, i);
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) { }
        }
    }
}