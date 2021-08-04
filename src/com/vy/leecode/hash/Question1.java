package com.vy.leecode.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @author: Ellen
 * @Date: 2021/8/4 10:08
 * @Description:
 */
public class Question1 {
	public List<Integer> findDisappearedNumbers(int[] nums) {

		ArrayList<Integer> list = new ArrayList<>();

		Arrays.sort(nums);

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 1; i < nums.length; i++) {

			map.put(i,i);

		}

		for (int i = 0; i < nums.length; i++) {

			map.remove(nums[i]);

		}

		Set<Integer> integers = map.keySet();

		for (Integer i:integers
		) {

			list.add(i);

		}

		return list;


	}
}
