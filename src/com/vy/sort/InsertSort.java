package com.vy.sort;

/**
 * @author: Ellen
 * @Date: 2021/6/29 17:39
 * @Description: 插入排序
 */
public class InsertSort {
	public static void main(String[] args) {


	}

	public static int[] sort(int[] a) {

		for (int i = 1; i < a.length; i++) {

			for (int j = i; j >0 ; j--) {

				//从当前值开始往前推 交换 直到找到合适的"插入"位置
				if (a[j] < a[j-1]){

					int min = a[j-1];

					a[j-1] = a[j];

					a[j] = min;

				}

			}

		}

		return a;

	}

}
