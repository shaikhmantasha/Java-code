class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }

    public void run(){
        int a = 748;
        System.out.println("thank you!!!!!!!");

        // while(true){
        //     System.out.println("i am a thread");
        // }
    }
}

class Myrunnable implements Runnable{
    public void run(){
        System.out.println("hello world");
        System.out.println("hello friends");
        System.out.println("whats app");
        
    }
}






public class CHP_72_constructor_from_thread {
public static void main(String[] args) {
    //Q4
    
    Myrunnable mrbullet = new Myrunnable();
    Thread gun2 = new Thread(mrbullet , "shaikh mantasha");
    gun2.start();

    System.out.println("the name of the gun is "+ gun2.getName());
    System.out.println("the ID of the gun is "+ gun2.getId());


//Q3
    Mythr t = new Mythr("muskan");
    Mythr t1 =new Mythr("mantasha");
    t.start();
    t1.start();
    System.out.println("the id1111 of the threat is " + t.getId());
    System.out.println("the 1111  of the threat is " + t.getName());
   
    System.out.println("the id2222 of the threat is " + t1.getId());
    System.out.println("the name 22222 of the threat is " + t1.getName());


}
}
