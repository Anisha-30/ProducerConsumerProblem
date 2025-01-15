package ProducerConsumerSystem;

import java.util.LinkedList;

public class Company {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity;
    public Company(int capacity){
        this.capacity=capacity;
    }

    public synchronized void produce( int num) throws InterruptedException{
        if(list.size() == capacity){
            try{
                System.out.println("Full Waiting");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        notifyAll();
        list.add(num);
        System.out.println("produced.."+num);

    }

    public synchronized void consume() throws InterruptedException{
            if(list.isEmpty()){
                try{
                    System.out.println("Empty Waiting");
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            notifyAll();
            System.out.println("consumed..."+list.getFirst());
            list.removeFirst();
    }
}
