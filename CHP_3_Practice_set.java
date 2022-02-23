
import java.util.Scanner;

public class CHP_3_Practice_set {
    public static void main(String[] args) {
        
        //QUESTION 1
        
        // int a = 11;
        // if (a == 11){
        // System.out.println("im 11");
        // }
        // else{
        //     System.out.println("iM not 11");
        // }
    
        // QUESTION 2


        // byte marks1 , marks2 , marks3;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter marks 1: ");
        // marks1 = sc.nextByte(); 

        // System.out.println("Enter marks 1: ");
        // marks2 = sc.nextByte(); 

        // System.out.println("Enter marks 1: ");
        // marks3 = sc.nextByte(); 

        // float total = (marks1+marks2+marks3)/3.0f;
        // System.out.println(total);

        // if(total >= 40 && marks1 >= 33 && marks2 >= 33 && marks3 >= 33){

        //     System.out.println("you have been passed");
        // }
        // else{
        //     System.out.println("you have not been passed");
        // }

        // QUESTION 3
        //SKip

        //QUESTION NO 4

        // int day = 2;
        // switch(day){
        //     case 1 -> System.out.println("monday");
        //     case 2 -> System.out.println("tues");
        //     case 3 -> System.out.println("thrus");
        //     case 4 -> System.out.println("frid");
        // }

        // question 5
        
        Scanner sc = new Scanner(System.in);
        String check = sc.next();
        if (check.endsWith(".org")){
            System.out.println("this is an organization Website");
        }
        if (check.endsWith(".com")){
            System.out.println("this is a commercial website");
        }       
        if(check.endsWith(".in")){
            System.out.println("this is an indian website");
        }
    
    }

}
