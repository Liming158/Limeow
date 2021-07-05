package com.vy.leecode.shuzu.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/5 10:27
 * @Description: 买卖股票的最佳时机 II 给定一个数组 prices ，其中 prices[i] 是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question5 {

	public int maxProfit(int[] prices) {

		int i = 0;

		int low = prices[0];

		int max = 0;

		for (int j = 1; j < prices.length; j++) {

			if (prices[j] < low) {

				low = prices[j];

				i++;

			} else {

				while (true) {

					j++;
					i++;

					if (j >= prices.length) {

						max += prices[i] - low;

						break;

					}

					if (prices[j] < prices[i]) {

						max += prices[i] - low;

						low = prices[j];

						i++;

						break;

					}

				}

			}

		}

		return max;

	}
}
