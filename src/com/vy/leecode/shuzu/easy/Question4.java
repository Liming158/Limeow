package com.vy.leecode.shuzu.easy;

import java.util.Arrays;

/**
 * @author: Ellen
 * @Date: 2021/7/2 11:32
 * @Description: 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class Question4 {

	public void moveZeroes(int[] nums) {

		int i = 0;

		for (int j = 0; j < nums.length; j++) {

			if (nums[j] != 0) {

				nums[i++] = nums[j];

			}

		}

		for (int j = i; j < nums.length; j++) {

			nums[j] = 0;

		}

	}
}
