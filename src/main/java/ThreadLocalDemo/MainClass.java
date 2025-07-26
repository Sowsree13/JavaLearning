package ThreadLocalDemo;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Starting Main thread");

        ThreadLocal<String> threadLocal=new ThreadLocal<>();

        threadLocal.set(Thread.currentThread().getName());

        Thread t=new Thread(new ThreadLocalClass());
        t.start();

        threadLocal.set(Thread.currentThread().getName());
        System.out.println(threadLocal.get());

    }
}
