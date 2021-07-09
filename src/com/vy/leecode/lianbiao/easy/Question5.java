package com.vy.leecode.lianbiao.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/1 10:26
 * @Description: 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class Question5 {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode head = new ListNode();

		ListNode cure = head;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {

				cure.next = l1;

				cure = cure.next;

				l1 = l1.next;

			} else {
				cure.next = l1;

				cure = cure.next;

				l2 = l2.next;

			}

		}

		if (l1 == null) {

			cure.next = l2;

		} else {

			cure.next = l1;

		}
		return head.next;
	}
}