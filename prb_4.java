package leetcode;
import java.util.*; // frequency

public class prb_4 {
public static void main(String args[]) {
	String s="abbbcef";
	int arr[]=new int[26];
	for(int i=0;i<s.length();i++) {
		arr[s.charAt(i)-'a']++;
	}
	for(int i=0;i<26;i++) {
		if(arr[i]>2) {
			char c=(char)(i+97);
			System.out.print(c);
		}
	}
}
}
