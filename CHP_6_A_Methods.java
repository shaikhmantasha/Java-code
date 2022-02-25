public class CHP_6_A_Methods { // static is only used above static
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
        // a method is also called a function and vice verca

        int x = 12;
        int y = 5;
        int z;
        z = logic(x, y);
        System.out.println(z);
    }
}
