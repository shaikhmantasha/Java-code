import java.util.Scanner;

public class CHP_1_Practise_set {
    public static void main(String[] args) {
        //------------------------ QUESTION NO 1

        float a = 7/4.0f * 9/2.0f;  // associative law will be used as bith * and / has the same value
        System.out.println(a);


        // ------------------------ QUESTION 2
        // here we are using typrcasting

        char grade = 'a';
        grade = (char)(grade+8);   //this is typecasting in java 
        System.out.println(grade);

        //decoding the actual grade
        grade = (char)(grade-8);
        System.out.println(grade);
        

        // ------------------------ QUESTION 3
        //to check whether the enterd number is greater then the given number

        // Scanner sc = new Scanner(System.in);
        // int f = sc.nextInt();
        // System.out.println(f>8);


        // ------------------------ QUESTION 4
        // writing difficulot arithemetic equation
        int v = 2;
        int u = 3;
        int x = 5;
        int g = v*v - u*u  / 2*x*5;
        System.out.println(g);


        // ------------------------ QUESTION 4
        // int z = 7;
        int eq = 7*49/7 + 35/7;
        System.out.println(eq);
    }
}
