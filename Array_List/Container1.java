//Container with most water

import java.util.ArrayList;
public class Container1{ //O(n)
    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        //brute force
        for(int i=0; i<height.size(); i++){ //O(n)
            for(int j=i+1; j<height.size(); j++){ //O(n-1)
                int ht=Math.min(height.get(i), height.get(j));
                int width=j-i; //difference of index
                int currWater=ht*width;
                maxWater=Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();
        //1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}