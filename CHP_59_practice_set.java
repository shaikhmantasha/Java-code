
// QUESTION 1
abstract class Pen{
    abstract void write();
    abstract void refill();
}
//QUESTION 2

class FountainPen extends Pen{
    void write(){
        System.out.println("WRITE");
    }
    void refill(){
        System.out.println("REFILL");
    }
    void changeNib(){
        System.out.println("changing the NIB");
    } 
}
 // QUESTION 3
class Monkey{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("biting");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("speaking");
    }
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }

}
// Q4
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class Smartphonee extends Telephone{

    void ring(){
        System.out.println("ringing");
    };
    void lift(){
        System.out.println("Lifting");
    };
    void disconnect(){
        System.out.println("disconneting");
    }
    void video(){
        System.out.println("taking vidoes");
    }
    void songs(){
        System.out.println("listening songs");
    }
    void editing(){
        System.out.println("editing photots and videos");
    }
}

//Q6

interface TvRemote{
    void volumeUp();
    void changeChannel();
}

interface smartTvRemote extends TvRemote{
    void hasPointer();
    void turnOff();
    void Youtube();
}

class NewtvR implements smartTvRemote{
    public void hasPointer(){
        System.out.println("point on the cursor");
    } 
    public void turnOff(){
        System.out.println("turn off the tv");
    } 
    public void Youtube(){
        System.out.println("open the youtube");
    } 
    public void volumeUp(){
        System.out.println("increase the volume");
    } 
    public void changeChannel(){
        System.out.println("change the channel");
    }
}
public class CHP_59_practice_set {
    public static void main(String[] args) {

        NewtvR newtv = new NewtvR();
        newtv.Youtube();


        Telephone tele = new Smartphonee(); //smart phone ko telephone bana diya
        tele.disconnect();
        // tele.songs(); //throws error
        tele.ring();

        FountainPen pens = new FountainPen();
        pens.changeNib();
        pens.refill();
        pens.write();

        //Q3
        Human hm = new Human();
        hm.sleep();
        hm.eat();
        hm.jump();

        //Q5
        Monkey man = new Human(); // insaan ko bandar bana de rahe hai aur woh bandar jasii hi harkat karega
        man.bite();
        //man.speak();-------> // could not speak because the method is monkey which does not have speak method

        BasicAnimal rabbit = new Human(); // insaan ko hum rabbit bana rahe hai aur woh wohi cheeze kar sakta hai jo rabbit karta hai
        rabbit.eat();
        rabbit.sleep();
        //rabbit.speak(); ---->// thrwos an error because rabbit dont speak
   
    
    }
}
