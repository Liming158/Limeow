package com.vy.leecode.sort.easy;


/**
 * @author: Ellen
 * @Date: 2021/7/22 14:52
 * @Description: 剑指 Offer 39. 数组中出现次数超过一半的数字
 *
 * 摩尔投票法
 */
public class Question10 {

	public int majorityElement(int[] nums) {

		int res = 0;

		int count = 0;

		for (int j = 0; j < nums.length; j++) {

			//当一个值"死"光了,换个值
			if (count == 0) {

				res = nums[j];

			}
			//如果相等 "队伍人数"+1 否则1换1 人数-1
			if (res == nums[j]) {
				count++;
			} else {
				count--;
			}

		}

		return res;

	}

}
