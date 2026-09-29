package multiThreading;

import java.time.LocalDateTime;

class Whatsapp {
    volatile boolean online = false;
    LocalDateTime lastSeen;

    class User extends Thread {
        @Override
        public void run() {
            System.out.println("User opened whatsApp...");
            online = true;

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            lastSeen = LocalDateTime.now();
            online = false;

            System.out.println("User exited whatsApp...");
        }
    }

    class LastSeen extends Thread {
        @Override
        public void run() {
            while (true) {
                if (online) {
                    System.out.println("WhatsApp status: ONLINE");
                } else {
                    System.out.println("Last Seen: " + lastSeen);
                    break;
                }
            }
        }
    }
}

public class InterThreadCommTask2 {
    static void main() {
        Whatsapp wa = new Whatsapp();

        Whatsapp.User u = wa.new User();
        Whatsapp.LastSeen ls = wa.new LastSeen();

        ls.setDaemon(true);
        u.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        ls.start();

        try {
            u.join();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Application closed...");
    }
}
