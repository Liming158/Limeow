package com.vy.leecode.sort.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/16 09:57
 * @Description: 剑指 Offer 03. 数组中重复的数字
 *
 * 找出数组中重复的数字。 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 */
public class Question1 {

	public int findRepeatNumber(int[] nums) {

		int[] ints = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {

			int anInt = ints[nums[i]];

			if (anInt==1){

				return nums[i];

			}else {

				ints[nums[i]] = 1;

			}

		}

		return -1;

	}

}
