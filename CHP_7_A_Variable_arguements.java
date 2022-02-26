public class CHP_7_A_Variable_arguements {
    // when ww have to give multiple arguemnts

    // how to give arguemnts

    
    // if we cant a permenant value to be excuted
//                      | 
    // static int sum(int x , int ...arr){
    
    static int sum(int ...arr){
        int result = 0;
        for(int e : arr){
            result += e;
            
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println("the sum of 3 and 4 : " + sum(3,4));
        System.out.println("the sum of 3,4 and 4,5 : " + sum(3,4,4,5));
        System.out.println("the sum of 3,4,4 and 4,5,7 : " + sum(3,4,4,4,5,7));
        System.out.println("the sum of 3,1,2,4 and 4,7,8,9,6 : " + sum(3,1,2,4,4,7,8,9,6));

    }
}
