import java.util.Scanner;

public class CHP_1_G_CBSE {
    public static void main(String[] args) {
        System.out.println("FIND THE PERCENTAGE!");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ENGLSIH MARKS : ");
        int english = sc.nextInt();
        System.out.println("ENTER HINDI MARKS : ");
        int hindi = sc.nextInt();
        System.out.println("ENTER MATHS MARKS : ");
        int maths = sc.nextInt();
        float total = ((english + hindi + maths) / 300.0f)*100;
        System.out.println(total); 
    }
}
