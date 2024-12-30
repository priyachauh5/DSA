import java.util.ArrayList;
import java.util.Collections;
public class ArrayListOperation{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();

        //Add operation O(1)
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println("Original list is: "+list);
        Collections.sort(list); //Ascending order
        System.out.println("Ascending order list is: "+list);
        Collections.sort(list, Collections.reverseOrder()); //Descending order
        System.out.println("Descending oder list is: "+list);

    }
}
