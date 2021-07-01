package com.vy.leecode;

/**
 * @author: Ellen
 * @Date: 2021/6/24 19:00
 * @Description: 两数相加 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question1 {

	public class ListNode {

		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {

		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

			ListNode root = new ListNode();

			ListNode cursor = root;

			int flag = 0;

			while (l1 != null || l2 != null || flag != 0) {

				int v1 = l1 == null ? 0 : l1.val;

				int v2 = l2 == null ? 0 : l2.val;

				int sum = v1 + v2 + flag;

				//两数相加是否大于10 如果是则进1 将该1赋给flag
				flag = sum / 10;

				ListNode listNode = new ListNode(sum % 10);

				cursor.next = listNode;

				cursor = listNode;

				if (l1!=null) {l1 = l1.next;}

				if (l2!=null) {l2 = l2.next;}

			}

			return root.next;

		}


	}

}
