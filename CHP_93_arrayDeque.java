import java.util.ArrayDeque;

public class CHP_93_arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(5);
        ad1.add(34);
        ad1.add(45);
        ad1.add(56);
        ad1.addFirst(4);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        // for(int i =0; i<ad1.size();i++){
        //     System.out.println(ad1.getFirst(i));//throws 
        // }


    }
}
