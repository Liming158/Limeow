package com.vy.leecode.hash;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Ellen
 * @Date: 2021/8/6 10:52
 * @Description: 1002. 查找常用字符
 * 输入：["bella","label","roller"]
 * 输出：["e","l","l"]
 */
public class Question9 {

	public List<String> commonChars(String[] words) {

		int[] ints = new int[26];

		String word = words[0];

		for (Character c : word.toCharArray()) {

			ints[c-'a'] ++;

		}

		for (int i = 1; i < words.length; i++) {

			int[] other = new int[26];

			for (Character c : words[i].toCharArray()) {

				other[c-'a']++;

			}

			for (int j = 0; j < ints.length; j++) {

				ints[j] = Math.min(ints[j],other[j]);

			}

		}

		ArrayList<String> characters = new ArrayList<>();

		for (int i = 0; i < ints.length; i++) {

			for (int j = 0; j < ints[i]; j++) {

				characters.add(String.valueOf((char)(i + 'a')));

			}

		}

		return characters;

	}

}
