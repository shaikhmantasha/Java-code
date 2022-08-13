
interface Bicycle{
    int a = 45;
    void applyBrake(int decreament);
    void speedUp(int increament);
}

interface HornBicycle{
    void blowhornHP();
    void blowhornNarnia();
}

class AvonCycle implements Bicycle,HornBicycle{
    void blowhorn(){
        System.out.println("pee pee poo poo"); // this is the methd that is not present in the implement section
    }

    public void applyBrake(int decreament){   //before implementing a method it is compulsory to add PUBLIC 
        System.out.println("applying brake");
    }

    public void speedUp(int increament){
        System.out.println("speed is up");
    }

    public void blowhornHP(){
        System.out.println("mai hooon na pepepeppee");
    }
    
    public void blowhornNarnia(){
        System.out.println("manananaanaa");
    }
}

public class CHP_55_Ep_interfaces {
    public static void main(String[] args) {

        AvonCycle harycycle = new AvonCycle();
        // harycycle.applyBrake(1);
        // you can create properties in interface

        // System.out.println(cycle.a);
        // int a = 455;  //thgrows an wrror as the value is fixed and cannot be changed

        harycycle.blowhornHP();
        harycycle.blowhornNarnia();
        } 
    }   

