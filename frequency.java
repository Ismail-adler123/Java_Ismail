package leetcode;
import java.util.*;
public class frequency {
public static void main(String args[]) {
	int arr[]= {1,1,2,2,2,3};
	ArrayList<Integer> lst1 = new ArrayList<>();
	HashSet<Integer> hst = new HashSet<>();
	for(int i=0;i<arr.length;i++) {
		lst1.add(arr[i]);
		hst.add(arr[i]);
	}
	ArrayList<Integer> lst2 = new ArrayList<>(hst);
	for(int i=0;i<lst2.size();i++) {
		System.out.println(Collections.frequency(lst1, lst2.get(i)));
	}
}
}
