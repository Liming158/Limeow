package com.vy.leecode.lianbiao.easy;

import java.util.HashMap;

/**
 * @author: Ellen
 * @Date: 2021/7/12 11:17
 * @Description: 160. 相交链表 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。
 */
public class Question6 {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		ListNode cur = headA;

		ListNode flag = headB;

		HashMap<ListNode, Integer> map = new HashMap<>();

		while (cur!=null){

			map.put(cur,0);

			cur = cur.next;

		}

		while (flag!=null){

			if (map.get(flag)!=null){

				return flag;

			}

			flag = flag.next;

		}

		return null;

	}
}