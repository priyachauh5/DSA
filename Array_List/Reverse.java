import java.util.ArrayList;
public class ArrayListOperation{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
    
        //Add operation O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        for(int i=list.size()-1; i>=0; i--){ //O(n)
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}