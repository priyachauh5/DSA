import java.util.ArrayList;
public class ArrayListOperation{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();

        //Add operation O(1)
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println(list);

        int largest=Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){ //O(n)
            // if(largest<list.get(i)){
            //     largest=list.get(i);
            // }
            largest=Math.max(largest, list.get(i));
        }
        System.out.println(largest);
    }
}