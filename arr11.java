package practice;
import java.util.*;

public class arr11 {
	public static void main(String args[]) {
		String s="24";
		int n=Integer.parseInt(s);
		int arr[]= {2,3,5,7};
		
		String t="";
		for(int i=0;i<arr.length;i++) {
			int count=0;
			if(n==1) {
				break;
			}
			while(n%arr[i]==0) {
				count++;
				n=n/arr[i];
			}
			 t=t+(arr[i]+"^"+count+"X");
			
		}
		for(int i=0;i<t.length()-1;i++) {
			System.out.print(t.charAt(i));
		}
	}
}
