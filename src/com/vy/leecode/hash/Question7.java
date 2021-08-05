package com.vy.leecode.hash;

import java.util.HashMap;
import java.util.Set;

/**
 * @author: Ellen
 * @Date: 2021/8/5 11:09
 * @Description: 1512. 好数对的数目
 */
public class Question7 {

	public int numIdenticalPairs(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>(8);

		for (Integer i : nums) {

			map.put(i, map.getOrDefault(i, 0) + 1);

		}

		Set<Integer> integers = map.keySet();

		int res = 0;

		for (Integer in : integers) {

			Integer time = map.get(in);

			if (time > 1) {

				res += factorial(time - 1);

			}

		}

		return res;

	}

	public long factorial(long number) {
		if (number <= 1) {
			return 1;
		} else {
			return number + factorial(number - 1);
		}
	}
}
