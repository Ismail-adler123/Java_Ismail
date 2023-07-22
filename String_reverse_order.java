package recursion;
import java.util.*;

public class String_reverse_order {
	public static void reverse(String s,int n) {
		if(n<0) {
			return;
		}
		System.out.print(s.charAt(n));
		reverse(s,n-1);
		
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s="Ismail";
		reverse(s,s.length()-1);
	}
}
