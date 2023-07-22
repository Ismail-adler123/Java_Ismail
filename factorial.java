package recursion;

import java.util.Scanner;

public class factorial {
	public static int find(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*find(n-1);
		}
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(find(n));
	}
}
