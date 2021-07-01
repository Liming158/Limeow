package com.vy.leecode;

/**
 * @author: Ellen
 * @Date: 2021/7/1 11:16
 * @Description: 删除有序数组的重复项
 */
public class Question6 {
	public int removeDuplicates(int[] nums) {

		int cur = 0 ;

		for (int i = 0; i < nums.length; i++) {
			//将第一个与当前值不同的值赋予当前指针的下一位 指针后移
			if (nums[cur]!=nums[i]){

				nums[cur + 1] = nums[i];

				cur++;
			}

		}
		return cur;

	}

}
