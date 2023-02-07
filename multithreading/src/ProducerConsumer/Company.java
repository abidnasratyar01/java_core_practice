package ProducerConsumer;

public class Company {
    int n; //product
    boolean f=false;
    // f: fales : chance producer
    synchronized public void produce_item(int n) throws Exception {
        if (f) {
            wait();
        }
        this.n = n;
        f = true;
        System.out.println("Producd: "+ this.n);
        notify();
    }

    synchronized public int consume_item() throws Exception {
        if(!f) {
            wait();
        }
        System.out.println("Consumed:"+this.n);
        f = false;
        notify();
        return this.n;
    }
}
