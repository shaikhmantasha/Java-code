class MyThreatRunnable implements Runnable{
    public void run(){
    int a = 0;
    while(a < 400){
        System.out.println("i am threat 1111111");
        a++;
        }
    }
}

class MyThreatRunnable2 implements Runnable{
    public void run(){
    int a = 0;
    while(a < 400){
        System.out.println("i am threat 2222222222");
        a++;
        }
    }
}

public class CHP_71_runnable {
    public static void main(String[] args) {
        // for the runnable we need to put the bullet in the gun
        MyThreatRunnable bullet1 = new MyThreatRunnable();
        Thread gun1 = new Thread(bullet1);
        
        MyThreatRunnable2 bullet2 = new MyThreatRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
