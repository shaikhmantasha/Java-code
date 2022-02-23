public class CHP_3_B_Logical_Conditionals {
    public static void main(String[] args) {

    // ----------LOGICAL OPERATORS

    
    //----- AND OPERATORS -- if both are true then only true warna false
    boolean a = true;
    boolean b = false;

    if (a && b){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }


    //------ OR OPERATORS ---   atleast one value should be true
    boolean c = true;
    boolean d = false;
    if (c || d){
        System.out.println("Yes C");
    }
    else{
        System.out.println("NO C");
    }

    // --------------NOT OPERATORS
    // inverts the given value

    boolean value = true;
    boolean value2 = false;
    System.out.println(!value);
    System.out.println(!value2);
    }
}
