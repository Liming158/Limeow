package com.vy.leecode.tree;

import com.vy.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Ellen
 * @Date: 2021/8/11 10:37
 * @Description:
 */
public class Question1 {
	List list = new ArrayList<TreeNode>();
	public List<Integer> inorderTraversal(TreeNode root) {

		midTraverse(root);

		return list;

	}
	public void midTraverse(TreeNode treeNode){
		if (treeNode == null){
			return ;
		}
		midTraverse(treeNode.left);
		list.add(treeNode.val);
		midTraverse(treeNode.right);
	}
}
