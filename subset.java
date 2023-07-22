package leetcode;
import java.util.*;
public class subset {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
//subset in java
		String s="abacaba";
		int n=s.length();
		int l=0;
		String arr[]=new String[n*(n+1)/2];
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				arr[l++]=s.substring(i,j+1);
			}
		}
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
//subsequence in java

//		String s="abc";
//		List<String> lst = new ArrayList<>();
//		check(lst,0,s);
		
	}
//	public static void check(List<String>lst,int index,String s) {
//		if(index==s.length()) {
//			System.out.println(lst);
//			return;
//		}
//		else {
//			check(lst,index+1,s);
//			lst.add(s.charAt(index)+"");
//			check(lst,index+1,s);
//			lst.remove(lst.size()-1);
//			
//			
//		}
//	}
	

}
