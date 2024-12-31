/*-----------------------------------------------------------------------------------------------------------------------------------------
Problem Statement: An ArrayList is monotonic if it is either monotone increasing or monotone decreasing. An ArrayList nums is:

Monotone increasing if for all i <= j, nums.get(i) <= nums.get(j).
Monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
Given an integer ArrayList nums, return true if the given list is monotonic, or false otherwise.

Example 1:
Input: nums = [1, 2, 2, 3]
Output: true
Explanation: The list is monotone increasing because every element is less than or equal to the next.

Example 2:
Input: nums = [6, 5, 4, 4]
Output: true
Explanation: The list is monotone decreasing because every element is greater than or equal to the next.

Example 3:
Input: nums = [1, 3, 2]
Output: false
Explanation: The list is neither increasing nor decreasing.
Constraints:

1 <= nums.size() <= 10^5
-10^5 <= nums.get(i) <= 10^5

-----------------------------------------------------------------------------------------------------------------------------------------*/

import java.util.ArrayList;

public class MonotonicArrayList {
    public static boolean isMonotonic(ArrayList<Integer> nums) {
        boolean increasing = true, decreasing = true;

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                decreasing = false;
            }
            if (nums.get(i) < nums.get(i - 1)) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(2);
        nums1.add(3);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(6);
        nums2.add(5);
        nums2.add(4);
        nums2.add(4);

        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.add(1);
        nums3.add(3);
        nums3.add(2);

        System.out.println(isMonotonic(nums1)); // true
        System.out.println(isMonotonic(nums2)); // true
        System.out.println(isMonotonic(nums3)); // false
    }
}
