// import javafx.scene.Parent;

// public class CHP_11_abstract_method {

//       /** 
//         abstract method ek khayali pulao hai jabtak ke woh concrete mtlb implement na hojaye 

//         ek single absract method saare method ko abstract bana deta hai
//         jaise ek gandi machli saari talaab ko ganda kkar deti hai
//         **/

//         /*
//         class Parent{       //brfore abstrsact mehtod
        
//         after abstract method (down)
//         */



// abstract class Parent{
//     public Parent(){
//         System.out.println("mai parent ka constructor hu");
//     }
//     public void sayHello(){
//         System.out.println("hello");
//     }

//     abstract public void greet();
//     abstract public void greet2();
//     }


// class Child extends Parent{
//     @Override
//     public void greet(){
//         System.out.println("good morning");
//     }
    
//     public void greet2(){
//         System.out.println("good afternoon");
//     }
// }
// /** this one is not valid as it is not included in the abstract class**/
// class Child2 extends Parent{
//     public void th(){
//         System.out.println("this will not work because it is not included in the abstract class (TH)");
//     }
// }



//     public static void main(String[] args) {
//         Parent p = new Parent();
//         Child c = new Child();
      
        

//     }
// }
