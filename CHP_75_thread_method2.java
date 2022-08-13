class Thread11 extends Thread{
    public void run(){
        
        int f= 0;
        while(true){
            System.out.println("muskan");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            f++;
        }
    }
}

class Thread22 extends Thread{
    public void run(){
        while(true){
            System.out.println("shaikh mantasha 222");
        }
    }
}


public class CHP_75_thread_method2 {
    public static void main(String[] args) {
        Thread11 t1 = new Thread11();
        Thread22 t2 =new Thread22();

        t1.start(); 
        t2.start();

    }
}

