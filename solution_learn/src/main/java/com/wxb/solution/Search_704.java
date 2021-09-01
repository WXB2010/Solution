package com.wxb.solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author wangxianbing
 * @date 2021-08-28 10:25:19
 */
public class Search_704 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1};
        int target = -1;
        int search = search(nums, target);
        System.out.println(search);
    }

    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int search2(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if(nums[pivot] == target){
                return pivot;
            }
            if(target < nums[pivot]){
                right = pivot - 1;
            }else{
                left = pivot + 1;
            }
        }
        return -1;
    }
}
