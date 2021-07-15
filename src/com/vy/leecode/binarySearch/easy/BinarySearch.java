package com.vy.leecode.binarySearch.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/15 11:46
 * @Description:
 */
public class BinarySearch {

	public int search(int[] nums, int target) {

		int left = 0;

		int right = nums.length - 1;

		while (left < right){

			int mid = left + (right - left) / 2;

			if (nums[mid] < target){

				left = mid + 1;

			}else if (nums[mid] > target){

				right = mid - 1;

			}else {

				return mid;

			}

		}

		return  -1;

	}

}
