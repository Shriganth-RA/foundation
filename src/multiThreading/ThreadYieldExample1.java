package multiThreading;

public class ThreadYieldExample1 extends Thread {
    @Override
    public void run() {

    }

    static void main() {
        ThreadYieldExample1 t1 = new ThreadYieldExample1();
        ThreadYieldExample1 t2 = new ThreadYieldExample1();

        t1.start();
        t2.start();

//        for (int i = 0; i < 3; i++)
    }
}
