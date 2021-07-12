package com.vy.leecode.lianbiao.easy;

/**
 * @author: Ellen
 * @Date: 2021/7/12 14:41
 * @Description: 83. 删除排序链表中的重复元素
 */
public class Question7 {

	public ListNode deleteDuplicates(ListNode head) {

		ListNode cur = head;

		ListNode flag = head.next;

		while (flag!=null){

			if (flag.val==cur.val){

				cur.next = flag.next;

				flag = cur.next;

			}else {

				cur = cur.next;

				flag = flag.next;

			}

		}

		return head;

	}

}
