package rns;
import java.util.Hashtable;
import java.util.Map;
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String > ht = new Hashtable<>();
        ht.put(106, "Bharadwaj");
        ht.put(117, "Mohith");
        ht.put(128, "Srinivasa");
        ht.put(102, "Nagaraj");
        ht.put(100, "Mala");
        for(Map.Entry hm : ht.entrySet()){
            System.out.println(hm.getKey() + " " + hm.getValue());
        }
    }
}
