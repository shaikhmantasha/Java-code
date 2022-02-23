
public class CHP_1_D_operators {
    public static void main(String[] args) {
        
        // a            +           b       =     4
    // operand      operator    operand         results

    int a = 5;
    a += 3;
    System.out.println(a);

    // ALL THE OTHER TYPES OF OPERATOR YOU KNOW 
    // + , = , * , %

    //------------------------ TO FIND THE MODULO

    int b = 12;
    int c = 2 ;
    System.out.println(b % c);

    //------------------------ comparison OPAERATORS

    System.out.println(4 > 8);


    //------------------------ LOGICAL OPAERATORS

    System.out.println(4>5 && 6>32);   // for this both the conditions needs to be true
    System.out.println(6>5 || 50>32);

    //------------------------ Bit wise OPAERATORS

    //   1 0    = 2    using & opertors   - where both true is true but one false is false
    //   1 1    = 3
    //  ------
    //   1 0    = 2
    // the code for the above explaination is given below

    System.out.println(5|8);
    

    }
}
