/*-----------------------------------------------------------------------------------------------------------------------------------------
You are given an ArrayList of integers called nums and an integer key that is guaranteed to be present in the nums list. Your task is to find the number that immediately follows the occurrences of key and appears the most times in the list.

In other words:

For every unique integer target in nums, count how many times target immediately follows an occurrence of key. That is, count how many times the pair (key, target) appears in the nums list.
Your goal is to return the target with the highest count.
Assumptions:
There will be only one target with the maximum count.
The count for each target is only considered when it immediately follows the key in the list.
Function Signature:
public static int mostFrequentTargetFollowingKey(ArrayList<Integer> nums, int key);
Input:
An ArrayList<Integer> nums (2 <= nums.size() <= 1000).
An integer key (1 <= key <= 1000), which is present in nums.
Output:
Return the integer target that appears most frequently immediately after key in the list.
Constraints:
2 <= nums.size() <= 1000
1 <= nums.get(i) <= 1000
The answer will always be unique.
Example 1:
Input:
nums = [1, 100, 200, 1, 100], key = 1
Output:100
Explanation:

For target = 100, there are 2 occurrences at indices 1 and 4, which immediately follow an occurrence of key (1).
No other integer appears immediately after 1, so we return 100.
Example 2:
Input:nums = [2, 2, 2, 2, 3], key = 2
Output:2
Explanation:

For target = 2, there are 3 occurrences at indices 1, 2, and 3, where 2 immediately follows an occurrence of key (2).
For target = 3, there is only 1 occurrence at index 4 where 3 follows 2.
Since 2 has the maximum count of occurrences following key, the output is 2.
Hint:
Count the number of times each target value follows key in the ArrayList.
After counting, return the target with the highest count.
-----------------------------------------------------------------------------------------------------------------------------------------*/


import java.util.ArrayList;
public class FrequentNumber{
    public static int FrequentNumber(ArrayList<Integer> nums, int key){
        int result[]=new int[1000];
        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i)==key){
                result[nums.get(i+1)-1]++;
            }
        }
        int max=Integer.MIN_VALUE;
        int ans=0;

        for(int i=0; i<1000; i++){
            if(max<result[i]){
                max=result[i];
                ans=i+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        int key=1;
        System.out.print(FrequentNumber(nums,key));
    }
}