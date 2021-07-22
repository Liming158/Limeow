package com.vy.leecode.sort.easy;

import java.util.Arrays;

/**
 * @author: Ellen
 * @Date: 2021/7/22 14:32
 * @Description:
 */
public class Question8 {

	public boolean CheckPermutation(String s1, String s2) {
		char[] c1 = s2.toCharArray();

		char[] c2 = s1.toCharArray();

		Arrays.sort(c1);

		Arrays.sort(c2);

		for(int i = 0 ; i < c1.length ; i ++){
			if(c1[i] != c2[i]){
				return false;
			}
		}
		return true;
	}

}
