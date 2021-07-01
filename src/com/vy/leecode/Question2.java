package com.vy.leecode;

/**
 * @author: Ellen
 * @Date: 2021/6/25 10:37
 * @Description: 字符串最大不重复字串
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Question2 {

	public void q2(String s) {

		//分别存储128个字符对应的最新的索引位置
		int[] last = new int[128];

		for (int i = 0; i < last.length; i++) {

			last[i] = -1;

		}
		//头指针 子字符串开始位置
		int indexFlag = 0;

		//结果 (长度)
		int res = 0;

		char[] chars = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {

			//当前字符
			int currentChar = chars[i];

			//当前字符最近一次的索引位置
			int indexLast = last[currentChar];

			//判断头指针位置
			indexFlag = Math.max(indexFlag, indexLast + 1);

			//判断结果
			res = Math.max(res, i - indexFlag + 1);

			//更新当前字符的索引位置
			last[currentChar] = i;

		}

	}

}
