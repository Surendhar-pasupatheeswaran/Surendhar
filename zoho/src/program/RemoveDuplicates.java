package program;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void removeDuplicates(int[]nums) {
		int distinct;
		
		int []arr=new int [nums.length];
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]!=nums[j]) {
					arr[i]=arr[i]+nums[i];
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
	}
	
	public static void main(String[] args) {
		int[]n= {10,20,30,10};
		
		removeDuplicates(n);
	}

}
