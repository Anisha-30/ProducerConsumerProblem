package ProducerConsumerSystem;

public class PCSMain {

    public static void main(String args[]){
        Company com = new Company(5);
        Producer producer = new Producer(com);
        Consumer consumer = new Consumer(com);

        producer.start();
        consumer.start();
    }
}
