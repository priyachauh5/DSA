import java.util.ArrayList;
public class ArrayListOperation{
    public static void main(String args[]){
        //className objectName=new className();
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Boolean> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();

        //Add operation O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //get operation O(1)
        int element=list.get(2);
        System.out.println(element);

        //remove operation O(n)
        list.remove(3);
        System.out.println(list);

        //set element at index O(n)
        list.set(2,10);
        System.out.println(list);

        //contain element O(n)
        System.out.println(list.contains(11));
        System.out.println(list.contains(5));

        //add element in arraylist O(n)
        list.add(2,20);
        System.out.println(list);

    }
}