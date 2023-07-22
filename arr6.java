package practice;
import java.util.*;

public class arr6 {
	public static void main(String args[]) {
		String s ="a5br3";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			String q="";
			if(Character.isDigit(ch)) {
				 q=q+ch;
				int t=Integer.parseInt(q);
				for(int j=0;j<t;j++) {
					System.out.print(s.charAt(i-1));
				}
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}
}
