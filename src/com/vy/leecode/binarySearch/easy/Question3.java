package com.vy.leecode.binarySearch.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author: Ellen
 * @Date: 2021/7/14 10:51
 * @Description: 349. 两个数组的交集 给定两个数组，编写一个函数来计算它们的交集。
 */
public class Question3 {

	public int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> set = new HashSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums1.length; i++) {
			map.put(nums1[i], i);
		}

		for (int j = 0; j < nums2.length; j++) {
			if (map.containsKey(nums2[j])) {
				set.add(nums2[j]);
			}
		}

		int[] res = new int[set.size()];
		Iterator iterator = set.iterator();
		int k = 0;
		while (iterator.hasNext()) {
			res[k] = (int) iterator.next();
			k++;
		}

		return res;

	}

}
