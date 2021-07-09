package com.vy.leecode.lianbiao.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/9 10:14
 * @Description: 234. 回文链表
 */
public class Question4 {

	public boolean isPalindrome(ListNode head) {

		//反转后半部分链表

		ListNode fast = head;

		ListNode slow = head;

		while (fast != null && fast.next != null) {

			fast = fast.next.next;

			slow = slow.next;

		}

		//此时slow为链表中间节点

		slow = reverse(slow);

		while (slow!=null){

			if (head.val!=slow.val){
				return false;
			}

			head = head.next;

			slow = slow.next;

		}

		return true;

	}

	/**
	 经典链表反转
	 */
	public static ListNode reverse(ListNode head) {

		if (head.next == null) {

			return head;

		}

		ListNode reverse = reverse(head.next);

		head.next.next = head;

		head.next = null;

		return reverse;

	}
}
