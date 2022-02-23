public class CHP_1_E_Operator_Associativity{
    public static void main(String[] args) {

        //precedence and associative 

        int a = 3*2-8/4;
        /*
        highest precendency goes to * and / . they are then evaluate ont the basis on left to right associativity.

        =6-8/4
        =6-2
        =4
        
        */

        int b = 8/4-3*2;

        /*
        =2-3*2
        =2-6
        =-4
*/
        System.out.println(a);
        System.out.println(b);

        //QUICK QUIZZZ

        // how to write difficult arithemethic equation usinf precendency 

        // 1
        int x = 1;
        int y = 2 ; 
        int u = x * y/2;
        System.out.println(u);


        
        //2
        int s = 2;
        int t = 4;
        int r = 8;
        int p = s*s - (4*t*r) / (2*r); // whatever is in the bracket will be exacute first and then the rest 
        System.out.println(p);



        // for more information about associationa and precendency and the REFERING TABLE go to  (7:14)  **https://www.youtube.com/watch?v=vh16INx13h4&list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&index=9&t=1s&ab_channel=CodeWithHarry**

    }

}