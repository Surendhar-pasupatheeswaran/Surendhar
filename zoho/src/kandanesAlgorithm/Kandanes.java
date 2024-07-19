package kandanesAlgorithm;

public class Kandanes {
	public static int MaxSubarray(int[]num) {
		int sum=0;
		int max=num[0];
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
			if(sum>max) {
				max=sum;
				
			}
			if(sum<0) {
				sum=0;
			}
		}			return max;

	}
	public static void main(String []args) {
		int [] arr= {0,5,6,0,9,0,1,4};
		System.out.println(MaxSubarray(arr));
		
	}

}
