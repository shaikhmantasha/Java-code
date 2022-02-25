public class CHP_5_A_Array {
    public static void main(String[] args) {
        // how to create an array
        //creating an array of 500 studemds


// there are three ways of creating an array in java

//------(NO 1) declaration and memory allocation
// int [] marks =  new int[5];

//------(NO 2) declaration and then memory allocation

    int [] marks;
    marks = new int[5];
    // initialization
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;


        System.out.println(marks[2]);
    
    //declaration ,memory allocation and initiallization altogether

    int [] number = {20,45,545,32,32};
    System.out.println(number[2]);
    
    }
}
