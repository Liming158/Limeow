package com.vy.leecode.binarySearch.easy;

/**
 * @author: Ellen
 * @Date: 2021/8/2 13:51
 * @Description: 剑指 Offer 57. 和为s的两个数字
 */
public class Question7 {

	public int[] twoSum(int[] nums, int target) {

		int left = 0;

		int right = nums.length-1;

		while (true){

			if(nums[left] + nums[right] > target){

				right--;

			}else if (nums[left] + nums[right] < target) {

				left++;

			}else {
				break;
			}

		}

		int[] ints = {left,right};

		return ints;


	}

}
