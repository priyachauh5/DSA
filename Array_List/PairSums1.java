//Two pointer approach

import java.util.ArrayList;
public class PairSums1{
    public static boolean PairSum(ArrayList<Integer> list, int target){
        //two pointer approach
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp){ //(lp>rp)
            //case1 List(lp)+List(rp)==target return true;
            //case2 list(lp)+List(rp)<target lp++
            //case3 list(lp)+list(rp)>target rp++

            //case1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //case2
            if(list.get(lp)+list.get(rp)<target){ //case2
                lp++;
            }else{  //case3
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1; i<=6; i++){
            list.add(i);
        }
        int target=50;
        System.out.println(list+" "+"Target is: "+target);
        System.out.println(PairSum(list, target));
    }
}