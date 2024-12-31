/*-----------------------------------------------------------------------------------------------------------------------------------------
Question 2: Lonely Numbers in ArrayList (MEDIUM)
Problem Statement:
You are given an integer ArrayList nums. A number x is considered lonely if:

It appears exactly once in the list.
Neither x + 1 nor x - 1 appears in the list.
Your task is to return a list of all lonely numbers in nums. The order of the lonely numbers in the result does not matter.

Example 1:
Input: nums = [10, 6, 5, 8]
Output: [10, 8] (or [8, 10])
Explanation:
10 is a lonely number because it appears exactly once, and 9 and 11 do not appear in the list.
8 is a lonely number because it appears exactly once, and 7 and 9 do not appear in the list.
5 is not a lonely number because 6 appears in the list.
Hence, the lonely numbers in nums are [10, 8] or [8, 10].

Example 2:
Input: nums = [1, 3, 5, 3]
Output: [1, 5] (or [5, 1])
Explanation:
1 is a lonely number because it appears exactly once, and neither 0 nor 2 appear in the list.
5 is a lonely number because it appears exactly once, and neither 4 nor 6 appear in the list.
3 is not a lonely number because it appears twice.
Hence, the lonely numbers in nums are [1, 5] or [5, 1].

Constraints:
1 <= nums.size() <= 10^5 (The size of the list is at most 100,000)
0 <= nums.get(i) <= 10^6 (The values in the list are between 0 and 1,000,000)

-----------------------------------------------------------------------------------------------------------------------------------------*/

import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumbers {
    public static ArrayList<Integer> findLonelyNumbers(ArrayList<Integer> nums) {
        // Step 1: Sort the ArrayList to make it easier to check adjacent numbers.
        Collections.sort(nums);
        
        ArrayList<Integer> lonelyNumbers = new ArrayList<>();
        
        // Step 2: Iterate through the list and check each number
        for (int i = 0; i < nums.size(); i++) {
            int current = nums.get(i);
            
            // Check if the current number appears only once
            if ((i==0 || nums.get(i)!=nums.get(i-1)) && (i==nums.size()-1 || nums.get(i)!=nums.get(i+1))) {
                // Check if the current number's neighbors do not exist
                boolean isLonely = true;
                
                // Check if the previous and next number are not current - 1 and current + 1
                if ((i > 0 && nums.get(i - 1) == current - 1) || (i < nums.size() - 1 && nums.get(i + 1) == current + 1)) {
                    isLonely = false;
                }
                
                if (isLonely) {
                    lonelyNumbers.add(current);
                }
            }
        }
        
        return lonelyNumbers;
    }

    public static void main(String[] args) {
        // Test Case 1
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(10);
        nums1.add(6);
        nums1.add(5);
        nums1.add(8);
        System.out.println(findLonelyNumbers(nums1)); // Output: [10, 8] (or [8, 10])

        // Test Case 2
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(1);
        nums2.add(3);
        nums2.add(5);
        nums2.add(3);
        System.out.println(findLonelyNumbers(nums2)); // Output: [1, 5] (or [5, 1])
    }
}
