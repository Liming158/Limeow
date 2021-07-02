package com.vy.leecode.shuzu.easy;


/**
 * @author: Ellen
 * @Date: 2021/7/2 10:27
 * @Description: 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class Question2 {

	public int maxSubArray(int[] nums) {

		int sum = 0;

		int res = nums[0];

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > 0) {

				sum += nums[i];

			} else {


				sum = nums[i];

			}

			sum = Math.max(sum, res);

		}

		return res;


	}

}
