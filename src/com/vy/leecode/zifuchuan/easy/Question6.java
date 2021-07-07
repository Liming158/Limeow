package com.vy.leecode.zifuchuan.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/7 10:39
 * @Description: 剑指 Offer 58 - II. 左旋转字符串
 */
public class Question6 {

	public String reverseLeftWords(String s, int n) {

		String substring = s.substring(0, n);

		String substring1 = s.substring(n + 1);

		return substring+substring1;

	}

}
