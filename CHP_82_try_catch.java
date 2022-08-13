import java.util.Scanner;

public class CHP_82_try_catch {
public static void main(String[] args) {
    int [] marks = new int[3];
    marks[0] = 4;
    marks[1] = 6;
    marks[2] = 8;

    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    while(flag){
        System.out.println("enter the value of index");
        int ind = sc.nextInt();



        try {
            System.out.println("welcome to chapter number 82");
            try {

                System.out.println(marks[ind]);
                flag = false;  //the loop will run till it shows the exception error
                    
                } 
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("sorry this index does not exist");
                    System.out.println("exception in level 2");
                }
            }
            catch (Exception e){
                System.out.println("exception in level 1");
            }
        }
    }
}


