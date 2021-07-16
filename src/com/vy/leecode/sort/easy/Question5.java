package com.vy.leecode.sort.easy;

import java.util.ArrayList;

/**
 * @author: Ellen
 * @Date: 2021/7/16 10:55
 * @Description: 350. 两个数组的交集 II 给定两个数组，编写一个函数来计算它们的交集。
 */
public class Question5 {

	public int[] intersect(int[] nums1, int[] nums2) {

		ArrayList<Integer> arrayList = new ArrayList<>();

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums1.length; i++) {

			arrayList.add(nums1[i]);

		}

		for (int i = 0; i < nums2.length; i++) {

			int i1 = nums2[i];

			if (arrayList.contains(i1)) {

				arrayList.remove(Integer.valueOf(i1));

				list.add(i1);

			}

		}

		int[] ints = new int[list.size()];

		int k = 0;

		for (Integer x : list
		) {
			ints[k++] = x;
		}

		return ints;
	}

}
