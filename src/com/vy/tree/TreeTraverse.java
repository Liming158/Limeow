package com.vy.tree;

/**
 * @author: Ellen
 * @Date: 2021/8/11 10:12
 * @Description:
 */
public class TreeTraverse {

	public void preTraverse(TreeNode treeNode){
		if (treeNode == null){
			return;
		}
		System.out.println(treeNode.val);
		preTraverse(treeNode.left);
		preTraverse(treeNode.right);
	}
	public void midTraverse(TreeNode treeNode){
		if (treeNode == null){
			return;
		}
		System.out.println(treeNode.val);
		midTraverse(treeNode.left);
		midTraverse(treeNode.right);
	}
	public void postTraverse(TreeNode treeNode){
		if (treeNode == null){
			return;
		}
		System.out.println(treeNode.val);
		postTraverse(treeNode.left);
		postTraverse(treeNode.right);
	}

}
