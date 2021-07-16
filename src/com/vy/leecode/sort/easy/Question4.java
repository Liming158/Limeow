package com.vy.leecode.sort.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Ellen
 * @Date: 2021/7/16 10:39
 * @Description: 217. 存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 */
public class Question4 {

	public boolean containsDuplicate(int[] nums) {
		Set<Integer> res = new HashSet<Integer>();

		for (int i : nums) {

			res.add(i);

		}

		return res.size() < nums.length ? true : false;
	}

}
