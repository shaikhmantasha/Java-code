public class CHP_6_D_method_overloading {
//two or more mthods can have name but different parameters such methid are called as overloading method

     static void foo(){
        System.out.println("this only prints");
    }

     static void foo(int a){
         System.out.println("this prints int " + a);
     } 

     static void foo(int a , int b){
         System.out.println("prints both number with different parameter" + a + b);
     }
    
    // method overloadint cannot be done by changing return type
    /**
    static int foo(int a , int b , int c){
        System.out.println("this will throw an error");
     **/
    

    
    public static void main(String[] args) {
        foo();
        foo(2000);
        foo(1000 , 7888);           // ARGUEMENTS ARE ACTUAL VALUE!

    }
}
