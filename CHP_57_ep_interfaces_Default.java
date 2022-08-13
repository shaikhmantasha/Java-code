


// interfaces dont have a body like system.out.println("Hello")
interface Mycamera{
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


 interface Mywifi{
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

class MySmartPhone extends Cellpone implements Mycamera,Mywifi{

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
public class CHP_57_ep_interfaces_Default {

    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();
        ms.takeVideoIn4k();
        String[] ar = ms.getNetwork();
        for (String item : ar) {
            System.out.println(item);            
        }
    }
}
 //-------------------------------------------------------------------------------------------------------------------------x
