package com.vy.sort;

import java.util.Arrays;

/**
 * @author: Ellen
 * @Date: 2021/7/1 14:48
 * @Description: 归并排序
 */
public class MergeSort {

	public static void main(String[] args) {

		int[] a = {1, 5, 2, 6, 3, 7, 4, 8, 5, 9, 0};

		sort(a, 0, a.length - 1);

	}

	public static void sort(int[] a, int lo, int hi) {

		if (lo >= hi) {
			return;
		}
		int mid = lo + (hi - lo) / 2;

		sort(a, lo, mid);

		sort(a, mid + 1, hi);

		merge(a, lo, mid, hi);

		System.out.println(Arrays.toString(a));
	}

	public static void merge(int[] a, int left, int mid, int right) {

		int ri = mid + 1;

		int le = left;

		int[] as = new int[a.length];

		for (int i = left; i <= right; i++) {

			as[i] = a[i];

		}

		for (int i = left; i <= right; i++) {

			if (le > mid) {

				a[i] = as[ri];

				ri++;

			} else if (ri > right) {

				a[i] = as[le];

				le++;

			} else if (as[le] < as[ri]) {

				a[i] = as[le];

				le++;
			} else {

				a[i] = as[ri];

				ri++;

			}

		}

		return;

	}

}
