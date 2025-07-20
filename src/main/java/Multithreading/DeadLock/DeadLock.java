package Multithreading.DeadLock;

public class DeadLock {
    public static void main(String[] args) {
        String lock1="lock1";
        String lock2="lock2";
        System.out.println("Main Thread started");
        new Thread(()->{
            synchronized (lock1){
                System.out.println("Lock1 Acquired in thread 1");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2){
                    System.out.println("Lock2 Acquired in thread 1");
                }
            }
        }).start();

        new Thread(()->{
            synchronized (lock2){
                System.out.println("Lock2 Acquired in thread 2");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1){
                    System.out.println("Lock1 Acquired in thread 2");
                }
            }
        }).start();

    }
}
