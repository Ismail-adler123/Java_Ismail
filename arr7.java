package practice;
import java.util.*;
public class arr7 {
	public static void main(String args[]) {
		int arr[]= {2,10,20,-5,40,60,90,1,100};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-1;j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(arr[arr.length-2]);
	}
}
