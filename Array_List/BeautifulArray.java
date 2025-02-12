/*-----------------------------------------------------------------------------------------------------------------------------------------
Problem: Beautiful ArrayList (MEDIUM)
An ArrayList nums of size n is beautiful if it satisfies the following conditions:

Permutation of Numbers:

The list nums must be a permutation of the integers in the range [1, n]. This means that the list must contain all the integers from 1 to n exactly once.
Forbidden Condition:

For every pair of indices i and j where 0 <= i < j < n, there must be no index k with i < k < j such that the following equation holds:
2×nums.get(k)=nums.get(i)+nums.get(j)
2×nums.get(k)=nums.get(i)+nums.get(j)
In other words, for every pair of numbers in the list, there should not be any number between them that satisfies the equation 2 * nums[k] = nums[i] + nums[j].
Task:
Given an integer n, return any valid permutation of size n that satisfies the conditions described above.

Example 1:
Input: n = 4
Output: [2, 1, 4, 3]
Example 2:
Input: n = 5
Output: [3, 1, 2, 5, 4]
Constraints:
1 <= n <= 1000
-----------------------------------------------------------------------------------------------------------------------------------------*/
// import java.util.ArrayList;

// public class BeautifulArrayList {
//     public static ArrayList<Integer> beautifulArray(int n) {
//         ArrayList<Integer> result = new ArrayList<>();
        
//         // Start with the odd numbers
//         for (int i = 1; i <= n; i += 2) {
//             result.add(i);
//         }
        
//         // Then add the even numbers
//         for (int i = 2; i <= n; i += 2) {
//             result.add(i);
//         }
        
//         return result;
//     }

//     public static void main(String[] args) {
//         // Test cases
//         System.out.println(beautifulArray(4)); // Output: [1, 3, 2, 4]
//         System.out.println(beautifulArray(5)); // Output: [1, 3, 5, 2, 4]
//     }
// }


import java.util.ArrayList;
import java.util.Arrays;
public class BeautifulArray{
    public static int[] beautifulArray(int n){
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);
        while(ans.size()<n){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int element:ans){
                if(2*element-1<=n){
                    temp.add(2*element-1);
                }
            }
             for(int element:ans){
                if(2*element<=n){
                    temp.add(2*element);
                }
            }
            ans=temp;
        }
        int res[]=new int[n];
        for(int i=0; i<n; i++){
            res[i]=ans.get(i);
        }
        return res;
    }
    public static void main(String args[]){
        int n=4;
        System.out.print(Arrays.toString(beautifulArray(n)));
    }
}

