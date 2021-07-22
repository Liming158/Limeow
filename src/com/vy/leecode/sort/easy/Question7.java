package com.vy.leecode.sort.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/22 13:57
 * @Description: 1365. 有多少小于当前数字的数字
 */
public class Question7 {

	public int[] smallerNumbersThanCurrent(int[] nums) {

		int[] burke = new int[100];

		for (int i : nums) {

			burke[i]++;

		}

		int i = 0;

		for (int j = 0; j < burke.length; j++) {

			int temp = i;

			i += burke[j];

			burke[j] = temp;

		}

		for (int j = 0; j < nums.length; j++) {

			nums[j] = burke[nums[j]];

		}


		return nums;

	}

}
