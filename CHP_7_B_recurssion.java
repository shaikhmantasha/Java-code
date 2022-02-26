public class CHP_7_B_recurssion {
    // a function in java which can call itself such calling a function  by itself is called recursion
/** 
 -------RULES OF WRITING FACTORIAL 
 * factorial(0) = 1
 * factorial(n) = n * n-1 * ......1          will go from n to 1
 * factorial(5) = 5 x 4 x 3 x 2 x 1
 * factorial(n) formula = n * factorail(n-1)
**/

    // doing factorial by recurssive method

    static int factorial(int n){
        if(n==0  || n==1){
            return 1;
        }

        else{
            return n * factorial(n-1);
        }
    }

    static int factorail_iterative(int n){
        if(n==0  || n==1){
            return 1;
        }
        else{
            int product = 1;    // taking one because 1 se hi start hota hai factorial
            for(int i = 1 ; i<=n ; i++){         // here i=1 because factorial starts from 1
                product *= i;
            }
        return product;
    }

}

    
public static void main(String[] args) {
    int x = 4;
    System.out.println("the factorial of x is : " + factorial(x));
    int f = 4;
    System.out.println("the factorial using for loop : " + factorail_iterative(f));
    }
}