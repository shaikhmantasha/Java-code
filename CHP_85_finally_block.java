public class CHP_85_finally_block {
    public static int Greet1(){
        try {
            int a = 500;
            int b = 2;
            int c = a/b;
            return c;

        } catch (Exception e) {
            System.out.println(e);
        }
        finally{   // finally is used if you want to show the messages no matter what
            System.out.println("cleaning up resources");
        }
        return -1;
    }
    public static void main(String[] args) {
        Greet1(); //this ewill only show finalyy even tho the code is excuted
        int k = Greet1();  // this will show finally part as well as the above excuted code
        System.out.println(k);
    }
}
