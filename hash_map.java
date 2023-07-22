package leetcode;
import java.util.*;
public class hash_map {
public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	String names[]={"Ismail","Kavin","Lingesh"};
	int age[]= {19,21,20};
	
	LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
	for(int i=0;i<age.length;i++) {
			map.put(age[i], names[i]);
	}
	Arrays.sort(age);
//	for(int i=0;i<age.length;i++) {
//		System.out.println(map.get(age[i]));
//	}
	for(Map.Entry i : map.entrySet()) {
		System.out.println(i.getKey()+" "+i.getValue());
	}
}
}
