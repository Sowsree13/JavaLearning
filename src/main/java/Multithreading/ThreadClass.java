package Multithreading;

public class ThreadClass extends Thread{
    //Disadvantage: Cant extend any other class since java doesnt support mutiple inheritance
    //It overrides the run method in thread class
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread()+": "+i);
        }
    }
}
