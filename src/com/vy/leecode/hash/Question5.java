package com.vy.leecode.hash;

import com.vy.leecode.lianbiao.easy.ListNode;

/**
 * @author: Ellen
 * @Date: 2021/8/5 10:25
 * @Description: 剑指 Offer 52. 两个链表的第一个公共节点
 */
public class Question5 {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headA == null || headB == null) {

			return null;

		}

		ListNode n1 = headA;

		ListNode n2 = headB;

		while (n1 != n2) {

			n1 = n1 == null ? headB : n1.next;

			n2 = n2 == null ? headA : n2.next;

		}

		return n1;

	}

}
