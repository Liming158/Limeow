package com.vy.leecode.binarySearch.easy;

import java.util.HashMap;

/**
 * @author: Ellen
 * @Date: 2021/8/3 14:33
 * @Description: 387. 字符串中的第一个唯一字符
 */
public class Question9 {

	public int firstUniqChar(String s) {

		char[] chars = s.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < chars.length; i++) {

			map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);

		}

		for (int i = 0; i < chars.length; i++) {

			if (map.get(chars[i]) == 1) {

				return i;
			}
		}
		return -1;
	}


}
