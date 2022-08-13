class CHP_85_finally_block2{
    public static void main(String[] args) {

        // now if we want to excute the finally even after the loop is broken
        int a = 5;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            
            finally{
                System.out.println("i am finally the value of " + b);   // since this is in a loop
            }
            b--;
    }
            // we can also write finally with try

     
        // try{
        //     int g = 2;
        //     int f = 4;
        //     int c = f+g;
        // }
        // finally{
        
        //     System.out.println("excution is must no matter what" + c);    
        }
    }
