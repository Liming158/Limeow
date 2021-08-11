package com.vy.leecode.tree;

import com.vy.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Ellen
 * @Date: 2021/8/11 10:50
 * @Description:
 */
public class Question2 {

	List listP = new ArrayList();

	List listQ = new ArrayList();

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

		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);


	}


}
