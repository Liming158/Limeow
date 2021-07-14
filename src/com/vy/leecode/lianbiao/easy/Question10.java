package com.vy.leecode.lianbiao.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/14 10:06
 * @Description: 剑指 Offer 18. 删除链表的节点
 */
public class Question10 {

	public ListNode deleteNode(ListNode head, int val) {

		while (head != null && head.val == val) {

			head = head.next;

		}

		if (head == null) {

			return null;

		}

		ListNode cur = head;

		ListNode flag = head.next;

		while (flag != null) {

			if (flag.val == val) {

				cur.next = flag.next;

			}

			cur = cur.next;

			flag = flag.next;

		}

		return head;

	}

}
