package com.vy.leecode.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Ellen
 * @Date: 2021/8/4 17:27
 * @Description: 1207. 独一无二的出现次数
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 *
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 */
public class Question3 {

	public boolean uniqueOccurrences(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i:arr) {

			map.put(i,map.getOrDefault(i,0)+1);

		}

		HashSet<Integer> set = new HashSet<>();

		Set<Integer> integers = map.keySet();

		for (Integer i : integers) {

			boolean add = set.add(map.get(i));

			if (!add){
				return false;
			}

		}

		return true;

	}

}
