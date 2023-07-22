package leetcode;
import java.util.*;
public class prb_6 {
	
public static void main(String args[]) {
	int arr[] = {1,2,3,4,5,6,7};
	int k = 3;

     for(int i=0;i<k;i++){
         int first = arr[i];
         for(int j=0;j<arr.length-1;j++){
             arr[j] = arr[j+1];
         }
         arr[arr.length-1] = first;
     }
     for(int m=0;m<arr.length;m++){
         System.out.print(arr[m]+" ");
     }
     System.out.println();

    

}
}
