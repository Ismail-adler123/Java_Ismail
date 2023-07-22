package leetcode;
import java.util.*;
public class Relative_Ranks {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int score[]= {5,4,3,2,1};
		int n=score.length;
        ArrayList<Integer> lst = new ArrayList<>();
        String res[]=new String[n];

        for(int i=0;i<score.length;i++){
            lst.add(score[i]);
        }
        Collections.sort(lst);
        Collections.reverse(lst);
      

        for(int i=0;i<lst.size();i++){
            for(int j=0;j<score.length;j++){
                if(lst.get(i)==score[j] && i==0){
                    res[j]="Gold Medal";
                    
                }
                else if(lst.get(i)==score[j] && i==1){
                	res[j]="Silver Medal";
                	
                }
                else if(lst.get(i)==score[j] && i==2){
                	res[j]="Bronze Medal";
                	
                }
                else if(lst.get(i)==score[j]){
                	res[j]=(i+1)+"";
                	
                }

            }
        }
        for(int i=0;i<res.length;i++) {
        	System.out.print(res[i]+" ");
        }
//       
	}

}
