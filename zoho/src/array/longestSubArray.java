package array;

public class longestSubArray {
	    public static int longestSubarray(int[] nums) {
	        int start=0;
	        int longestArray=0;
	    int zeroCount=0;
	        for(int i=0;i<nums.length;i++){
	            zeroCount+=nums[i]==0?1:0;


	            while(zeroCount>1){
	                zeroCount-=nums[start]==0?1:0;
	                start++;
	            }
	            longestArray=Math.max(longestArray,i-start);
	        }
	        return longestArray;
	    }
	public static void main(String[] args) {

		int []nums= {0,1,1,1,0,1,1,0,1};
		
		System.out.println(longestSubarray(nums));
	}

}
