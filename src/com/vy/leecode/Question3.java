package com.vy.leecode;


import java.util.ArrayList;

/**
 * @author: Ellen
 * @Date: 2021/6/28 14:10
 * @Description: 最长前缀子串
 */
public class Question3 {

	public static void main(String[] args) {
		String s = "123456";
		System.out.println(s.substring(0, 5));
	}

	public static String longestCommonPrefix(String[] strs) {

		String re = strs[0];

		for (String s : strs) {

			while (!s.startsWith(re)) {

				if (re.length() == 0) {
					return "";
				}

				re = re.substring(0, re.length() - 1);

			}

		}

		return re;
	}
}