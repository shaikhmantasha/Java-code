public class CHP_80_try_catch {
    public static void main(String[] args) {
        int a = 600;
        int b = 0;
        // int c = a/b;

        //without try and catch
        // System.out.println(c); // throws arithmetic error

        // with try and catch

        try {
            int c1 = a/b;
            System.out.println("the division is : " + c1);           
        } 

        catch (Exception e) {
        System.out.println("could not run, Error is: ");
        System.out.println(e);
        }
        
        System.out.println("End of the program");
    }
}
