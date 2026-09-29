package multiThreading;

public class DaemonThreadExample2 extends Thread {
    @Override
    public void run() {
        while(true) {
            try{
                System.out.println("Logging application status...");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("I am a main thread...");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        DaemonThreadExample2 t1 = new DaemonThreadExample2();
        t1.setDaemon(true);
        t1.start();
    }
}
