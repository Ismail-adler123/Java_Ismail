package leetcode;
import java.util.*;

public class prb_3 {
public static void main(String args[]) {
	int head[]= {3,0,2,6,8,1,7,9,4,2,5,5,0};
	ArrayList<Integer> lst = new ArrayList<>();
	for(int i=0;i<head.length;i++) {
		lst.add(head[i]);
	}
	int m=3;
	int n=5;
	for(int i=head.length;i<m*n;i++) {
		lst.add(-1);
	}
	int arr[][]=new int[m][n];
	int rs=0;
	int re=n-1;
	int cs=0;
	int ce=n-1;
	int index=0;
//	System.out.println(lst);
	while(cs<=ce && rs<=re ) {
		for(int i=cs;i<=ce;i++) arr[rs][i]=lst.get(index++);
        for(int i=rs+1;i<=re;i++) arr[i][ce]=lst.get(index++);
        if(cs<ce && rs<re){
            for(int i=ce-1;i>cs;i--) arr[re][i]=lst.get(index++);
            for(int i=re;i>rs;i--) arr[i][cs]=lst.get(index++);
        }
        rs++;
        cs++;
        re--;
        ce--;
        }
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
}
}

