package com.vy.leecode.sort.easy;

import java.util.Arrays;

/**
 * @author: Ellen
 * @Date: 2021/7/16 10:10
 * @Description: 剑指 Offer 40. 最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 */
public class Question2 {

	public int[] getLeastNumbers(int[] arr, int k) {

		Arrays.sort(arr);

		int[] ints = new int[k];

		for (int i = 0; i < k; i++) {

			ints[i] = arr[i];

		}

		return ints;

	}

}
