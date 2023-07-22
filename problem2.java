package practice;
import java.util.*;

public class problem2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		int ans=0;
		int frds=in.nextInt();
		for(int i=0;i<arr.length;i++) {
			int left[]=Arrays.copyOfRange(arr,0,i);
			int right[]=Arrays.copyOfRange(arr, i, arr.length);
			int res[]=new int[left.length+right.length];
			System.arraycopy(right, 0, res, 0, right.length);
			System.arraycopy(left, 0, res, right.length, left.length);
			
			int sum=0;
			for(int j=0;j<res.length;j+=frds) {
				sum=sum+res[j];
			}
			if(ans<sum) {
				ans=sum;
			}
		}
		System.out.println(ans);
	
	}
}
