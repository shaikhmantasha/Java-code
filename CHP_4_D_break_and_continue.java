public class CHP_4_D_break_and_continue {
    public static void main(String[] args) {
// -----------break for FOR loops


        // for(int i = 0 ; i<10 ; i++){
        //     System.out.println(i);
        //     System.out.println("Java is great");
        //     if (i==5){
        //         System.out.println("ending the lloops");
        //         break;
        //     }
        // }


// -----------break for while loop


        // int i = 0;
        // while(i<7){
        //     System.out.println(i);
        //     System.out.println("Java is great");
        // if (i == 4){
        //     System.out.println("ending the loops");
        //     break;
        // }
        // i++;
        // }
        // System.out.println("the ending line is this");



// -----------break for DO - while loop

            
        // int i = 0;
        // do{
        //     System.out.println(i);
        //     System.out.println("Java is great");
        // if (i == 4){
        //     System.out.println("ending the loops");
        //     break;
        // }
        // i++;
        // }while(i<7);
        
        // System.out.println("the ending line is this");
        
    


//  CONTINUE IN LOOPS
// continue will skip the part where it is written and will carry with the next iteration

        // for(int k = 0 ; k<10 ; k++){
        //     //this will skip 7 and move on with the next iteration

        //     if (k==7){
        //         System.out.println("ending the lloops");
        //         continue;
        //     }
        //     System.out.println(k);
        //     System.out.println("Java is great");
        // }



//  CONTINUE IN DO while


        int i = 0;
        do{
            i++;
            
        if (i == 2){
            System.out.println("ending cause continue is on 2");
            continue;
        }
            System.out.println(i);
            System.out.println("Java is great");

        }while(i<4); 
        System.out.println("the ending line is this");


    }
}


