package com.vy.leecode.binarySearch.easy;

import java.util.HashMap;

/**
 * @author: Ellen
 * @Date: 2021/8/3 14:56
 * @Description: 205. 同构字符串
 *
 * abcd   abab abab   abcd
 */
public class Question10 {

	public boolean isIsomorphic(String s, String t) {

		char[] chars = s.toCharArray();

		char[] chart = t.toCharArray();

		int i = 0;

		HashMap<Character, Character> map = new HashMap<>();

		int length = s.length();

		boolean flag = true;

		while (i < length) {

			if (map.get(chars[i]) != null) {

				if (map.get(chars[i]) != chart[i]) {

					flag = false;

					break;

				} else {

					i++;

					continue;
				}

			}

			if (map.containsValue(chart[i])) {

				flag = false;

				break;

			}

			map.put(chars[i], chart[i]);

			i++;

		}

		return flag;

	}

}
