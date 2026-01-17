package com.sayali.practice.problems.FindDuplicateNumber;

public class FindDuplicateNumber {

    public static int findDuplicate(int[] nums) {

        int slow = 0;
        int fast = 0;

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        return nums[slow];
    }
    public static void main(String[] args) {

//        int[] nums = {1,3,4,2,2};
//        int[] nums = {1,2,1};
//        int[] nums = {2,6,4,1,3,1,5};
        int[] nums = {3,3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
}
