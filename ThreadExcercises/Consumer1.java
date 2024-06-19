package ThreadExcercises;

public class Consumer1 extends Thread {
    private CubbyHole1 cubbyhole;
    private int number;

    public Consumer1(CubbyHole1 c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = cubbyhole.get(number);
        }
    }
}