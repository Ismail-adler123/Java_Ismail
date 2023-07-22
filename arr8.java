package practice;
import java.util.*;

public class arr8 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s="Hello";
		String p="123";
		for(int i=0;i<p.length();i++) {
			System.out.print(s.charAt(i));
			System.out.print(p.charAt(i));
		}
		if(s.length()>p.length()) {
			int diff1=s.length()-p.length()+1;
			
			for(int i=diff1;i<s.length();i++) {
				System.out.print(s.charAt(i));
			}
		}
		else {
			int diff2=p.length()-s.length();
			for(int i=diff2;i<s.length();i++) {
				System.out.print(s.charAt(i));
			}
		}
		
	}
}
