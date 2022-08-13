import java.util.Scanner;

public class CHP_85_problem_set {
    public static void main(String[] args) {
    // // question 2
    //     try{
    //     int a = 666/0;
    //     System.out.println(a);
    //     }
    //     catch(ArithmeticException e){
    //         System.out.println("haha");
    //     }
    //     catch(IllegalArgumentException e){
    //         System.out.println("hehe");
    //     }
    
    // question 3

        boolean flag = true;
        int marks[] = new int[3];
        marks[0] = 45;
        marks[1] = 5;
        marks[2] = 125;
        System.out.println("enter the value of index: ");
        Scanner sc = new Scanner(System.in);

        int index;
        int i= 0 ;
        while (flag && i<5){
            try{
                index = sc.nextInt();
                System.out.println("the value of marks[index] is " + marks[index]);
            }
            catch(Exception e){
                System.out.println("Invalid");
                i++;
            }
        }
        if(i<=5){
            System.out.println("maximum limit reached");
        }
        

    
    }

}
