class Mythr3 extends Thread{
    public Mythr3(String name){
        super(name);
    }

    public void run(){
        while(true){
            System.out.println("i am a thread" + getName());
        }
    }
}
public class CHP_74_thread_priorities {
    public static void main(String[] args) {
        

        Mythr3 m1 =new Mythr3("1");
        Mythr3 m2 =new Mythr3("2");
        Mythr3 m3 =new Mythr3("3");
        Mythr3 m4 =new Mythr3("4");
        Mythr3 m5 =new Mythr3("5");
        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.MIN_PRIORITY); // THESE ARE THE THREE TYPES OF PRIORITIES
        m3.setPriority(Thread.NORM_PRIORITY);
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();

        
        
    }
}
