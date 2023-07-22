package leetcode;
import java.io.*;
import java.util.*;

public class BinaryCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[]= {1,2,3};
        List<Integer> list = new ArrayList<>();
        helper(list,0,arr);
    }
    public static void helper(List<Integer> list,int ind,int arr[]) {
    	if(ind == arr.length) {
    		System.out.println(list);
    		return;
    	}
    	helper(list,ind+1,arr);
    	list.add(arr[ind]);
    	helper(list,ind+1,arr);
    	list.remove(list.size()-1);
    }
}