package ThreadLocalDemo;

public class ThreadLocalClass implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Thread Class " + i);
        }
    }
}
