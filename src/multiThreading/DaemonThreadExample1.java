package multiThreading;

public class DaemonThreadExample1 extends Thread {
    static int count;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(200);
                count++;
//                System.out.println("I am a daemon thread...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static void main() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("I am a main thread...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        DaemonThreadExample1 t1 = new DaemonThreadExample1();
        t1.setDaemon(true);
        t1.start();

        System.out.println(count);
    }
}
