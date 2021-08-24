package com.vy.leecode.tree;

import com.vy.tree.TreeNode;

/**
 * @author: Ellen
 * @Date: 2021/8/23 10:25
 * @Description: 235. 二叉搜索树的最近公共祖先
 */
public class Question10 {

	TreeNode res;

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		lca(root, p, q);

		return res;

	}

	public void lca(TreeNode root, TreeNode p, TreeNode q) {

		if (root == null) {
			return;
		}

		if ((root.val - p.val) * (root.val - q.val) <= 0) {

			res = root;

		} else if (root.val < p.val && root.val < q.val) {

			lca(root.left, p, q);

		} else {

			lca(root.right, p, q);

		}


	}


}
