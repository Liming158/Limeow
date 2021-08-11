package com.vy.leecode.tree;

import com.vy.tree.TreeNode;

/**
 * @author: Ellen
 * @Date: 2021/8/11 11:04
 * @Description:
 */
public class Question3 {

	public boolean isSymmetric(TreeNode root) {

		if (root.left ==null && root.right == null){

			return true;

		}

		if (root.left ==null || root.right == null){
			return false;
		}

		return isSameTree(root.left,root.right);

	}
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == q) {
			return true;
		}

		if (p == null || q == null) {
			return false;
		}


		if (p.val != q.val) {

			return false;

		}

		return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);

	}
}
