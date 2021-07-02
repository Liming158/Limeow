package com.vy.sort;

/**
 * @author: Ellen
 * @Date: 2021/7/2 13:37
 * @Description:
 */
public class FastSort {

	public void sort(int[] a, int lo, int hi) {

		if (lo >= hi) {
			return;
		}
		int index = getIndex(a, lo, hi);
		sort(a, lo, index);
		sort(a, index + 1, hi);

	}

	public int getIndex(int[] a, int left, int right) {

		int index = a[left];

		int i = left;

		int j = right;

		while (true) {

			//左侧扫描比index值大的
			while (a[i + 1] < index & i < right) {

				//小时指针后移
				i++;

			}
			//右侧扫描比index值小的
			while (a[j] > index & j > left) {

				//大时指针前移
				j--;

			}

			//指针相遇时退出循环
			if (i >= j) {
				break;
			}

			int temp = a[i];

			a[i] = a[j];

			a[j] = temp;

		}

		//退出循环时交换 指针碰撞位置和初始index值  返回中间值索引
		int temp = a[left];

		a[left] = a[j];

		a[j] = temp;

		return j;
	}

}
