import javax.swing.plaf.synth.SynthSpinnerUI;

public class CHP_1_F_Types_of_operators{
    public static void main(String[] args) {
        // here to check whether when two values which are int and int when evaluated the result will be integer as well
        // if the float and int are evaluated then the result will be in float
        // FOR VIDEO REFRENCE GO TO VIDEO 10 (3:50)

        
        int a = 2;
        float b = 25.2f;
        System.out.println(a + b);


        //-----------------INCREMENT AND DECREMENT OPERATORS
        // i++  = this will first use the value and then increment it

        int p = 2;
        System.out.println(p++);
        System.out.println(p);

        // ++i  = this will first increment the value and then use it

        int k = 3;
        System.out.println(++k);
        System.out.println(k);

        // QUICK QUIZZZ


        int s = 2;
        int q = 3;
        System.out.println(++s * q);

        //HOW IT WORKS ON CHARACTER

        char l = 'a';
        l++;
        System.out.println(l);


    }
}
