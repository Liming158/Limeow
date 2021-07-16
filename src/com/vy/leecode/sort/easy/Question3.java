package com.vy.leecode.sort.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/16 10:30
 * @Description: 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 */
public class Question3 {

	public int[] exchange(int[] nums) {

		int i = 0;

		int j = nums.length - 1;

		while (i < j) {

			if (nums[i] % 2 == 0) {

				while (i < j && nums[j] % 2 == 0) {

					j--;

				}

				int index;

				index = nums[i];

				nums[i] = nums[j];

				nums[j] = index;

			}

			i++;

		}

		return nums;

	}

}
