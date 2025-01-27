import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class IteratorOnHashSet{
    public static void main(String args[]){
        HashSet<String> cities=new HashSet<>(); //random order
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);

        LinkedHashSet<String> lhs=new LinkedHashSet<>(); //same order in output
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);

       TreeSet<String> ts=new TreeSet<>(); //Alphabetical order //sorted order //ascending order
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println(ts);
    }
}