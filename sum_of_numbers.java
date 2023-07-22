package recursion;
import java.util.*;

public class sum_of_numbers {
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n+sum(n-1);
		}
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(sum(n));
	}
}
