class ERadiusException extends Exception{

@Override
public String toString(){
    return "there is am exception 1";
    }

@Override
public String getMessage(){
    return "there is am exception 2";
}
}


public class CHP_84_throw_throws {
    // Made by harry
    public static int divide(int a , int b) throws ERadiusException { // this is the warning that there is an error
        int result = a/b;
        return  result;
    }

    public static double area(int r)throws ERadiusException{   // throws makes it easy for the people that sees our code and helps them see that a particular line throw an error
        if(r<0){
            throw new ERadiusException();
        }
        
        double result = Math.PI * r *r;
        return result;
    }

    //NOTE : THROWS is accompanied by try and catch block
    //another example for the throws
    public static void main(String[] args) {
        // shivam uses harrys method divide
        // try{
        // int c = divide(2, 0);
        // System.out.println(c);
    // }
    //     catch(Exception e){
    //         System.out.println("exception");
    //     }


    // for example number 2

    try {
        double ra = area(-5);
        System.out.println(ra);
        
    } catch (Exception e) {
        System.out.println(e);
        }
    }
}
