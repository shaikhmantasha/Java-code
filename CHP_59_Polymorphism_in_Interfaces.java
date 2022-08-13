


// interfaces dont have a body like system.out.println("Hello")
interface Mycamera1{
    void takeSnap(); // Function
    void takeVideo();
    // Private void greet(){ // when there are too many implementation
    //     System.out.println("Good morning");
    // }
    default void takeVideoIn4k(){ //when we forget to add an implement in the interface we can used defaul and directly write whatever we want
        // greet();
        System.out.println("Taking 4k videos..");
    }
}


 interface Mywifi1{
    String[] getNetwork();
    void connectToNetwork(String network);     // giving the name of the string 
 }

 class Cellpone{
    void callNumber(int phoneNumber){
        System.out.println("CALLING..." + phoneNumber);
    }
    void pickCall(){
        System.out.println("CONNECTING..");
    }
}

class MySmartPhone2 extends Cellpone implements Mycamera1,Mywifi1{

    public void takeSnap(){
        System.out.println("Taking snap.");
    }
    public void takeVideo(){
        System.out.println("taking video.");
    }

    public String[] getNetwork(){
        System.out.println("Getting list of network");
        String[] networkList = {"surelock5G" , "SHAIKH" , "MANTASHA786"};
        return networkList;

    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to" + network);
    }
}
public class CHP_59_Polymorphism_in_Interfaces{
    public static void main(String[] args) {

        //REFERNCE           //OBJECT
        //   |                   |
        Mycamera1 came = new MySmartPhone2(); //this is a smartphone but use it as a camera
        came.takeSnap();

        MySmartPhone2 S = new MySmartPhone2();//we can use all the smartphone methods
        S.pickCall();
        S.takeSnap();
        S.takeVideo();
        S.callNumber(76660);

    }
}