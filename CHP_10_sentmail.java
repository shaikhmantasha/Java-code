

//--------------------------------  Dynamic Method Dispatch in Java
class Phone{
    public void showTime(){
        System.out.println("the time in smartphone is 8 AM");
    }
    public void on(){
        System.out.println("the phone is on.....");
    }
}

class Smartphone extends Phone{
    public void music(){
        System.out.println("playing music");
    }
    public void on(){
        //overriding the on one
        System.out.println("turning on smartPhone");
    }
}

public class CHP_10_sentmail {
    public static void main(String[] args) {
    // this is normal
        // Phone ph = new Phone();
        // ph.on();

    //  Dynamic Method Dispatch in Java


//  REFERENCE      OBJECT
//      |             |
    Phone ph = new Smartphone(); // will work
    // Smartphone sp = new Phone(); // this will throw an error
    // ph.music();     // throws an errror
    // ph.showTime();  
    ph.on();
    ph.showTime();


    // kaam wohi cheeze karegi jiska object bana rehta hai 


    //MANY QUESTIONS ARE ASKED ON THIS
}
}
