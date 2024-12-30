import java.util.ArrayList;
public class ArrayListOperation{
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        System.out.print("Swapped list is: "+list);
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();

        //Add operation O(1)
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println("Original list is: "+list);
        int idx1=1, idx2=3;
        swap(list, idx1, idx2);
    }
}
