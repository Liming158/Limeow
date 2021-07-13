package com.vy.leecode.lianbiao.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/13 11:19
 * @Description: 203. 移除链表元素
 */
public class Question8 {

	public ListNode removeElements(ListNode head, int val) {

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

				flag = flag.next;

				cur.next = flag;

			} else {

				cur = cur.next;

				flag = flag.next;

			}

		}

		return head;

	}

}
