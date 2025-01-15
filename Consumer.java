package ProducerConsumerSystem;

public class Consumer extends Thread {
    Company c;
    public Consumer(Company c){
        this.c=c;
    }
    public void run(){
        while(true){

            try{
                Thread.sleep(5000);
                c.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
