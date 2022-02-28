import java.util.Scanner;

public class CHP_7_practice_set {

//------------------------------------ Question no 1
    
    // static void multiplication(int n){
    //     for(int i=1; i<=10 ;i++){
    //         System.out.format("%d X %d = %d\n" , n , i , n*i);
    //     }
    // }
//------------------------------------ Question no 2

// creating pattern 
// static void pattern(int n){
//     for(int i = 0 ; i<n ; i++){
//         for(int j = 0 ; j<i+1 ; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// 
//------------------------------------ Question no 3

    //finding the sum of given n number using recursive method
/**

getting the formula (yeh meko nahi samjha isle necche wale se sammjh jaega) 

sum(n) = 1 + 2 + 3 + 4 + 5.....n
sum(n) = 1 + 2 + 3 + 4 + (n-1) ...n
sum(n) =  n  + sum(n-1) 

HOW DID WE FIND THIS n * sumrec(n-1)

suppose we are taking sum 3
sum(3) = 3 + (3-1)
         3 + sum(2-1)
sum(3) = 3 + 2 + sum(1)
         3 + 2 + 1

**/ 


//------------------------------------ Question no 4



        // int n = 4;              //because we have to print 4 lines
        // for(int i=n;i>0;i--){
        //     for (int j=0 ; j<i ; j++){
        //     System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }



//------------------------------------ Question no 5

// getting the index of nth number
// 0 1 1 2 3 5 8 13


        // static int sumrec(int n){
        //     if (n == 1){
        //         return 1;
        //     }
        //     else{
        //         return n * sumrec(n-1);
        //     }
    
        // }
    
        // static int fibon(int n){
        //     if(n == 1){
        //         return 0;
        //     }
        //     else if(n==2){
        //         return 1;
                
        //     }
        //     else{
        //         return fibon(n-1)+ fibon(n-2);
        //     }
    
        // }

//------------------------------------ Question no 6
//finding the avareage of the numrbers passed as arguments(varagrs)

// static int marks(int ...num){
//     int result = 0;
//     int len = num.length;

//     for(int e : num){
//         result += e;
        
//     }
//     int c = result / len;
//     return c;
    
// }

//------------------------------------ Question no 9
// printing  star using recurssion

static void rec_1(int n){                                                                                                              
    if (n>0){
        rec_1(n-1);
    }
    for(int i = 0 ; i < n ; i++){
        System.out.print("*");
    }
    System.out.println();
}

//- ----------------------------------- Question no 10
// converting celcius into farenheit
// formula = (i°C × 9/5) + 32
// BELOW MAIN FUNCTION




    
public static void main(String[] args) {
    // multiplication(7);
    // pattern(5);
    // int c =  sumrec(5);
    // System.out.println(c);
    // int a = fibon(4);
    // System.out.println(a);
    // System.out.println(marks(2,3,4,5));
    // rec_1(5);


//- ----------------------------------- Question no 10


    Scanner sc = new Scanner(System.in);
    System.out.println("ENter the tempreture to be converted");
    float input = sc.nextFloat();
    float convert = ((input * 9/5) + 32);
    System.out.println(convert);

    // (i°C × 9/5) + 32
//- ----------------------------------- Question no 11
// question 3 using iterative method

    int n = 5;
    int total = 0;
    for(int i =1 ; i<=n ; i++){
        total += i;
    }
    System.out.println(total);

}   
}


