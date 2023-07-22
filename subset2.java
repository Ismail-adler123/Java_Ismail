package leetcode;
import java.util.*;  // leetcode - 409 longest palindrome

public class subset2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s="aabccccdd";
//		String s="ccc";
		int n=s.length();
		int arr[]=new int[26];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a']++;
		}
		int odd=0;
		int even=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				odd++;
			}
		}
		if(odd>0) {
			System.out.println(n - odd + 1);
			return;
		}
		System.out.println(n);
		
		
	        
	}
}
