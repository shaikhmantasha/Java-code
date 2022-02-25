public class CHP_6_B_Object_creation {
    // how to call a method without(static method)
    

    static int logic(int a , int b){    // if there is no (static) return then we cannot call it below 
        int z;
        if (a>b){
            z = a+b;
        }
    else{
        z = (a+b)*3;
        }
    return z;
    }
    
    public static void main(String[] args) {
        //method invocation using object creation
        int x = 10;
        int y = 20;
        int c;


        // first create an object
        CHP_6_B_Object_creation obj = new  CHP_6_B_Object_creation();
        
        // then call the object created
        c = obj.logic(x, y);
        System.out.println(c); 

    }    
}


