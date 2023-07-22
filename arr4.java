package practice;
import java.util.*;

public class arr4 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s="abcdefgh";
		int n=4;
		for(int i=n;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}
		for(int i=0;i<n;i++) {
			System.out.print(s.charAt(i));
		}
	}
}
