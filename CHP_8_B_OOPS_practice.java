import javax.print.FlavorException;

// class Employee{
// //-------  PROBLEM NO 1  ----------------------
    
//     int salary;
//     String name;

//     public int getSalary(){
//         return salary;
//     }

//     public String getName(){
//         return name;
//     }

//     public void setName(String n){
//         name = n;
//     }
// }
//-----------  PROBLEM NO 2 ----------------------

// class cellphone{
//     public void ringing(){
//         System.out.println("Ringing.....");
//     }
//     public void vibrating(){
//         System.out.println("Vibrating.....");   
//     }
//     public void silentCall(){
//         System.out.println("silent call.....");
//     }
// }

//-----------  PROBLEM NO 3 ----------------------

// class Square{
//     int side;
//     public int area(){
//         return side * side;
//     }

//     public int perimerter(){
//         return 4*side;
//     }
// }

//-----------  PROBLEM NO 4 ----------------------

// class Rectangle{
//     int len;
//     int brt;

//     public int SquareRec(){
//         return len * brt;
//     }
//     public int periRec(){
//         return 2*(len+brt);
//     }
// }

//-----------  PROBLEM NO 5----------------------
// class ViceCity{
 

//     public void running(){
//         System.out.println("Running"); ;
//     }

//     public void hitting(){
//         System.out.println("Hitting"); ;
//     }

//     public void walking(){
//         System.out.println("Walking"); ;
//     }

//     public void talking(){
//         System.out.println("talking"); ;
//     }

// }

//-----------  PROBLEM NO 6----------------------

class Circle{
    float pi;
    int r;
public float area(){
    return pi*(r*r);
}
public float paraCir(){
    return 2*pi*r;
}

}

public class CHP_8_B_OOPS_practice {    
    public static void main(String[] args) {

//-------  PROBLEM NO 1  ----------------------

    // Employee muskan = new Employee();
    // muskan.setName("mantasha");
    // muskan.salary = 1200;
    // System.out.println(muskan.getSalary());
    // System.out.println(muskan.getName()); 
    
//-------  PROBLEM NO 2  ----------------------

// cellphone calls = new cellphone();
// calls.ringing();
// calls.vibrating();
// calls.silentCall();

//-------  PROBLEM NO 3 ----------------------

// Square sq = new Square();
// sq.side = 3;
// System.out.println(sq.area());
// System.out.println(sq.perimerter());

//-------  PROBLEM NO 4 ----------------------

// Rectangle rc = new Rectangle();
// rc.len = 2;
// rc.brt = 4;
// System.out.println(rc.SquareRec());
// System.out.println(rc.periRec());

//-----------  PROBLEM NO 5 ----------------------

// ViceCity game = new ViceCity();
// game.walking();
// game.running();
// game.talking();
// game.running();

//-----------  PROBLEM NO 6 ----------------------

Circle cr = new Circle();
cr.pi = 3.14f;
cr.r = 5;
System.out.println(cr.area());
System.out.println(cr.paraCir());




    }
}
