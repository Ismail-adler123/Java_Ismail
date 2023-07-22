package leetcode; // pascals Triangel
import java.util.*;
public class prb_5 {
public static void main(String args[]) {
	int n=10;
	for(int i=1;i<=n;i++) {
		for(int k=i;k<n;k++) {
			System.out.print(" ");
		}
		int c=1;
		for(int j=1;j<=i;j++) {
			System.out.print(c+" ");
			c=c*(i-j)/j;
		}
		System.out.println();
	}
}
}
