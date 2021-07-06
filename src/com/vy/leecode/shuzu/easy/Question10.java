package com.vy.leecode.shuzu.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/6 11:13
 * @Description: 88. 合并两个有序数组 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 *
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question10 {

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int index = m + n - 3;

		int last = m + n - 1;

		int j = m - 1;

		int k = n - 1;

		for (int i = last; i >= 0; i--) {

			if (k < 0) {
				break;
			}

			if (j < 0 || nums1[j] < nums2[k]) {

				nums1[i] = nums2[k--];

			} else {

				nums1[i] = nums1[j--];

			}

		}

	}

}
