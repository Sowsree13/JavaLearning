package Multithreading.Synchronization;

public class Synchronization {
    public static void main(String[] args) {
        Stack stack=new Stack(5);
        System.out.println("Started Main thread");
        new Thread(()->{
            for(int i=0;i<5;i++){
                try {
                    System.out.println(stack.push(100));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        new Thread(()->{
            for(int i=0;i<5;i++){
                try {
                    System.out.println( stack.pop());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        System.out.println("Main thread ended");
    }

}
