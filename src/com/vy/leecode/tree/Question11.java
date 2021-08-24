package com.vy.leecode.tree;

import com.vy.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Ellen
 * @Date: 2021/8/24 10:11
 * @Description: 257. 二叉树的所有路径
 */
public class Question11 {

	List list = new ArrayList();

	public List<String> binaryTreePaths(TreeNode root) {

		if (root == null) {

			return list;

		}

		solve(root,"",list);

		return list;

	}

	public void solve(TreeNode treeNode, String str, List list) {

		if (treeNode == null){

			return;

		}

		str += treeNode.val;

		if (treeNode.right == null && treeNode.left == null){

			list.add(str);

		}else {

			solve(treeNode.left,str+"->",list);
			solve(treeNode.right,str+"->",list);

		}

	}

}
