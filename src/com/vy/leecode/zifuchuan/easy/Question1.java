package com.vy.leecode.zifuchuan.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/7 10:05
 * @Description: 28. 实现 strStr()
 * 实现 strStr() 函数。
 *
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question1 {

	public static void main(String[] args) {
		String s = "a";
		String s1 = "a";
		strStr(s,s1);
	}

	public static int strStr(String haystack, String needle) {

		if (needle.equals("")){
			return 0;
		}

		for (int i = 0; i <= haystack.length()-needle.length(); i++) {

				int j = i + needle.length();

			String substring = haystack.substring(i, j);

			if (j<=haystack.length() && substring.equals(needle)){

					return i;

				}

		}

		return -1;
	}

}
