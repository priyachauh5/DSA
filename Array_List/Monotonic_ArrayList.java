import java.util.ArrayList;

public class Monotonic_ArrayList{
    public static boolean monotonic(ArrayList<Integer> nums){
       if(nums==null || nums.size()<2){
        return true;
       }

       boolean increasing=false;
       boolean decreasing=false;

        //llop to determine the inc or dec
       for(int i=1; i<nums.size(); i++){
        if(nums.get(i)>nums.get(i-1)){
            increasing=true;
        }else if(nums.get(i)<nums.get(i-1)){
            decreasing=true;
        }

        //if both inc or dec are true, the list is not monotonic
        if(increasing && decreasing){
            return false;
        }
       }
       return true; //The list is monotonic either inc or dec
    }
    public static void main(String args[]){
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(3);
        // nums.add(4);
        System.out.print(monotonic(nums));
    }
}