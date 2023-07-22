package recursion;
import java.util.*;

public class permutaion {
	static List<List<String>> lst = new ArrayList<>();
	static List<String> ls=new ArrayList<>();
	public static void main(String args[]) {
		String s="ABC";
		int l=0;
		int r=s.length()-1;
		permute(s,l,r);
		System.out.println(lst);
	}
	public static void permute(String str,int l,int r) {
		if(l==r) {
			ls.add(str);
			lst.add(new ArrayList<>(ls));
			ls.clear();
		}
		else {
			
			for(int i=l;i<=r;i++) {
				str=swap(str,l,i);
				permute(str,l+1,r);
				str=swap(str,l,i);
			}
		}
	}
	public static String swap(String str,int i,int j) {
		char ch[]=str.toCharArray();
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return String.valueOf(ch);
	}
}
