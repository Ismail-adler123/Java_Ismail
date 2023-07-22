package practice;

import java.util.Scanner;
import java.util.Stack;

public class sample {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s=in.next();
		int max=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String sub=s.substring(i,j);
				if(isValid(sub)) {
//					if(max<sub.length()) {
						max=sub.length();
//					}
				}
			}
		}
		System.out.println(max);
	}
	public static boolean isValid(String s) {
		Stack<Character> st = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='(') {
				st.push(ch);
			}
			if(ch==')') {
				if(!st.isEmpty()) {
					char c = st.pop();
					if(c!='(') {
						return false;
					}
				}
				else {
					return false;
				}
			}
		}
		if(st.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		
	}
}

