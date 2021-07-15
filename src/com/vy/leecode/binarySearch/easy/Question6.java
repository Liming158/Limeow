package com.vy.leecode.binarySearch.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/15 10:28
 * @Description: 剑指 Offer 53 - I. 在排序数组中查找数字 I
 */
public class Question6 {

	public int search(int[] nums, int target) {

		int left = 0;

		int right = nums.length - 1;

		int count = 0;

		while (left < right) {

			int mid = (left + right) / 2;

			if (nums[mid] >= target) {

				right = mid;

			}

			if (nums[mid] < target) {

				left = mid + 1;

			}

		}

		while (left < nums.length && nums[left++] == target) {

			count++;

		}

		return count;

	}

}
