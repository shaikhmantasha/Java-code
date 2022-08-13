class Thread1 extends Thread{
    public void run(){
        int f= 0;
        while(f<400){
            System.out.println("muskan");
            f++;
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        int f = 0;
        while(f < 400){
            System.out.println("shaikh mantasha 222");
            f++;
        }
    }
}


public class CHP_75_thread_method {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 =new Thread2();
// now if we want to start the t2 only after finishing thw work of t1 than we hava to use the method for threads t1.join
        t1.start(); 

        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();

    }
}
