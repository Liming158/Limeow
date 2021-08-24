package com.vy.leecode.tree;

import com.vy.tree.TreeNode;

/**
 * @author: Ellen
 * @Date: 2021/8/24 10:27
 * @Description:
 */
public class Question12 {

	int res = 0;

	public int sumOfLeftLeaves(TreeNode root) {

		if (root == null) {
			return 0;
		}
		//判断节点是否是左叶子节点，如果是则将它的和累计起来
		if (root.left != null && root.left.left == null && root.left.right == null) {
			res += root.left.val;
		}
		sumOfLeftLeaves(root.left);
		sumOfLeftLeaves(root.right);
		return res;
	}
}
