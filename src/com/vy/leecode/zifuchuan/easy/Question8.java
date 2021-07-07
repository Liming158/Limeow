package com.vy.leecode.zifuchuan.easy;

import java.util.Arrays;

/**
 * @author: Ellen
 * @Date: 2021/7/7 10:59
 * @Description:
 */
public class Question8 {

	public static void main(String[] args) {

		String s = "anagram";
		String s1 = "nagaram";

		isAnagram(s,s1);
	}


	public static boolean isAnagram(String s, String t) {
		char[] chars = s.toCharArray();
		char[] chars1 = t.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars);
		System.out.println(chars);
		System.out.println(chars1);
		String valueOf = String.valueOf(chars);
		String valueOf1 = String.valueOf(chars1);
		return valueOf.equals(valueOf1);
	}
}
