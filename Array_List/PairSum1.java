import java.util.ArrayList;
public class PairSum{
    public static boolean pair(ArrayList<Integer> list, int target){
        for(int i=1; i<list.size(); i++){ //O(n^2)
            for(int j=i+1; j<list.size(); j++){
                System.out.println("("+i+","+j+")");
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
            System.out.println();
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<6; i++){
            list.add(i);
        }
        int target=5;
        System.out.println(pair(list, target));
    }
}