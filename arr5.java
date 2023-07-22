package practice;
import java.util.*;

public class arr5 {
	public static void main(String args[]) {
		String s="aaaaabrrr";
		ArrayList<Character> lst = new ArrayList<>();
		HashSet<Character>hst = new HashSet<>();
		for(int i=0;i<s.length();i++) {
			lst.add(s.charAt(i));
			hst.add(s.charAt(i));
		}
		ArrayList<Character> lst2 = new ArrayList<>(hst);
		for(int i=0;i<lst2.size();i++) {
			System.out.print(lst2.get(i));
			System.out.print(Collections.frequency(lst,lst2.get(i)));
		}
	}
}
