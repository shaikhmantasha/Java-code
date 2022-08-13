import java.util.HashSet;

public class CHP_94_hashset {
public static void main(String[] args) {
    HashSet<Integer> hs = new HashSet<>(5 , 0.5f);
    hs.add(5);
    hs.add(45);
    hs.add(65);
    hs.add(34);
    
    hs.add(34);
    System.out.println(hs);
    


}
}
