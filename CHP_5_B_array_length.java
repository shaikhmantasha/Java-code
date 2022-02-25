import javax.lang.model.element.Element;

public class CHP_5_B_array_length {

    public static void main(String[] args) {
        // how to find the length of an array

        // int [] array = {20,10,30,5,50,60};
        // System.out.println(array.length);

        // // for float

        // float [] marks = {20.1f,30.2f,50.0f,20.16f,50.13f,21.3f};
        // System.out.println(marks[2]);
        // System.out.println(marks.length);

        // // for string

        // String [] names = {"shiakh" , "usamn" , "manyasa" , "musakn"};
        // System.out.println(names.length);
        // System.out.println(names[2]);
    
    //----------------------------- how to show full array or displaying an array

        
        // int [] marks = {20,23,35,65,89,54};
        // for(int i=0 ; i<marks.length ; i++){
        //     System.out.println(marks[i]); // array transversal
        // }

        // how to print an array in reverse

        int [] ultamarks = {10,20,30,40,50,60};
        // for(int i=ultamarks.length-1; i>=0 ; i--){
            // System.out.println(ultamarks[i]);
        
        // }

        //FOR EACH LOOP
        // displating the arrow using for each loop

//--------------easiest way of displying an array

        for (int Element : ultamarks){
            System.out.println(Element);
        }
 // --------------for string
 
        String [] names = {"ammi" , "abba"  , "me" , "myself"};
        for (String Element : names){
            System.out.println(Element);
        }
    
    }
}
