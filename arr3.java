package practice;
import java.util.*;
public class arr3 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s="hello master";
		int size=3;
		int len=s.length()/size;
		String str[]=new String[len];
		int k=0;
		for(int i=0;i<s.length();i+=size) {
			String p="";
			for(int j=0;j<size;j++) {
			    p=p+s.charAt(i+j);
			}
			str[k]=p;
			k++;
		}
		find(str);
		
	}
	public static void find(String str[]) {
		for(int i=0;i<str.length;i++) {
			String q=str[i];
			for(int j=q.length()-1;j>=0;j--) {
				System.out.print(q.charAt(j));
			}
		}
	}
}
