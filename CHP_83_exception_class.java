import java.util.Scanner;

class Myexception extends Exception{

@Override
public String toString(){
    return "i am Tostring ()";
}

@Override
public String getMessage(){
    return "i am getmessage()";
}
}

//you can create your custom exceptions

class MaxageException extends Exception{
@Override
public String toString(){
    return "age cannot be greatee then 125";
}

@Override
public String getMessage(){
    return "make sure youve entered the correct age";
}
}



public class CHP_83_exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if(a < 9){
            try{
                // throw new Myexception();  // we can do any other exception as well
                throw new ArithmeticException("this is an exception");
            }

            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.getStackTrace();  // this will look like an error but is not an error
                System.out.println("fininshed");
            }
        System.out.println("finally finished");
        }

    }
    
}
