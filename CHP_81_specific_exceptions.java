import java.util.Scanner;

public class CHP_81_specific_exceptions {
    public static void main(String[] args) {
        
        int [] marks = new int[3];
        marks[0] = 4;
        marks[1] = 6;
        marks[2] = 8;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index");
        int index = sc.nextInt();

        System.out.println("enter the value of the number you want to divide with");
        int number = sc.nextInt();

        try {     
            System.out.println("the value of the array index entered is " + marks[index]);
            System.out.println("after dividing array index with the value " + marks[index]/number);
        }
        catch (ArithmeticException e) {
            System.out.println("the error is arithmetic");
            System.out.println(e);
        
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("the error is out of index");
            System.out.println(e);
        
        }
        catch (Exception e) {
            System.out.println("some other error occured");
            System.out.println(e);
        
        }
    }
}
