package com.vy.sort;

import java.util.Arrays;

/**
 * @author: Ellen
 * @Date: 2021/7/1 13:47
 * @Description: 希尔排序
 */
public class ShellSort {

	public static void main(String[] args) {
		int[] a = {1, 5, 2, 6, 3, 7, 4, 8, 5, 9, 0};

		int[] sort = sort(a);

		System.out.println(Arrays.toString(sort));

	}

	public static int[] sort(int[] a) {

		//序列为2
		int length = a.length / 2;

		while (length != 0) {

			System.out.println(Arrays.toString(a));

			//外层循环控制分组
			for (int i = length; i < a.length; i++) {

				//内层循环做 组内 插入排序
				for (int j = i; j >= length; j = j - length) {

					if (a[j] < a[j - length]) {

						int c = a[j];

						a[j] = a[j - length];

						a[j - length] = c;

					}

				}

			}

			length = length / 2;

		}
		return a;

	}
}
