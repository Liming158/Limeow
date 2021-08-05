package com.vy.leecode.hash;

import java.util.HashMap;

/**
 * @author: Ellen
 * @Date: 2021/8/5 09:54
 * @Description: 219. 存在重复元素 II
 */
public class Question4 {

	public boolean containsNearbyDuplicate(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>(8);

		for (int i = 0; i < nums.length; i++) {

			if (map.get(nums[i]) != null) {

				if (i - map.get(nums[i]) <= k) {

					return true;

				}

			}

			map.put(nums[i], i);

		}

		return false;

	}

}
