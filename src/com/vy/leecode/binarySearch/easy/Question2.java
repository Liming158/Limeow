package com.vy.leecode.binarySearch.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/14 10:26
 * @Description: 167. 两数之和 II - 输入有序数组 给定一个已按照 升序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target
 */
public class Question2 {

	public int[] twoSum(int[] numbers, int target) {

		int left = 0;

		int right = numbers.length - 1;

		while (left < right) {

			int sum = numbers[left] + numbers[right];

			if (sum < target) {

				left++;

			} else if (sum > target) {

				right--;

			} else {

				return new int[]{left + 1, right + 1};

			}

		}

		return null;

	}

}
