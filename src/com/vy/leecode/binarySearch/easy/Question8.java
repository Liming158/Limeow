package com.vy.leecode.binarySearch.easy;

/**
 * @author: Ellen
 * @Date: 2021/8/3 11:49
 * @Description: 编写一个算法来判断一个数 n 是不是快乐数。
 *
 * 「快乐数」定义为：
 *
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。 如果 可以变为  1，那么这个数就是快乐数。
 *
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/happy-number 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question8 {

	public boolean isHappy(int n) {

		int slow = n;

		int fast = n;

		do {

			slow = sub(slow);

			fast = sub(sub(fast));

		} while (slow != fast);

		if (fast == 1) {

			return true;
		} else {
			return false;
		}

	}

	public int sub(int n) {

		int max = 0;

		while (n != 0) {

			max += (n % 10) * (n % 10);

			n /= 10;

		}

		return max;

	}
}
