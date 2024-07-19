package array;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Function;

public class FindingOFLargestNumberInanArray_ReturnsTrueIFremainingelementsareitsdivisor {

	public static int largestNumber(int []arr,int temp) {
		
		for(int i=0;i<arr.length;i++) {
			if(temp%arr[i]==0) {
			
			}
			else {
				return -1;
			}
		}
		
		return 1;
		
	}
	public static void main(String[]args) {
		int []arr= {1,2,6,3};
		int temp=Arrays.stream(arr).max().getAsInt();
		System.out.println(largestNumber(arr,temp));
		
		
		}
	
}
