
import java.util.Scanner;
public class CHP_2_A_strings {
    public static void main(String[] args) {

        // STRING IS A CLASS AND THE NEW STRING CREATES AN OBJECT
        // STRINGS ARE IMMUTABLE AND CANNOT BE CHANGED
        // String name = new String("shaikh");   
        // System.out.println(name);

        // System.out.print("the name is ");
        // System.out.print(name);

        int a = 8;
        Float b = 0.2123f;
         
        //these are the types on how you can write strings
        System.out.printf("the integer value is %d and the float value is %f",a ,b);   
        System.out.format("the integer value is %d and the float value is %f" , a , b); // format is same as printf

        System.out.printf("the integer value is %d and the float value is %8.2f ",a ,b);  /* %8 will take the spaces including the decimal numbers 
                                                                                                and 2f is that only 2 decimal will be taken in count */  

    

        
        /*
        THESE ARE FORMAT SPECIFIER
        %d = for integer
        %f = float
        %c = for char
        %s = for string
        */

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);




        
    }
}
