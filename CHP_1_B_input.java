import java.util.Scanner;
public class CHP_1_B_input {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter new number : ");
        int a = sc.nextInt();
        System.out.println("Enter number 1 : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum is :"  + sum);


        // HOW TO KNOW IF THE INTEGER NUMBER IS INTEGER OR NOT

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        
        // **Next()** Will print only the first letter of the program

        String str = sc.next();
        System.out.println(str);

        // ** Nextline() ** will print the whole sentence 

        String man = sc.nextLine();
        System.out.println(man);
    }
    
}
