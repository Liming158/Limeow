package com.vy.leecode.lianbiao.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/13 11:38
 * @Description: 876. 链表的中间结点
 */
public class Question9 {

	public ListNode middleNode(ListNode head) {

		ListNode slow;
		ListNode fast;
		try {
			slow = head.next;
			fast = head.next.next;
		} catch (Exception e) {

			return head;
		}

		while (fast!=null && fast.next != null){

			slow = slow.next;

			fast = fast.next.next;

		}

		return slow;

	}

}
