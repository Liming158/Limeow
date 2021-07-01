package com.vy.sort;

/**
 * @author: Ellen
 * @Date: 2021/6/29 17:08
 * @Description: 选择排序
 *
 * 循环遍历 将第一个数之后的每个数与第一个数比较 小就进行交换
 *            二                二
 *            三                三
 *            。。              。。
 */
public class ChoseSort {

	public static void main(String[] args) {

		int[] demo ={1,9,20,3,24,123,44,12};

		int[] sort = sort(demo);

		for (int i = 0; i < sort.length; i++) {

			System.out.println(sort[i]);

		}

	}

	public static int[] sort(int[] a) {

		for (int i = 0; i < a.length; i++) {

			int min = a[i];

			for (int j = i + 1; j < a.length; j++) {

				if (a[j] < min) {

					min = a[j];

					a[j] = a[i];

					a[i] = min;

				}

			}

		}

		return a;

	}

}
