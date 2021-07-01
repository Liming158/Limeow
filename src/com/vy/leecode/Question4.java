package com.vy.leecode;

/**
 * @author: Ellen
 * @Date: 2021/7/1 10:08
 * @Description: 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question4 {

	public static void main(String[] args) {
		Boolean valid = isValid("(([]){})");
		System.out.println(valid);
	}

	public static Boolean isValid(String s){

		int length = s.length();

		for (int i = 0; i <= length/2; i++) {

			s = s.replace("()","");

			s=s.replace("[]","");

			s= s.replace("{}","");

		}
		System.out.println(s);
		return s.equals("");


	}

}
