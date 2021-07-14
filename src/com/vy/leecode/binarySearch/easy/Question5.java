package com.vy.leecode.binarySearch.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/14 11:32
 * @Description: 剑指 Offer 53 - II. 0～n-1中缺失的数字
 */
public class Question5 {

	public int missingNumber(int[] nums) {

		int left = 0;

		int right = nums.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (nums[mid] == mid) {

				left = mid + 1;

			} else {

				right = mid -1;

			}

		}

		return left;

	}

}
