public class MainClass {
    public static void main(String[] args) {
        System.out.println("Main Thread starting..");
//        Thread thread1=new ThreadClass();
//        thread1.start();//asynchronus call so the thread returns immediately and jvm calls the run method whenever its free
//        Thread thread2=new Thread(new RunnableInterface());
//        thread2.start();
        Thread thread2=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread()+": "+i);
            }
        });
        thread2.start();
        System.out.println("Main Thread Ending..");//once the main thread and user threads are completed the program stops but doesnt consider about the running of deamon thread
        //so the user thread gets executed even after the main thread is ended
    }
}
