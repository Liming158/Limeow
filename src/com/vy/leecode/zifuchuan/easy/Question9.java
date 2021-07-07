package com.vy.leecode.zifuchuan.easy;

import java.util.Arrays;

/**
 * @author: Ellen
 * @Date: 2021/7/7 11:13
 * @Description: 409. 最长回文串
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 *
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 */
public class Question9 {

	public static void main(String[] args) {

		String s = "xxx";

		longestPalindrome(s);

	}

	public static int longestPalindrome(String s) {

		int[] ints = new int[128];

		char[] chars = s.toCharArray();

		for (int i = 0; i < chars.length; i++) {

			char aChar = chars[i];

			ints[aChar] = ints[aChar] + 1;

		}

		int max = 0;

		for (int i = 0; i < ints.length; i++) {

			//关键代码 拿到出现次数的偶数次
			max += ints[i] / 2 * 2;

		}

		if (max < s.length()) {
			max++;
		}

		return max;

	}

}
