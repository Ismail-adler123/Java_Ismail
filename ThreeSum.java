package leetcode;
import java.util.*;

public class ThreeSum {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		HashSet<List<Integer>> hst = new HashSet<>();
		ArrayList<Integer> l = new ArrayList<>();
		int arr[] = {-1,0,1,2,-1,-4};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						l.add(arr[i]);
						l.add(arr[j]);
						l.add(arr[k]);
						Collections.sort(l);
						hst.add(l);
						l=new ArrayList<>();
						
					}
				}
			}
		}

		System.out.println(new ArrayList<>(hst));
	}

}