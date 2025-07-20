public class RunnableInterface implements Runnable{
    //Advantage: Can implement any other interface since java support it
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread()+": "+i);
        }
    }
}
