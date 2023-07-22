package practice;
import java.util.*;
public class arr9 {
	public static void main(String args[]) {
		String s="hugued";
		int a=s.length()/2;
		String str[]=new String[2];
		int k=0;
		for(int i=0;i<s.length();i+=a) {
			String temp="";
			for(int j=0;j<a;j++) {
				temp=temp+s.charAt(i+j);
			}
			str[k]=temp;
			k++;
		}
		reverse(str);
	}
	public static void reverse(String str[]) {
		for(int i=0;i<str.length;i++) {
			String res=str[i];
//			System.out.println(res);
			for(int j=res.length()-1;j>=0;j--) {
				System.out.print(res.charAt(j));
			}
		}
	}
}
