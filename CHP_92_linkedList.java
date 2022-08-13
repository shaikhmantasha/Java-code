import java.util.*;.*;
public class CHP_92_linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(4566);
        l2.add(6996);
        l2.add(6566);
        l1.add(1);
        l1.add(1);
        l1.add(1);
        l1.add(45);
        l1.add(56);
        l1.add(64);
        l1.add(0,55);
        l1.add(5,869);
        l1.addAll(0 , l2);  // will add all the elements of L1 from the 0th index
        // l1.clear(); // will clear everything
        System.out.println(l1.contains(45));  // if it contains then it will show true otherwise false
        System.out.println(l1.indexOf(22));  // this will show the index of the given number
        l1.set(1, 566);  //we want to add 566 on the 1st index
        System.out.println(l1.lastIndexOf(1));
        System.out.println(l1.remove(5));

//****************************** methods that are only there in linked list and not array list
l1.addFirst(1);
l1.lastIndexOf(45);


        for(int i=0 ; i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}
