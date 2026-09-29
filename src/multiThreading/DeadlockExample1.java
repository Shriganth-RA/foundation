package multiThreading;

class Study {
    public synchronized void read(Pen p) {
        System.out.println("I need a book to read..");
        p.book();
    }
    public synchronized void bluePen() {
        System.out.println("I am a blue pen...");
    }
}

class Pen {
    public synchronized void book() {
        System.out.println("I am a book...");
    }
    public synchronized void write(Study s) {
        System.out.println("I need a blue pen to write...");
        s.bluePen();
    }
}


class MyThread1 extends Thread {
    Study s;
    Pen p;

    public MyThread1(Study s, Pen p) {
        this.s = s;
        this.p = p;
    }

    @Override
    public void run() {
        s.read(p);
    }
}


class MyThread2 extends Thread {
    Study s;
    Pen p;

    public MyThread2(Study s, Pen p) {
        this.s = s;
        this.p = p;
    }

    @Override
    public void run() {
        p.write(s);
    }
}


public class DeadlockExample1 {
    public static void main(String[] args) {
        Study s = new Study();
        Pen p = new Pen();

        MyThread1 t1 = new MyThread1(s, p);
        MyThread2 t2 = new MyThread2(s, p);

        t1.start();
        t2.start();
    }
}
