package com.vy.leecode.zifuchuan.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/8 10:10
 * @Description: 面试题 01.06. 字符串压缩
 */
public class Question10 {

	public static void main(String[] args) {

		compressString("aabcccccaa");

	}

	public static String compressString(String s) {

		int k = 1;

		int max = 1;

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			stringBuilder.append(s.charAt(i));

			while (k < s.length()) {

				if (s.charAt(i) == s.charAt(k)) {

					k++;

					max++;

				} else {

					break;
				}

			}

			i = k - 1;

			k = k + 1;

			stringBuilder.append(max);

			max = 1;


		}

		return stringBuilder.toString().length() < s.length() ? stringBuilder.toString() : s;

	}

}
