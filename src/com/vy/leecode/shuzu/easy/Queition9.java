package com.vy.leecode.shuzu.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/6 10:47
 * @Description: 66. 加一
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Queition9 {

	public static void main(String[] args) {
		int[] ints = new int[1];

		ints[0] = 9;

		plusOne(ints);
	}

	public static int[] plusOne(int[] digits) {
		int x = (digits[digits.length - 1] + 1);

		digits[digits.length-1] = x % 10;

		int index = x / 10;

		for (int i = digits.length - 1; i >=0 ; i--) {

			int digit = digits[i] + index;

			digits[i] = digit % 10;

			index = digit / 10;

			if (index == 0){

				break;

			}

		}

		if (index == 1){

			int[] ints = new int[digits.length + 1];

			ints[0] = 1;

			for (int i = 0; i < digits.length; i++) {

				ints[i + 1] = digits[i];

			}

			return ints;

		}

		return digits;

	}

}
