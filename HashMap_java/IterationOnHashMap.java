import java.util.HashMap;
import java.util.Set;

public class IterationOnHashMap{
    public static void main(String args[]){
        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);
        //random order

        //Iterate
        //hm.entrySet() //ti print all pairs
        Set<String> keys = hm.keySet(); 
        System.out.println(keys);

        for(String k: keys){
            System.out.println("Key= "+k+", value"+hm.get(k));
        }

    }
}