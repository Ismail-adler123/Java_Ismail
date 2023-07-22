package leetcode;
import java.util.*;
public class no_leading_zeros {
public static void main(String args[]) {
	int n=16;
	int i=0;
	while(n!=0){
		n=n/2;
		i++;
	}
	System.out.println(32-i);
}
}
