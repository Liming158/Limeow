package com.vy.leecode.tree;

import com.vy.tree.TreeNode;

/**
 * @author: Ellen
 * @Date: 2021/8/25 10:09
 * @Description: 剑指 Offer 27. 二叉树的镜像
 */
public class Question13 {

	public TreeNode mirrorTree(TreeNode root) {

		if (root == null){

			return null;

		}

		mirrorTree(root.left);

		mirrorTree(root.right);

		TreeNode flag = root.left;

		root.left = root.right;

		root.right = flag;

		return root;

	}

}
