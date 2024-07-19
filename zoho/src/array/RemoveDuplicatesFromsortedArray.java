package array;

import java.util.Scanner;

public class RemoveDuplicatesFromsortedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr= {3,2,2,3};
		int key=3;
		removeelement(arr,key);
	}

	private static void removeelement(int[] arr,int key) {

		int count=0;
		
		for(int a:arr) {
			if(a!=key) {
				count++;
			}
		}
		int [] a=new int[count];
		int index=0;
		for(int i:arr) {
		if(i!=key) {
			a[index++]=i;
		}
		}
		for(int i=0;i<a.length;i++)
		
		System.out.println(a[i]);
		
	}
	
}
