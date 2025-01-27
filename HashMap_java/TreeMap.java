import java.util.HashMap;
import java.util.TreeMap;

public class HashMaps{
    public static void main(String args[]){

        TreeMap<String, Integer> tm=new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("US",50);

        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        System.out.println("HashMap= "+hm); //Random
        System.out.println("TreeMap= "+tm); //output is displayed as order of Key sorting
    }
}