package com.vy.leecode.zifuchuan.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/7 10:20
 * @Description: 58. 最后一个单词的长度 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/length-of-last-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question5 {

	public static void main(String[] args) {

		String s = "asd";

		lengthOfLastWord(s);

	}

	public static int lengthOfLastWord(String s) {

		String[] s1 = s.split(" ");

		if (s1.length < 1) {

			return 0;

		} else if (s1[0].equals(s)) {

			return s.length();

		} else {

			return s1[s1.length - 1].length();

		}

	}
}
