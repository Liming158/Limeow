package com.vy.leecode.shuzu.easy;

import java.util.Arrays;

/**
 * @author: Ellen
 * @Date: 2021/7/6 10:14
 * @Description: 169. 多数元素 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * 摩尔投票法：
 *
 * 核心就是对拼消耗。
 *
 * 玩一个诸侯争霸的游戏，假设你方人口超过总人口一半以上，并且能保证每个人口出去干仗都能一对一同归于尽。最后还有人活下来的国家就是胜利。
 *
 * 那就大混战呗，最差所有人都联合起来对付你（对应你每次选择作为计数器的数都是众数），或者其他国家也会相互攻击（会选择其他数作为计数器的数），但是只要你们不要内斗，最后肯定你赢。
 *
 * 最后能剩下的必定是自己人。
 * @author Ellen
 */
public class Question8 {

	public int majorityElement(int[] nums) {

		int count = 1;

		int max = nums[0];

		for (int i = 1; i < nums.length; i++) {

			if (max == nums[i]) {

				count++;

			} else {

				count--;

				if (count == 0) {

					max = nums[i + 1];

				}

			}

		}

		return max;

	}

}
