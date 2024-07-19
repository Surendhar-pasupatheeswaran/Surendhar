package array;

public class MinSizeArray {
  
	
	public int minSubArrayLen(int target, int[] nums) {
        int start=0;int end=0;
        int window=Integer.MAX_VALUE;
        int currentSum=0;

        for(end=0;end<nums.length;end++){
            currentSum+=nums[end];

            while(currentSum>=target){
                window=Math.min(window,end-start+1);
                currentSum-=nums[start];
                start++;
            }

        }
        return window==Integer.MAX_VALUE?0:window;

    }

    public static void main(String[]args) {
    	int target=4;
    	int []nums= {1,2,4};
    	MinSizeArray p=new MinSizeArray();
    	
    	System.out.println(p.minSubArrayLen(target, nums));
    }
    
}