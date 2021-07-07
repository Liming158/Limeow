package com.vy.leecode.zifuchuan.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/7 10:45
 * @Description: 392. 判断子序列
 */
public class Question7 {

	public boolean isSubsequence(String s, String t) {

		int i = 0;

		int j = 0;

		if (s.equals("")) {

			return true;

		}

		while (j < t.length() && i < s.length()) {

			if (t.charAt(j) == s.charAt(i)) {

				i++;

			}

			j++;

		}

		if (i == s.length()) {

			return true;

		} else {

			return false;

		}

	}

}
