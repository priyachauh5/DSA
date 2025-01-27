import java.util.HashSet;
import java.util.*;

public class IteratorOnHashSet{
    public static void main(String args[]){
        HashSet<String> cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        Iterator it=cities.iterator(); //Stored in unorder
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-------------");

        for(String city: cities){ //Advance for loop in java
            System.out.println(city); //stored in ordered
        }
    }
}