package com.vy.leecode.hash;

import com.vy.leecode.lianbiao.easy.ListNode;
import java.util.HashMap;

/**
 * @author: Ellen
 * @Date: 2021/8/6 10:02
 * @Description: 面试题 02.01. 移除重复节点
 */
public class Question8 {

	public static ListNode removeDuplicateNodes(ListNode head) {

		ListNode listNode = new ListNode();

		ListNode Node = head;

		ListNode flag = listNode;

		HashMap<Integer, Integer> map = new HashMap<>();

		while (Node != null) {

			if (map.get(Node.val) != null) {

				Node = Node.next;

				continue;

			}

			map.put(Node.val, 0);

			flag.next = Node;

			Node = Node.next;

			flag = flag.next;

			flag.next = null;


		}

		return listNode.next;

	}

}
