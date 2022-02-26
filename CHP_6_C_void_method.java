public class CHP_6_C_void_method {
    static void whatitdoes(){
        System.out.println("this only prints when called, and does not returns anything");
    }
    
    static void change(int a){

        a = 98;
    }

    static void change1(int [] arr){
        arr[0] = 55; 
    }
    public static void main(String[] args) {
        // CALLING A VOID METHOD
        whatitdoes();

        // NOW WILL SEE IF WE CAN CHANGE THE NUMBER WRITTEN ABOVE MAIN METHOD
        // CHANGING THE INTEGER
        int x = 78;
        change(x);
        System.out.println("the value of X after changing : " + x);

        // now will check if the value in the array will change

        int [] anyname = {1,2,3,4,5,6,7}; 
        change1(anyname);
        System.out.println(anyname[0]);




    }
    
}
