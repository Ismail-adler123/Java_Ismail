package recursion;
import java.util.*;

public class palindrome {
	public static boolean rev(String s,int start,int end) {
		if(start>end) {
			return true;
		}
		return (s.charAt(start)==s.charAt(end) && rev(s,start+1,end-1));
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s="MALAYALAM";
		int start=0;
		int end=s.length()-1;
		if(rev(s,start,end)) {
			System.out.print("palindrome");
		}
		else {
			System.out.print("Not a palindrome");
		}
	}
}
