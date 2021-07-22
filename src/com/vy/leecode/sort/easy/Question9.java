package com.vy.leecode.sort.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/22 14:46
 * @Description: 268. 丢失的数字 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 */
public class Question9 {

	public int missingNumber(int[] nums) {

		int[] ints = new int[nums.length];

		for (int i : nums) {

			ints[i]++;

		}

		for (int i = 0; i < ints.length; i++) {

			if (ints[i] == 0) {

				return i;

			}

		}

		return -1;

	}

}
