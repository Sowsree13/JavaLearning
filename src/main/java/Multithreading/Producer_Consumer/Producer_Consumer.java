package Multithreading.Producer_Consumer;

import java.util.LinkedList;
import java.util.Queue;

public class Producer_Consumer {
    private Queue<Integer> q;
    private int capacity;

    public Producer_Consumer(int capacity){
        q=new LinkedList<>();
        this.capacity=capacity;
    }
    public boolean producer(int val) throws InterruptedException {
        synchronized (q){
            while (q.size() == capacity) {
                q.wait();
            }
            q.add(val);
            q.notifyAll();
            return true;
        }
    }
    public int consumer() throws InterruptedException {
        synchronized (q){
            while (q.isEmpty()) {
                q.wait();
            }
            int val=q.poll();
            q.notifyAll();
            return val;
        }
    }
}
