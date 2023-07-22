package leetcode;
import java.util.*;

public class prb_1 {
public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	String s="11111222223";
	int k=3;
	while(true) {
	int sum=0;
	String temp="";
	for(int i=0;i<s.length();i++) {
		sum+=s.charAt(i)-'0';
		if((i+1)%k==0) {
			temp+=sum;
			sum=0;
		}
	}
	if(s.length()%k != 0) {
		temp+=sum;
	}
	if(temp.length()<=k) {
		System.out.println(temp);
		return;
	}
	else {
		s=temp;
	}
	}
	
}
}
