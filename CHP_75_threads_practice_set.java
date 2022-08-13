

class Practice1 extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}
class Practice2 extends Thread{
    // public void run(){
    //     //Q 2 adding sleep method to welcome
    //     // while(true){

    //     // try{
    //     //     Thread.sleep(200);
    //     // }
    //     // catch(Exception e){
    //     //     System.out.println(e);
    //     // }

    //         System.out.println("Welcome");
    //     }
    }



public class CHP_75_threads_practice_set {
    public static void main(String[] args) {
        Practice1 p1 = new Practice1();
        Practice2 p2 = new Practice2();

        //Q3  GETTING PRIORITY 
        
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        // if we dont set the peiority then this will show the deafult priority
        System.out.println(p1.getPriority());

        // Q4 GET STATE 
        System.out.println(p2.getState()); // this is the new state
        // p1.start();
        p2.start();
        System.out.println(p2.getState()); // this will give the runnable state

        //QUESTION 5
        //getting the reference of the current thread in java

        System.out.println(Thread.currentThread().getState());
    
    }
}
