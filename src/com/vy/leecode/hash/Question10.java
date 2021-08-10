package com.vy.leecode.hash;

import java.util.Arrays;

/**
 * @author: Ellen
 * @Date: 2021/8/10 11:28
 * @Description:
 */
public class Question10 {

	public int missingNumber(int[] nums) {

		int[] ints = new int[nums.length+1];

		for (int i = 0; i < nums.length; i++) {

			ints[nums[i]]++;

		}

		for (int i = 0; i < ints.length; i++) {
			if (ints[i]==0){
				return i;
			}
		}

		return nums.length;

	}

}
