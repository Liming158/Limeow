package com.vy.leecode.lianbiao.easy;

import java.util.ArrayList;

/**
 * @author: Ellen
 * @Date: 2021/7/8 11:39
 * @Description:
 */
public class Question3 {

	public boolean hasCycle(ListNode head) {

		ListNode listNode = head;

		ArrayList<ListNode> list = new ArrayList<>();

		while (listNode != null) {

			for (ListNode n : list) {

				if (listNode.next == n) {
					return true;
				}

			}

			list.add(listNode);

			listNode = listNode.next;

		}

		return false;

	}

	/**
	 * 快慢链表
	 */
	public boolean hasCycle2(ListNode head) {

		ListNode fast = head;

		ListNode slow = head;

		while (true) {

			try {

				fast = fast.next.next;

				slow = slow.next;

			} catch (Exception e) {

				return false;

			}

			if (fast == slow) {

				return true;

			}

		}
	}

}
