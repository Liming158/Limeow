package com.vy.leecode.tree;

import com.vy.tree.TreeNode;

/**
 * @author: Ellen
 * @Date: 2021/8/17 10:32
 * @Description:
 */
public class Question8 {


	public int minDepth(TreeNode root) {

		if (root == null){

			return 0;

		}

		// null节点不参与比较
		if (root.left == null && root.right != null) {
			return 1 + minDepth(root.right);
		}
		// null节点不参与比较
		if (root.right == null && root.left != null) {
			return 1 + minDepth(root.left);
		}

		return Math.min(minDepth(root.left),minDepth(root.right)) + 1;

	}
}
