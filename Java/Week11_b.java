class Week11_b{
    public static void main(String... args){
        Example ex = new Example();
        Synch t1 = new Synch(ex);
        Synch t2 = new Synch(ex);
        Synch t3 = new Synch(ex);
        System.out.println("Threads Before Synchronized :");
        t1.start();t2.start();t3.start();
    } 
}

class Example {
    void display(){
        for(int i= 0 ; i < 5 ; i++){
           System.out.println(Thread.currentThread().getName()+" - "+i);
           try{Thread.sleep(2000);}catch(Exception e){}
        }
        synchronized(this){
        System.out.println("Threads after Synchronized :"+Thread.currentThread().getName());
            for(int i= 0 ; i < 5 ; i++){
           System.out.println(Thread.currentThread().getName()+" - "+i);
           try{Thread.sleep(2000);}catch(Exception e){}
        }}

        
    }
}

class Synch extends Thread{
    Example e;
    Synch(Example ex){
        this.e = ex;
    }
    public void run(){
        e.display();
    }
}