package ProducerConsumerSystem;

public class Producer extends Thread{
    int num;
    Company c;
    public Producer(Company c){
        this.c = c;
    }
    public void run(){
        num=1;
        while(true){
            try{
                Thread.sleep(1000);
                c.produce(num);
                Thread.yield();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num++;
        }
    }

}
