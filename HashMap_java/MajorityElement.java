// import java.util.HashMap;

// public class MajorityElement{
//     public static void main(String args[]){
//         int arr[]={1,3,2,5,1,3,1,5,1};
//         HashMap<Integer, Integer> map=new HashMap<>();

//         for(int i=0; i<arr.length; i++){
//             if(map.containsKey(arr[i])){
//                 map.put(arr[i], map.get(arr[i]+1));
//             }else{
//                 map.put(arr[i], 1);
//             }
//         }

//         Set<Integer> keySet=map.keySet();
//         for(Integer key: keySet){ //when we have to traverse collection of objects
//             if(map.get(key)>arr.length/3){
//                 System.out.println(key);
//             }
//         }
//     }
// }



//Optimized code
import java.util.HashMap;

public class MajorityElement{
    public static void main(String args[]){
        int arr[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0; i<arr.length; i++){ //O(n)
            // map.put(arr[i], map.getOrDefault(key, defaultValue));
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1); //if not exists then return 0
        }

        for(Integer key: map.keySet()){ //when we have to traverse collection of objects
            if(map.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    }
}