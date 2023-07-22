package recursion;
import java.util.*;

public class permutation2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n=4;
		String res="";
		for(int i=2;i<=(n+1)-1;i++) {
			res+=(char)(96+i);
		}
		res+=(char)(96+1);
		
		System.out.println(res);
	}
}
