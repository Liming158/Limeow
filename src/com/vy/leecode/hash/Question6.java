package com.vy.leecode.hash;

import java.util.HashMap;
import java.util.Set;

/**
 * @author: Ellen
 * @Date: 2021/8/5 10:54
 * @Description: 面试题 01.04. 回文排列
 */
public class Question6 {

	public boolean canPermutePalindrome(String s) {

		char[] chars = s.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();

		for (Character c : chars) {

			map.put(c, map.getOrDefault(c, 0) + 1);

		}

		int i = 0;

		Set<Character> characters = map.keySet();

		for (Character c:characters) {

			if (map.get(c) % 2 == 1){

				i++;

			}

		}

		return i < 2;

	}

}
