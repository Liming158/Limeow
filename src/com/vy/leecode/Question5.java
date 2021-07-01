package com.vy.leecode;

import com.vy.leecode.Question1.ListNode;
import com.vy.sort.ChoseSort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author: Ellen
 * @Date: 2021/7/1 10:26
 * @Description: 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class Question5 {

	class ListNode {

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

		public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

			ListNode head = new ListNode();

			ListNode cure = head;

			while (l1 != null && l2 != null) {
				if (l1.val < l2.val) {

					cure.next=l1;

					cure= cure.next;

					l1 = l1.next;

				}else {
					cure.next=l1;

					cure= cure.next;

					l2 = l2.next;

				}

			}

			if (l1==null){

				cure.next = l2;

			}else {

				cure.next=l1;

			}
			return head.next;
		}
	}
}
