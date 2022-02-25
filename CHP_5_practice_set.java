import java.lang.Math;


public class CHP_5_practice_set {
    public static void main(String[] args) {

        // ----QUESTION NO 1
        // int [] add = {10 ,10 , 20 , 30};
        // int adds = 0;
        // for(int element : add){
        // adds += element;
        // // System.out.println(adds);
        // }
        // System.out.println(adds);

        // ----QUESTION NO 2

        // ----------MY WAY---------

        // int [] add = {10 ,10 ,12 , 20 , 30 , 12};
        // int a = 12;

        // for(int element : add){
        // if(a == element){
        // System.out.println("a is presrnt");
        // }
        // else{
        // System.out.println("not present");
        // }
        // }

        // ----------HARRRYS WAY---------
        // int [] add = {10 ,10 ,12 , 20 , 30 , 12};
        // int a = 12;
        // boolean ispresent = false;
        //
        // for(int element : add){
        // if (a == element){
        // ispresent = true;
        // break;
        // }
        // }
        // if(ispresent){
        // System.out.println("the word is present");
        // }
        // else{
        // System.out.println("the word is not present");
        //
        //
        // }
        // }
        //

        // ----QUESTION NO 3

        // int [] marks = {10,25,31,24,52,14};
        // int length = marks.length;
        // int add = 0;
        // for(int element : marks){
        // add += element;
        // }

        // System.out.println(add/length);

        // ----QUESTION NO 4

//         int[][] mat1 = { { 1, 2, 3 },
//                           { 4, 5, 6 } };
//         int[][] mat2 = { { 2, 3, 5 },
//                           { 8, 4, 2 } };
//         int[][] result = { { 0, 0, 0 },
//                         { 0, 0, 0 } };

//         // this is just for the understanding how indexing in matrix work

//         for (int i = 0; i < mat1.length; i++) { // row number of times
//             for (int j = 0; j < mat1[i].length; j++) { // column number of times
//                 System.out.format("i = %d and j = %d\n", i, j);
//                 result[i][j] = mat1[i][j] + mat2[i][j];
//                 System.out.println(result[i][j]);
//             }
//         }
// //         printing the element of a 2-D array
//         for (int i = 0; i < mat1.length; i++) { // row number of times
//         for (int j = 0; j < mat1[i].length; j++){
//         System.out.print(result[i][j]+ " ");
//         result[i][j] = mat1[i][j] + mat2[i][j];
//         }
//         System.out.println(""); //only prints a new line 
//     }


        // -------------------------QUESTION NO 5
        // how to reverse a string
// 
        // int [] arr = {1,2,3,4,5,6};
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // int temp;
        // for(int i = 0 ; i<n ; i++){
                // swap arr[i] and arr[a-i-1]
                // a     b     temp
                // |4|   |3|     | |
                // temp = arr[i];
                // arr[i] = arr[l-i-1];
                // arr[l-i-1] = temp;
// 
        //  }
        //  for (int Element : arr){
                //  System.out.print(Element + " ");
        //  }
// 

//-------------------------QUESTION NO 6

// how to find the maximum element in an arr

        // int [] arr = {1,200,3,4,5,6};
        // int max =0;
        // for(int Element : arr ){
        //         if(Element>max){
        //                 max = Element;
        //         }
        // }
        // System.out.println(max);
        
//-------------------------QUESTION NO 7

        // int [] arr1 = {1,200,3,4,5,6};
        // int min = Integer.MAX_VALUE;
        // for(int element :arr1){
                // 
                // if(element < min){
                        // element = min;
                // }
        // } 
        // System.out.println(min);

//-------------------------QUESTION NO 8
// if the string is sorted is not   


        int [] arr = {1,2,3,4,5,6};
        boolean issorted = true;
        for (int i =0 ;i < arr.length-1 ; i++){
                if(arr[i] > arr[i+1]){
                        issorted = false;
                        break; 
                }
        }
        if(issorted){
                System.out.println("the array is sorted");
        }
        else{
                System.out.println("the array is array not sorted");
        }











































         

}
}
