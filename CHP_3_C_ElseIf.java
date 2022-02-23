import java.util.Scanner;
public class CHP_3_C_ElseIf {
    public static void main(String[] args) {
        
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age>90){
            System.out.println("age greater then 90");
        }
        else if(age > 50){
            System.out.println("age is greater then 50");
        }
        else if(age>40){
            System.out.println("age is greater then 40");
        }
        else{
            System.out.println("age is less then everything");
        }


    }
}
