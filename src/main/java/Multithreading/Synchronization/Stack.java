package Multithreading.Synchronization;

public class Stack {
    private int[] stack;
    private int top;
    Object lock;
    public Stack(int capacity) {
        stack =new int[capacity];
        top=-1;
        lock=new Object();
    }

    // for static methods use classname.class as obj eg.instead of lock use Stack.class
    public boolean push(int val) throws InterruptedException {
        synchronized (lock){
            if (isFull()) return false;
            top++;
            Thread.sleep(1000);
            stack[top] = val;
            return true;
        }
    }

//this is synchronized method here by default the instance of the class is passed as an object for lock
//so only one method from each obj can access others are locked
//public synchronized boolean push(int val) throws InterruptedException {
//        if (isFull()) return false;
//        top++;
//        Thread.sleep(1000);
//        stack[top] = val;
//        return true;
//}
//public synchronized int pop() throws InterruptedException {
//            if (isEmpty()) return -1;
//            int val = stack[top];
//
//            Thread.sleep(1000);
//
//            top--;
//            return val;
//    }


    public int pop() throws InterruptedException {
    //this is synchronized block any object can be passed
        synchronized (lock) {
            if (isEmpty()) return -1;
            int val = stack[top];

            Thread.sleep(1000);

            top--;
            return val;
        }
    }
    private boolean isFull() {
        return top>= stack.length-1;
    }

    public boolean isEmpty(){
        return top<0;
    }
}
