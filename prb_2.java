package leetcode; // spiral matrix -2;

public class prb_2 {
public static void main(String args[]) {
	int n=3;
	int rs=0;
	int re=n-1;
	int cs=0;
	int ce=n-1;
	int arr[][]=new int[n][n];
	int index=1;
	
	while(cs<=ce && rs<=re) {
		for(int i=cs;i<=ce;i++) arr[rs][i]=index++;
        for(int i=rs+1;i<=re;i++) arr[i][ce]=index++;
        if(cs<ce && rs<re){
            for(int i=ce-1;i>cs;i--) arr[re][i]=index++;
            for(int i=re;i>rs;i--) arr[i][cs]=index++;
        }
        rs++;
        cs++;
        re--;
        ce--;
        }
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}

/*
1 2 3 
8 9 4
7 6 5
*/