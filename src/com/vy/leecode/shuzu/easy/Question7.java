package com.vy.leecode.shuzu.easy;

import java.util.Arrays;

/**
 * @author: Ellen
 * @Date: 2021/7/5 10:59
 * @Description: 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class Question7 {

	public int singleNumber(int[] nums) {

		Arrays.sort(nums);

		if (nums.length==1|| nums[0] != nums[1]){
			return nums[0];
		}

		if (nums[nums.length-1] != nums[nums.length-2]){
			return nums[nums.length-1];
		}

		for (int i = 1; i < nums.length - 1; i++) {

			if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {

				return nums[i];

			}

		}

		return -1;
	}
}
