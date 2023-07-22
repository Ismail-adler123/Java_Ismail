package practice;
import java.util.*;

public class arr10 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int arr[]= {10,12,5,40,21,70,1,49,37};
		ArrayList<Integer>lst = new ArrayList<>();
		int k=0;
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					count++;
					
				}
			}
			lst.add(count);
		}
		for(int i=0;i<lst.size();i++) {
			System.out.print(lst.get(i)+" ");
		}
	}
}
