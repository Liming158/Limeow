package com.vy.leecode.lianbiao.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/8 10:35
 * @Description: 206. 反转链表
 */
public class Question2 {

	public ListNode reverseList(ListNode head) {

		ListNode listNode = new ListNode();

		ListNode cur;

		while (head.next != null){

			cur = head;

			head = head.next;

			cur.next = listNode.next;

			listNode.next = cur;

		}

		return listNode.next;

	}

}
